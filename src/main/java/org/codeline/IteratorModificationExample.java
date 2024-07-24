package org.codeline;

import java.util.*;

public class IteratorModificationExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date", "elderberry"));

        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            if (fruit.startsWith("b") || fruit.startsWith("d")) {
                iterator.remove();
            }
        }

        System.out.println("Remaining fruits: " + fruits);
    }
}