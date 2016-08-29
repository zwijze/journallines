@echo off
SET starterexampledir=C:\Users\zwijze2\Documents\workspace_fz_it\jibx\examples\starter
SET srcdir=%starterexampledir%\src\org\jibx\starter
SET bindir=%starterexampledir%\bin
::Als alternatief van onderstaande verwijderen van bin directory met gecompileerde class file is de een Ant taak: ant clean (zie ook ant help voor allerlei opties, dus niet ant -help. In de build.xml staan de defities van de Ant build)
rmdir %bindir% /s /q
mkdir %bindir%
SET jibxlib=C:\Users\zwijze2\Documents\workspace_fz_it\jibx\lib
echo "compiling Customer.java Person.java Test.java"
::Compile java sources. jibx-run.jar includes packages die geimporteerd worden in Test.java
::Alternatief van onderstaande commando is een Ant taak: ant compile
javac -cp %jibxlib%\jibx-run.jar -d %bindir% %starterexampledir%\src\org\jibx\starter\Customer.java %starterexampledir%\src\org\jibx\starter\Person.java %starterexampledir%\src\org\jibx\starter\Test.java
::Compile binding
::Alternatief van onderstaande commando is een Ant taak: ant bind
::Met dit Ant commando doe je de compile en bind in 1 keer: ant build
echo "compiling binding" 
java -cp bin;%jibxlib%\jibx-bind.jar org.jibx.binding.Compile binding.xml
::Gebruik onderstaande regel om het te testen met het Test.java programma. Data.xml wordt ingelezen en toegekend aan class Customer (unmarshall) en
::vervolgens wordt class Customer weer geouput naar data-out.xml (gemarshalled).
::Alternatief van onderstaande commando is een Ant taak: ant run
echo "Running Test programma"
java -cp %bindir%;%jibxlib%\jibx-run.jar org.jibx.starter.Test data.xml data-out.xml
::Comment onderstaande regel uit om een xsd en binding.xml te genereren o.b.v. gecompileerde binding
::Let op dat velden die als int gedefinieerd zijn in de bindinging xml als attribute worden opgenomen en niet als element!!!
echo "Genereer binding.xml en xsd."
java -cp %jibxlib%\jibx-tools.jar org.jibx.binding.generator.BindGen -p %bindir% -b binding_generated.xml org.jibx.starter.Customer

