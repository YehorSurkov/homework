package lesson18;

import java.io.*;

public class FileCopyReaderWriter {
    public static void main(String[] args) {
        try (
                Reader fReader = new FileReader("src\\io\\Sonnet130.txt");
                Writer fWriter = new FileWriter("src\\io\\copied_Reader_Sonnet130.txt")
        ) {
            int a;
            while ((a = fReader.read()) != -1) {
                fWriter.write(a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
