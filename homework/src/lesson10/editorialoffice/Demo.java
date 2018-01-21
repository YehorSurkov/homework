package lesson10.editorialoffice;

public class Demo {
    public static void main(String[] args) {
        Printable[] prnt = {new Book("MacBeth"),new Magazine("Murzilka"), new Book("Hamlet"), new Book("Faust"),
                new Magazine("Nature")};

        for(Printable p: prnt){
            p.print();
        }

        System.out.println();
        Book.printBook(prnt);
        System.out.println();
        Magazine.printMagazine(prnt);
    }
}
