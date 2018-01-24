package lesson10.seasons;

public class SeasonsDemo {
    public static void main(String[] args) {
        Seasons s = Seasons.AUTUMN;

        switch (s) {
            case WINTER:
                s.getDescription();
                break;
            case SPRING:
                s.getDescription();
                break;
            case SUMMER:
                s.getDescription();
                break;
            case AUTUMN:
                s.getDescription();
                break;
            default:
                System.out.println("***");
                break;
        }

        for (Seasons s1 : Seasons.values()) {
            s1.getDescription();
        }
    }
}
