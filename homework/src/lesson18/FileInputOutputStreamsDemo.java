package lesson18;

import java.io.*;

public class FileInputOutputStreamsDemo {
    public static void main(String[] args) {
        try (OutputStream output = new FileOutputStream("src\\io\\a.txt");
             InputStream input = new FileInputStream("src\\io\\a.txt")
        ) {
            char[] ch = {'a', 'b', 'c'};

            for (char c : ch) {
                output.write(c);
            }
            output.close();

            int size = input.available();
            for (int j = 0; j < size; j++) {
                System.out.print((char) input.read() + " ");
            }
            input.close();
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}
