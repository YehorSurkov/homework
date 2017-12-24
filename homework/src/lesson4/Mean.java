package lesson4;

public class Mean {
    public static void main(String[] args) {
        double[] m = new double[args.length];
        for (int cntr = 0; cntr < args.length; cntr++){
            m[cntr]=Double.parseDouble(args[cntr]);
        }
        System.out.println("Average equals " + Double.toString(mean(m)));
    }

    public static double mean(double[] num){
        double sum =0;
        for (int cntr = 0; cntr < num.length; cntr++){
            sum += num[cntr];
        }
        return sum/(num.length);
    }
}
