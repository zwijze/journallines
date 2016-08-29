@echo off
SET codegenexampledir=C:\Users\zwijze2\Documents\workspace_fz_it\jibx\examples\codegen
SET srcdir=%codegenexampledir%\src
SET bindir=%codegenexampledir%\bin
SET gendir=%codegenexampledir%\gen\src
SET xsddir=%codegenexampledir%\otasubset
SET xmldir=%codegenexampledir%\samples
::Als alternatief van onderstaande verwijderen van bin directory met gecompileerde class file is de een Ant taak: ant clean (zie ook ant help voor allerlei opties, dus niet ant -help. In de build.xml staan de defities van de Ant build)
rmdir %gendir% /s /q
rmdir %bindir% /s /q
mkdir %bindir%
SET jibxlib=C:\Users\zwijze2\Documents\workspace_fz_it\jibx\lib
::Run codegen voor genereren binding.xml file en java files o.b.v. XSD file.
::Alternatief van onderstaande commando is een Ant taak: ant codegen
echo "Run codegen"
java -cp %jibxlib%\jibx-tools.jar org.jibx.schema.codegen.CodeGen -t %gendir% -w %codegenexampledir%\otasubset\OTA_AirLowFareSearch*.xsd

echo "compiling *.java files in gen/src en ook Test.java"
::Compile java sources. jibx-run.jar includes packages die geimporteerd worden in Test.java
::Alternatief van onderstaande commando is een Ant taak: ant compile
javac -cp %jibxlib%\* -d %bindir% %gendir%\org\opentravel\ota\*.java %codegenexampledir%\src\org\jibx\starter\Test.java

::Bind: Compile binding
::Alternatief van onderstaande commando is een Ant taak: ant bind
echo "Bind:compiling binding" 
java -cp bin;%jibxlib%\* org.jibx.binding.Compile %gendir%\binding.xml
::Gebruik onderstaande regel om het te testen met het Test.java programma. Data.xml wordt ingelezen en toegekend aan class Customer (unmarshall) en
::vervolgens wordt class Customer weer geouput naar data-out.xml (gemarshalled).
::Alternatief van onderstaande commando is een Ant taak: ant run
echo "Running Test programma"
java -cp %bindir%;%jibxlib%\* org.jibx.starter.Test org.opentravel.ota %xmldir%
::Comment onderstaande regel uit om een xsd en binding.xml te genereren o.b.v. gecompileerde binding
::Let op dat velden die als int gedefinieerd zijn in de bindinging xml als attribute worden opgenomen en niet als element!!!
REM echo "Genereer binding.xml en xsd."
REM java -cp %jibxlib%\jibx-tools.jar org.jibx.binding.generator.BindGen -p %bindir% -b binding_generated.xml org.jibx.starter.Customer

