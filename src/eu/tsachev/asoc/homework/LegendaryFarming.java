package eu.tsachev.asoc.homework;

import com.sun.source.tree.Tree;

import java.util.*;

public class LegendaryFarming {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        TreeMap<String, Integer> items = new TreeMap<>();
        items.put("fragments", 0);
        items.put("motes", 0);
        items.put("shards", 0);

        TreeMap<String, Integer> junk = new TreeMap<>();
        boolean isObtained = false;

        while (!isObtained) {

            String[] tokes = scan.nextLine().split("\\s+");

            for (int i = 0; i < tokes.length; i += 2) {

                int count = Integer.parseInt(tokes[i]);
                String type = tokes[i + 1].toLowerCase();
                if (items.containsKey(type)) {
                    addItem(items, type, count);
                    isObtained = hasLegendary(items, type);
                    if (isObtained) {
                        break;
                    }
                } else {
                    addItem(junk, type, count);

                }

            }//for

        }//end
        items
                .entrySet()
                .stream()
                .sorted((i1, i2) -> Integer.compare(i2.getValue(), i1.getValue()))
                .forEach(i -> System.out.println(String.format("%s: %d", i.getKey(), i.getValue())));
        junk
                .entrySet()
                .forEach(j -> System.out.println(String.format("%s: %d", j.getKey(), j.getValue())));
    }

    private static boolean hasLegendary(TreeMap<String, Integer> items, String type) {
        int count = items.get(type);
        if (count >= 250) {
            items.put(type, count - 250);
            switch (type) {
                case "shards":
                    System.out.println("Shadowmourne obtained!");
                    return true;
                case "fragments":
                    System.out.println("Valanyr obtained!");
                    return true;
                case "motes":
                    System.out.println("Dragonwrath obtained!");
                    return true;
            }
        }
        return false;
    }

    public static void addItem(TreeMap<String, Integer> map, String key, Integer value) {

        map.putIfAbsent(key, 0);
        int count = map.get(key);
        map.put(key, count + value);

    }
}

