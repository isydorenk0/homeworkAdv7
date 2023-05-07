package Ex3;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateXML {
    public static void createXML(File file) throws Exception {

        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            Document doc = docBuilder.newDocument();


            List<City> cities = fillData();
            String[] nodes = {"city", "street", "building"};

            Element rootElement = doc.createElement("catalog");
            doc.appendChild(rootElement);
            for (City city : cities) {
                Element address = doc.createElement("address");
                rootElement.appendChild(address);

                Element element = doc.createElement("city");
                element.appendChild(doc.createTextNode(city.getCity()));
                element.setAttribute("size", city.getSize());
                rootElement.appendChild(element);

                element = doc.createElement("street");
                element.appendChild(doc.createTextNode(city.getStreet()));
                rootElement.appendChild(element);

                element = doc.createElement("building");
                element.appendChild(doc.createTextNode(String.valueOf(city.getBuilding())));
                rootElement.appendChild(element);
            }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(file);
            transformer.transform(source, result);

            System.out.println("File was created.");
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    private static List<City> fillData() {
        List<City> cities = new ArrayList<>();
        cities.add(new City("Kyiv", "big", "Khreschatyk", 10));
        cities.add(new City("Lviv", "big", "Obolon", 100));
        return cities;
    }
}
