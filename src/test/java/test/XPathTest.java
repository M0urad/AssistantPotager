package test;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
 
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
 
public class XPathTest 
{
    public static void main(String[] args) throws Exception 
    {
        //Build DOM
 
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true); // never forget this!
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse("personne.xml");
 
        //Create XPath
 
        XPathFactory xpathfactory = XPathFactory.newInstance();
        XPath xpath = xpathfactory.newXPath();
 
        System.out.println("n/Get rue");
 
        // 1) Get book titles written after 2001
        //XPathExpression expr = xpath.compile("/Personne/adresses/adresse[attribute::rue=6]");
        XPathExpression expr = xpath.compile("/Personne/adresses/adresse[attribute::num=6]/text()");
        Object result = expr.evaluate(doc, XPathConstants.NODESET);
        NodeList nodes = (NodeList) result;

        for (int i = 0; i < nodes.getLength(); i++) {
            System.out.println(nodes.item(i).getNodeValue());
        }
 
        
    }
}