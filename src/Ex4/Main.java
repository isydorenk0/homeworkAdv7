package Ex4;

import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {

        File file = new File("jaxb.xml");
        CreateXML.createXML(file);
    }

}
