package Ex2;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("animal");
        Animal cat = new Animal();
        System.out.println(cat);
        ObjectOutputStream outputStrem = new ObjectOutputStream(new FileOutputStream(file));

        outputStrem.writeObject(cat);
        outputStrem.flush();
        outputStrem.close();
        System.out.println("File was created.\n");

        System.out.println("Creating object from the file.");
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file));
        // Десеріалізуємо об'єкт Car з байт-коду
        Animal catNew = (Animal) inputStream.readObject();
        inputStream.close();
        System.out.println(catNew);

    }
}
