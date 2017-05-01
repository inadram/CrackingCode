package Moderate.Ten;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.Map;

public class EncodeXML {
	private Map<String, String> rules;

	public EncodeXML(Map<String, String> rules) {
		this.rules = rules;
	}

	StringBuilder stringBuilder = new StringBuilder();

	public String encode(Document xml) {

		Element documentElement = xml.getDocumentElement();
		readElement(documentElement);
		NodeList childNodes = documentElement.getChildNodes();
		for (int i = 0; i < childNodes.getLength(); i++) {
			readNode(childNodes.item(i));
			stringBuilder.append("0").append(" ");
		}
		stringBuilder.append("0").append(" ");
		return stringBuilder.toString();
	}

	private void readNode(Node item) {
		stringBuilder.append(rules.get(item.getNodeName()));
		NamedNodeMap attributes = item.getAttributes();
		readAttributes(attributes);
		stringBuilder.append(item.getTextContent()).append(" ");

	}

	private void readElement(Element documentElement) {
		stringBuilder.append(rules.get(documentElement.getNodeName()));
		NamedNodeMap attributes = documentElement.getAttributes();
		readAttributes(attributes);
	}

	private void readAttributes(NamedNodeMap attributes) {
		for (int i = 0; i < attributes.getLength(); i++) {
			stringBuilder.append(rules.get(attributes.item(i).getNodeName()));
			stringBuilder.append(attributes.item(i).getNodeValue()).append(" ");
		}
		stringBuilder.append("0").append(" ");
	}
}
