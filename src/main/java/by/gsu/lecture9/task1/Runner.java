package by.gsu.lecture9.task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Runner {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Carol");

        System.out.println("ArrayList elements:");
        for (String name : names) {
            System.out.println(name);
        }

        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        int searchValue = 20;
        if (numbers.contains(searchValue)) {
            System.out.println("\nSet contains: " + searchValue);
        }

        Map<Integer, String> idToName = new HashMap<>();
        idToName.put(1, "Alice");
        idToName.put(2, "Bob");
        idToName.put(3, "Carol");

        System.out.println("\nMap keys:");
        for (Integer key : idToName.keySet()) {
            System.out.println(key);
        }
    }
}
