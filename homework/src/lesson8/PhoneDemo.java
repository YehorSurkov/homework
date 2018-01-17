package lesson8;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone ph1 = new Phone();
        ph1.setNumber("0667891235");
        Phone ph2 = new Phone("0661414280", "A35");
        Phone ph3 = new Phone("0664958183", "S75", 211.1);

        System.out.println("ph1 can be described by follow parameters:" + ph1.getNumber() + " " + ph1.getWeight() + " " + ph1.getModel());
        System.out.println("ph2 can be described by follow parameters:" + ph2.getNumber() + " " + ph2.getWeight() + " " + ph2.getModel());
        System.out.println("ph3 can be described by follow parameters:" + ph3.getNumber() + " " + ph3.getWeight() + " " + ph3.getModel());

        ph1.receiveCall("Sanya");
        ph1.setNumber("0664568391");
        ph1.recieveCall("Sanya", "0664568391");

        ph2.receiveCall("Ulya");
        ph2.setNumber("067768391");
        ph2.recieveCall("Ulya", "067768391");

        ph3.receiveCall("Sanya");
        ph3.setNumber("0664568391");
        ph3.recieveCall("Sanya", "0664568391");

        ph1.sendMessage("939849489", "347983743787438", "87483745847", "3847387487348");

        System.out.println("\nThere are " + Phone.cntr + " phones.");
    }
}
