package lesson15;

import lesson8.Zoo.Animal;

import java.io.Serializable;

public class GenClass<T extends Comparable, V extends Animal & Serializable, K extends Number> {
    private T ob1;
    private V ob2;
    private K ob3;

    public GenClass(T ob1, V ob2, K ob3) {
        this.ob1 = ob1;
        this.ob2 = ob2;
        this.ob3 = ob3;
    }

    public T getOb1() {
        return ob1;
    }

    public V getOb2() {
        return ob2;
    }

    public K getOb3() {
        return ob3;
    }

    public void getClassesNames() {
        System.out.println(ob1.getClass().getName() + " " + ob2.getClass().getName() + " " + ob3.getClass().getName());
    }
}
