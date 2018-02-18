package lesson16.pets;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PetMapDemo {
    public static void main(String[] args) {
        Map<String, Pet> petMap = new HashMap<>();
        petMap.put("Ara", new Parrot("Gora", 45, "Africa"));
        petMap.put("Deni", new Raccoon("Deni", 5));
        petMap.put("Tuzik", new Dog("Tuzik", 5, "Pitbull"));
        petMap.put("Begemot", new Cat("Begemot", 7, "Black"));

        byKey(petMap);
    }

    public static void byKey(Map<String, Pet> map) {
        Set<String> set = map.keySet();
        set.forEach(System.out::println);
    }
}
