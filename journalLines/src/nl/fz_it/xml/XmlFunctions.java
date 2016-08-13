package nl.fz_it.xml;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;

public class XmlFunctions {

	private Document doc;
	
	public XmlFunctions(String configFile) throws ParserConfigurationException, SAXException, IOException{
		File xmlFile = new File(configFile);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		doc = dBuilder.parse(xmlFile);
		//optional, but recommended
		//read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
		doc.getDocumentElement().normalize();
	}
	
	//Find first occurence of a tagname and get the value of it
	public String getElementsByTagName(String tagName){
		Node node=doc.getElementsByTagName(tagName).item(0);
		return node.getNodeValue(); 
	}

	//Find itemNbr'th occurence of a tagname in a list of multiple elements having the same tagname and get the value of it
	public String getElementsByTagName(String tagName,int itemNbr){
		Node node=doc.getElementsByTagName(tagName).item(itemNbr);
		return node.getNodeValue(); 
	}	
	
	public String getElementsByTagName(String tagName,String tagnameContainingTagname){
		
		return "";
	}

	
}
