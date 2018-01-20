package lesson9.greengrocery;

import static java.lang.Math.random;

public class greenGrocery {
    public static void main(String[] args) {
        Apple[] applesInPack = {new Apple(6.7 * random()), new Apple(6.7 * random()), new Apple(6.7 * random())};
        Pear[] pearsInPack = {new Pear(8.1 * random()), new Pear(8.1 * random()), new Pear(8.1 * random()), new Pear(8.1 * random())};
        Apricot[] apricotsInPack = {new Apricot(3.3 * random()), new Apricot(3.3 * random()), new Apricot(3.3 * random()), new Apricot(3.3 * random())};
        Fruit[][] fruitsInPack = {applesInPack, pearsInPack, apricotsInPack};

        double totalCost = 0;
        double[] distrCost = {0, 0, 0};
        int cntr = 0;

        for (Fruit[] sort : fruitsInPack) {
            for (Fruit frt : sort) {
                distrCost[cntr] += frt.cost();
            }
            totalCost += distrCost[cntr];
            cntr++;
        }

        System.out.println("Total number of sold fruits is " + Fruit.fruitCount);
        System.out.println("Total cost of buy is " + totalCost + " hrns.\n");
        System.out.println("Total amount of apples is " + Apple.appleCount);
        System.out.println("Total cost of apples is " + distrCost[0] + "hrns.\n");
        System.out.println("Total amount of pears is " + Pear.pearCount);
        System.out.println("Total cost of pears is " + distrCost[1] + "hrns.\n");
        System.out.println("Total amount of apricots is " + Apricot.apricotCount);
        System.out.println("Total cost of apricots is " + distrCost[2] + "hrns.\n");

    }
}
