package lesson7;

public class Phone {
    public static int cntr;
    private String number;
    private String model;
    private double weight;

    public Phone(String nmbr, String mdl, double wght) {
        this(nmbr, mdl);
        model = mdl;
        weight = wght;
    }

    public Phone(String nmbr, String mdl) {
        this();
        number = nmbr;
        model = mdl;
    }

    public Phone() {
        number = "0955449405";
        model = "M55";
        weight = 135.5;
        cntr++;
    }

    public void receiveCall(String name) {
        System.out.println(name + " is calling you.");
    }

    public void getNumber(String nmbr) {
        System.out.println(nmbr);
    }

    public void recieveCall(String nm, String nmbr) {
        System.out.println(nm + " is calling you.");
        System.out.println(nmbr);
    }

    public void sendMessage(String... arrNumbers) {
        System.out.println("This message was sent to");
        for (String nm : arrNumbers) {
            System.out.print(nm + " ; ");
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getNumber() {
        System.out.println(number);
        return number;
    }

    public void setNumber(String str) {
        this.number = str;
    }
}
