package lesson5;

public class GarlandArray {
    public static void main(String[] args) {
        int[] garland = new int[32];

        {
            float rand;
            for (int i = 0; i < garland.length; i++) {
                rand = (float) Math.random();
                if (rand > 0.5) {
                    garland[i] = 1;
                } else {
                    garland[i] = 0;
                }
            }
        }

        System.out.print("Input Garland");
        showGarland(garland);
        System.out.println('\n');

        int yourChoice = 4;
        switch (yourChoice) {
            case 1:
                int unitNum;
                checkNthUnit(garland, unitNum = 1);
                break;
            case 2:
                showGarland(garland);
                break;
            case 3:
                blinkinG(garland);
                break;
            case 4:
                runninG(garland);
                break;
            default:
                showGarland(garland);
        }
    }

    public static void checkNthUnit(int[] garland, int unitNum) {
        if (garland[unitNum - 1] == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void showGarland(int[] garland) {
        System.out.print('\n');
        BubbleChanged.output(garland);
    }

    public static void blinkinG(int[] garland) {
        for (int cntr = 0; cntr < 8; cntr++) {
            showGarland(garland);
            for (int j = 0; j < garland.length; j++) {
                if (garland[j] == 1) {
                    garland[j] = 0;
                } else {
                    garland[j] = 1;
                }
            }
        }
    }

    public static void runninG(int[] garland) {
        int first;
        for (int cntr = 0; cntr < 8; cntr++) {
            first = garland[garland.length - 1];
            System.arraycopy(garland, 0, garland, 1, garland.length - 1);
            garland[0] = first;
            showGarland(garland);
        }
    }
}

