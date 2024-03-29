package eltex.tasks;

import org.w3c.dom.*;
import org.xml.sax.SAXException;
import javax.xml.parsers.*;
import java.io.*;
import java.util.ArrayList;

public class DOM extends Msg {

    private static ArrayList<Msg> msgs = new ArrayList <>();

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newDefaultInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("resources/xml_sample.xml"));
        NodeList msgElements = document.getDocumentElement().getElementsByTagName("msg");

        for (int i = 0; i < msgElements.getLength(); ++i) {
            Node msg = msgElements.item(i);
            NamedNodeMap attributes = msg.getAttributes();
            msgs.add(new Msg(attributes.getNamedItem("to").getNodeValue(), attributes.getNamedItem("from").getNodeValue(), attributes.getNamedItem("title").getNodeValue()));
            System.out.println("Text: " + msg.getTextContent());
        }

        for (Msg msg: msgs) {
            System.out.println(String.format("To %s, from %s, title - %s", msg.getTo(), msg.getFrom(), msg.getTitle()));
        }
    }
}
