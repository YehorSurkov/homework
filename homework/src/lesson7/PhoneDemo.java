package lesson7;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone ph1 = new Phone();
        Phone ph2 = new Phone("0661414280", "A35");
        Phone ph3 = new Phone("0664958183", "S75", 211.1);

        System.out.println("ph1 can be described by follow parameters:" + ph1.number + " " + ph1.weight + " " + ph1.model);
        System.out.println("ph2 can be described by follow parameters:" + ph2.number + " " + ph2.weight + " " + ph2.model);
        System.out.println("ph3 can be described by follow parameters:" + ph3.number + " " + ph3.weight + " " + ph3.model);

        ph1.receiveCall("Sanya");
        ph1.getNumber("0664568391");
        ph1.recieveCall("Sanya", "0664568391");

        ph2.receiveCall("Ulya");
        ph2.getNumber("067768391");
        ph2.recieveCall("Ulya", "067768391");

        ph3.receiveCall("Sanya");
        ph3.getNumber("0664568391");
        ph3.recieveCall("Sanya", "0664568391");

        ph1.sendMessage("939849489", "347983743787438", "87483745847", "3847387487348");
    }
}
