package lesson18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        try (
                FileInputStream fileIn = new FileInputStream("src\\io\\Sonnet130.txt");
                FileOutputStream fileOut = new FileOutputStream("src\\io\\copied_Sonnet130.txt")
        ) {
            int a;
            while ((a = fileIn.read()) != -1) {
                fileOut.write(a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
