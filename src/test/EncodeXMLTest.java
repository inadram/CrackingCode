package test;

import main.Moderate.Ten.EncodeXML;
import org.junit.Test;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class EncodeXMLTest  {

    @Test
    public void test_encode_xml(){
        Map<String,String> rules = new HashMap<String,String>();
        rules.put("family","1 ");
        rules.put("lastName","4 ");
        rules.put("state","5 ");
        rules.put("person","2 ");
        rules.put("firstName","3 ");

        EncodeXML encodeXML = new EncodeXML(rules);
        Document xml = convertStringToDocument("<family lastName=\"McDowell\" state=\"CA\"><person firstName=\"Gayle\">Some Message</person></family>");
        String encode = "1 4 McDowell 5 CA 0 2 3 Gayle 0 Some Message 0 0 ";
        String actual =encodeXML.encode(xml);
        assertEquals(encode,actual);
    }

    private static Document convertStringToDocument(String xmlStr) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        try
        {
            builder = factory.newDocumentBuilder();
            Document doc = builder.parse( new InputSource( new StringReader( xmlStr ) ) );
            return doc;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}