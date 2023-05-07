package Ex4;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;

public class CreateXML {
    public static void createXML(File file) throws JAXBException {

        Addresses addresses = new Addresses();
        addresses.add(new City("Kyiv", "Big", "Obolon", 50));
        addresses.add(new City("Lviv", "Big", "Protasiv", 150));

        System.out.println(Addresses.class.toString());
        JAXBContext contextObj = JAXBContext.newInstance(addresses.getClass());

        Marshaller marshallerObj = contextObj.createMarshaller();
        marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshallerObj.marshal(addresses, file);
    }
}

