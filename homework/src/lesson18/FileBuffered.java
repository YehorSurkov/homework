package lesson18;

import java.io.*;

public class FileBuffered {
    public static void main(String[] args) {
        try (
                BufferedReader bReader = new BufferedReader(new FileReader("src\\io\\Sonnet130.txt"));
                BufferedWriter bWriter = new BufferedWriter(new FileWriter("src\\io\\copied_Buffered_Sonnet130.txt"))
        ) {
            String a;
            while ((a = bReader.readLine()) != null) {
                bWriter.write(a);
                bWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

