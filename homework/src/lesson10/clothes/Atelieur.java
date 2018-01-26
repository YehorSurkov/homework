package lesson10.clothes;

/**
 * Created by Student on 24.01.2018.
 */
public class Atelieur {
    public static void dressMan(Clothes[] clothes) {
        for (Clothes c : clothes) {
            System.out.println("" + c.getCost() + " " + c.getColor() + " " + c.getSize());
        }
    }

    public static void main(String[] args) {
        Clothes[] c = {new Skirt(20, 5.5, "YELLOW"), new Tie(30, 70.1, "Stripped"), new Trousers(50, 8.8, "Black")};
        Atelieur.dressMan(c);
    }
}

