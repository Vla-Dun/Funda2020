package eu.tsachev.asoc.homework;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class aMinersTask {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> inventory = new LinkedHashMap<>();

        String input = scan.nextLine();


        while (!"stop".equals(input)) {
            int count = Integer.parseInt(scan.nextLine());

            inventory.putIfAbsent(input, 0);
            int oldcount = inventory.get(input);
            inventory.put(input, oldcount + count);

            input = scan.nextLine();

        }//cycle

        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}

