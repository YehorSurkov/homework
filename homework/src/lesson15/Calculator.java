package lesson15;

public class Calculator {
    public <N1 extends Number, N2 extends Number> double sum(N1 x, N2 y) {
        return x.doubleValue() + y.doubleValue();
    }

    public <N1 extends Number, N2 extends Number> double sub(N1 x, N2 y) {
        return x.doubleValue() - y.doubleValue();
    }

    public <N1 extends Number, N2 extends Number> double mul(N1 x, N2 y) {
        return x.doubleValue() * y.doubleValue();
    }

    public <N1 extends Number, N2 extends Number> double div(N1 x, N2 y) {
        return x.doubleValue() / y.doubleValue();
    }

    @Override
    public String toString() {
        return "Calculator{}";
    }
}
