package lesson8.Zoo;

public class ZooDemo {
    public static void main(String[] args) {
        Animal horse = new Horse("Hay and oats", "Ukraine", 40.1);
        Animal cat = new Cat("Flockens and fish", "Ukraine", 0.75);
        Animal dog = new Dog("Meat", "Ukraine", 1.1);

        Animal[] zoo = {horse, dog, cat};

        for (Animal being : zoo) {
            Vet.treatAnimal(being);
        }
    }
}
