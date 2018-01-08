package lesson7;

public class Phone {
    String number;
    String model;
    double weight;

    void receiveCall(String name) {
        System.out.println(name + " is calling you.");
    }

    void getNumber(String nmbr) {
        System.out.println(nmbr);
    }

    void recieveCall(String nm, String nmbr) {
        System.out.println(nm + " is calling you.");
        System.out.println(nmbr);
    }

    void sendMessage(String... arrNumbers) {
        System.out.println("This message was sent to");
        for (String nm : arrNumbers) {
            System.out.print(nm + " ; ");
        }
    }

    Phone(String nmbr, String mdl, double wght) {
        this(nmbr, mdl);
        model = mdl;
        weight = wght;
    }

    Phone(String nmbr, String mdl) {
        this();
        number = nmbr;
        model = mdl;
    }

    Phone() {
        number = "0955449405";
        model = "M55";
        weight = 135.5;
    }
}
