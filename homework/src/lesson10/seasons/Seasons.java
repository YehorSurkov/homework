package lesson10.seasons;

public enum Seasons {
    WINTER(-10), SPRING(7), SUMMER(27) {
        @Override
        public void getDescription() {
            System.out.println(meanTemperature() + "\nSo, this is a warm period\n");
        }
    }, AUTUMN(13) {
        @Override
        public void getDescription() {
            System.out.println(meanTemperature() + "\nSo, this is rather chill period");
            System.out.println("This is my favorite one:)");
        }
    };

    private double temp;

    Seasons(double temp) {
        this.temp = temp;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "Seasons{" +
                "temp=" + temp +
                '}';
    }

    public String meanTemperature() {
        return "\nThe mean temp is " + temp;
    }

    public void getDescription() {
        System.out.println(meanTemperature() + "\nSo, this is a cold period\n");
    }
}
