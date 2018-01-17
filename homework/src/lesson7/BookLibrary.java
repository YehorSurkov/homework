package lesson7;

import java.util.Scanner;

public class BookLibrary {
    public static void main(String[] args) {
        int randomBook;
        Book book1 = new Book("Hamlet");
        Book book2 = new Book("MacBeth");
        Book book3 = new Book("The Lord of The Rings");
        Book book4 = new Book("The Games of Thrones: the Song of Ice and Fire");
        Book[] bookNames = {book1, book2, book3, book4};
        Scanner sc = new Scanner(System.in);
        System.out.println("Set a number of readers\n");
        int setCountOfReaders = 0;
        if (sc.hasNextInt()) {
            setCountOfReaders = sc.nextInt();
        } else {
            System.out.println("Error!");
        }
        Book[] libStorage = new Book[setCountOfReaders];
        for (int i = 0; i < libStorage.length; i++) {
            randomBook = (int) Math.floor(bookNames.length * Math.random());
            libStorage[i] = bookNames[randomBook];
        }
        BookWorm[] libVisiter = new BookWorm[setCountOfReaders];
        for (int i = 0; i < libVisiter.length; i++) {
            libVisiter[i] = readerInput(sc);
            randomBook = (int) Math.floor(setCountOfReaders * Math.random());
            libVisiter[i].takeBook(libStorage[randomBook]);
            libVisiter[i].returnBook(libStorage[randomBook]);
        }

        for (BookWorm reader : libVisiter) {
            readerOutput(reader);
        }

    }

    public static BookWorm readerInput(Scanner sc) {
        System.out.println("Name    ");
        String name = sc.next();
        System.out.println("Number  ");
        String number = sc.next();
        System.out.println("Department  ");
        String department = sc.next();
        System.out.println("Date of Birth   ");
        String date = sc.next();
        System.out.println("Phone   ");
        String phone = sc.next();
        return new BookWorm(name, number, department, date, phone);
    }

    public static void readerOutput(BookWorm reader) {
        System.out.println(reader.fullName + " " + reader.ticketNumber + " " + reader.department + " " + reader.dateOfBirth + " " + reader.readerPhone);
    }
}
