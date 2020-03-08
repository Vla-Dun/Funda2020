package eu.tsachev.asoc.homework;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class orders {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\s+");

        Map<String, Double> tab = new LinkedHashMap<>();
        Map<String, Double> prices = new LinkedHashMap<>();


        while (!input[0].equals("buy")) {

            String item = input[0];
            double price = Double.parseDouble(input[1]), count = Double.parseDouble(input[2]);

            if (!tab.containsKey(item)) {
                tab.put(item, count * price);
                prices.put(item, count);

            } else {
                prices.put(item, prices.get(item) + count);
                tab.put(item, prices.get(item) * price);
            }
            input = scan.nextLine().split("\\s+");
        }

        tab.forEach((k, v) -> System.out.println(String.format("%s -> %.2f", k, v)));

    }
}

