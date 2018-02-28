package lesson18.serialization;

import java.io.*;

public class SerializationParrotDemo {
    public static void main(String[] args) {
        try (
                OutputStream fos = new FileOutputStream("src\\io\\serialized_parrot.txt");
                ObjectOutputStream os = new ObjectOutputStream(fos);
        ) {
            Parrot parrot = new Parrot("Kesha", "white");
            os.writeObject(parrot);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(deserialization("src\\io\\serialized_parrot.txt").toString());
    }

    public static Object deserialization(String path) {
        Object obj = null;
        try (FileInputStream fis = new FileInputStream(path);
             ObjectInputStream ois = new ObjectInputStream(fis)
        ) {
            obj = ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }
}
