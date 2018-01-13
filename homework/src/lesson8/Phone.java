package lesson8;

public class Phone {
    static int cntr;
    private String number;
    private String model;
    private double weight;

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
        cntr++;
    }

    void recieveCall(String nm, String nmbr) {
        System.out.println(nm + " is calling you.");
        System.out.println(nmbr);
    }

    void receiveCall(String name) {
        System.out.println(name + " is calling you.");
    }

    void sendMessage(String... arrNumbers) {
        System.out.println("This message was sent to");
        for (String nm : arrNumbers) {
            System.out.print(nm + " ; ");
        }
    }

    String getModel() {
        return model;
    }

    void setModel(String model) {
        this.model = model;
    }

    double getWeight() {
        return weight;
    }

    void setWeight(double weight) {
        this.weight = weight;
    }

    String getNumber() {
        System.out.println(number);
        return number;
    }

    void setNumber(String str) {
        number = str;
    }
}
