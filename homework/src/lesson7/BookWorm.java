package lesson7;

public class BookWorm {
    String fullName;
    String ticketNumber;
    String department;
    String dateOfBirth;
    String readerPhone;

    void takeBook(int countOfBooks) {
        System.out.println(fullName + " has " + countOfBooks + " on his/her hands.");
    }

    void takeBook(String... nameOfBooks) {
        for (String nb : nameOfBooks) {
            System.out.print(nb + " is on " + fullName + "'s hands.");
        }
    }

    void takeBook(Book... obj) {
        for (Book o : obj) {
            System.out.print(fullName + "{ " + ticketNumber + " }" + " is a current holder of " + o.getNameOfBook());
        }
    }


    void returnBook(int countOfBooks) {
        System.out.println(fullName + " has returned" + countOfBooks);
    }

    void returnBook(String... nameOfBooks) {
        for (String nb : nameOfBooks) {
            System.out.println(nb + " has been returned by " + fullName);
        }
    }

    void returnBook(Book... obj) {
        for (Book o : obj) {
            System.out.println(fullName + "{ " + ticketNumber + " }" + " has returned " + o.getNameOfBook());
        }
    }

    BookWorm(String fN, String tN, String dep, String db, String phone) {
        fullName = fN;
        ticketNumber = tN;
        department = dep;
        dateOfBirth = db;
        readerPhone = phone;
    }
}
