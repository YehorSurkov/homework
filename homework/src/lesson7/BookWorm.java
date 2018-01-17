package lesson7;

public class BookWorm {
    private String fullName;
    private String ticketNumber;
    private String department;
    private String dateOfBirth;
    private String readerPhone;

    public BookWorm(String fN, String tN, String dep, String db, String phone) {
        fullName = fN;
        ticketNumber = tN;
        department = dep;
        dateOfBirth = db;
        readerPhone = phone;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getReaderPhone() {
        return readerPhone;
    }

    public void setReaderPhone(String readerPhone) {
        this.readerPhone = readerPhone;
    }

    public void takeBook(int countOfBooks) {
        System.out.println(fullName + " has " + countOfBooks + " on his/her hands.");
    }

    public void takeBook(String... nameOfBooks) {
        for (String nb : nameOfBooks) {
            System.out.print(nb + " is on " + fullName + "'s hands.");
        }
    }

    public void takeBook(Book... obj) {
        for (Book o : obj) {
            System.out.print(fullName + "{ " + ticketNumber + " }" + " is a current holder of " + o.getNameOfBook());
        }
    }


    public void returnBook(int countOfBooks) {
        System.out.println(fullName + " has returned" + countOfBooks);
    }

    public void returnBook(String... nameOfBooks) {
        for (String nb : nameOfBooks) {
            System.out.println(nb + " has been returned by " + fullName);
        }
    }

    public void returnBook(Book... obj) {
        for (Book o : obj) {
            System.out.println(fullName + "{ " + ticketNumber + " }" + " has returned " + o.getNameOfBook());
        }
    }
}
