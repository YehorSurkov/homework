package lesson10.clothes;

/**
 * Created by Student on 24.01.2018.
 */
public class Atelieur {
    public static void dressMan(Clothes[] clothes) {
        for (Clothes c : clothes) {
            if (c instanceof ManClothes) {
                System.out.println("" + c.getCost() + " " + c.getColor() + " " + c.getSize());
            }
        }
    }

    public static void dressWoman(Clothes[] clothes) {
        for (Clothes c : clothes) {
            if (c instanceof WomanClothes) {
                System.out.println("" + c.getCost() + " " + c.getColor() + " " + c.getSize());
            }
        }
    }

    public static void main(String[] args) {
        Clothes[] c = {new Skirt(Sizes.XXS, 5.5, "YELLOW"), new Tie(Sizes.XS, 70.1, "Stripped"), new Trousers(Sizes.L, 8.8, "Black")};
        Atelieur.dressMan(c);
    }
}

