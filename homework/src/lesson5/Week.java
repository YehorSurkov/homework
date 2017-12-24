package lesson5;

public class Week {
    public static void main(String[] args) {
        int i = 3;
        if ("1".equals(args[i])) {
            System.out.println("Monday");
        } else if ("2".equals(args[i])) {
            System.out.println("Tuesday");
        } else if ("3".equals(args[i])) {
            System.out.println("Wednesday");
        } else if ("4".equals(args[i])) {
            System.out.println("Thursday");
        } else if ("5".equals(args[i])) {
            System.out.println("Friday");
        } else if ("6".equals(args[i]) || "7".equals(args[i])) {
            System.out.println("Holidays)))");
        } else {
            System.out.println("It's not a day of week(");
        }
    }
}