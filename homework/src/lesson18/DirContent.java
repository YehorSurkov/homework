package lesson18;

import java.io.File;

public class DirContent {
    public static void main(String[] args) {
        File myDir = new File("src");
        showContent(myDir);
    }

    public static void showContent(File dir) {
        if (dir.isDirectory()) {
            for (String file : dir.list()) {
                File innerFile = new File(dir.getPath() + "\\" + file);
                if (innerFile.isDirectory()) {
                    System.out.println('\n' + file + '\n');
                    showContent(innerFile);
                } else {
                    System.out.println("    " + file);
                }
            }
        } else {
            System.out.println("This is not a directory!");
        }
    }
}
