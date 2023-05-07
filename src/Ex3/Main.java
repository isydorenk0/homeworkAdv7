package Ex3;

import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("cities.xml");
        CreateXML.createXML(file);
        ParseXML.parseXML(file);
    }
}
