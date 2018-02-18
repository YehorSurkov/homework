package lesson16;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex8 {
    public static void main(String[] args) {
        Map<String, Toy> map = new HashMap<>();
        map.put("Doll", new Toy("Doll", 34.4));
        map.put("Cube", new Toy("Cube", 15.6));
        map.put("Solder", new Toy("Solder", 45.2));
        map.put("Car", new Toy("Car", 23.3));

        sortByEntry(map);
        System.out.println();
        sortByKey(map);
        System.out.println();
        sortByValue(map
        );
    }

    public static void sortByEntry(Map<String, Toy> map) {
        Set<Map.Entry<String, Toy>> set = map.entrySet();
        set.forEach(System.out::println);
    }

    public static void sortByKey(Map<String, Toy> map) {
        Set<String> set = map.keySet();
        set.forEach(System.out::println);
    }

    public static void sortByValue(Map<String, Toy> map) {
        Collection<Toy> values = map.values();
        for (Toy t : values) {
            System.out.println(t.getName() + " " + t.getCost());
        }
    }
}
