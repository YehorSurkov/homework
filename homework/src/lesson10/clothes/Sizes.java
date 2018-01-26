package lesson10.clothes;

/**
 * Created by Student on 24.01.2018.
 */
public enum Sizes {
    XXS(20) {
        @Override
        public void getDiscription() {
            System.out.println("This is a child size");
        }
    }, XS(30), S(40), M(50), L(60);
    private int euroSize;

    Sizes(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public void setEuroSize(int euroSize) {
        this.euroSize = euroSize;
    }

    public void getDiscription() {
        System.out.println("This is an adult size.");
    }
}
