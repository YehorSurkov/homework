package lesson7;

import java.util.Scanner;

public class BookLibrary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Set a number of readers\n");
        int setCountOfReaders = 0;
        if (sc.hasNextInt()) {
            setCountOfReaders = sc.nextInt();
        } else {
            System.out.println("Error!");
        }
        BookWorm[] libVisiter = new BookWorm[setCountOfReaders];
        for (int i = 0; i < libVisiter.length; i++) {
            libVisiter[i] = readerInput(sc);
        }

        for (BookWorm reader : libVisiter) {
            readerOutput(reader);
        }
    }

    static String strInput(Scanner sc) {
        return sc.next();
    }

    static BookWorm readerInput(Scanner sc) {
        System.out.println("Name    ");
        String name = strInput(sc);
        System.out.println("Number  ");
        String number = strInput(sc);
        System.out.println("Department  ");
        String department = strInput(sc);
        System.out.println("Date of Birth   ");
        String date = strInput(sc);
        System.out.println("Phone   ");
        String phone = strInput(sc);
        return new BookWorm(name, number, department, date, phone);
    }

    static void readerOutput(BookWorm reader) {
        System.out.println(reader.fullName + " " + reader.ticketNumber + " " + reader.department + " " + reader.dateOfBirth + " " + reader.readerPhone);
    }
}
