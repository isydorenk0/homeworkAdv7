package Ex3;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class CityHandler extends DefaultHandler {
    boolean cityb = false;
    boolean streetb = false;
    boolean buildingb = false;
    String citySize = "";

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if(qName.equalsIgnoreCase("city")) {
            cityb = true;
            citySize=attributes.getValue("size");
        }
        if(qName.equalsIgnoreCase("street")) {streetb = true;}
        if(qName.equalsIgnoreCase("building")) {buildingb = true;}
    }
    @Override
    public void characters(char ch[], int start, int length) throws SAXException {

        if (cityb) {
            System.out.println("City: " + new String(ch, start, length) + "\n" +
                    "Size: " + citySize);
            cityb = false;
        } else if (streetb) {
            System.out.println("Street: " + new String(ch, start, length));
            streetb = false;
        } else if (buildingb) {
            System.out.println("Building: " + new String(ch, start, length));
            buildingb = false;
        }
    }

}
