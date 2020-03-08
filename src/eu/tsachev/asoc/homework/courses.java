package eu.tsachev.asoc.homework;

import java.util.*;

public class courses {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, ArrayList<String>> coruses = new HashMap<>();
        Map<String, Integer> registered = new LinkedHashMap<>();

        String[] input = scan.nextLine().split("\\s+:");
        while (!"end".equals(input[0])) {

            coruses.putIfAbsent(input[0], new ArrayList<>());
            coruses.get(input[0]).add(input[1]);

            registered.putIfAbsent(input[0], 0);

            if (registered.containsKey(input[0])) {
                registered.put(input[0], registered.get(input[0]) + 1);
            }

            input = scan.nextLine().split("\\s+:");

        }//while

        Map<String, Integer> result2 = new LinkedHashMap<>();
        registered.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEachOrdered(x -> result2.put(x.getKey(), x.getValue()));


        for (Map.Entry<String, Integer> entry : result2.entrySet()) {


            System.out.println(String.format("%s: %s", entry.getKey(), entry.getValue()));


            for (Map.Entry<String, ArrayList<String>> entry2 : coruses.entrySet()) {
                if (entry2.getKey().equals(entry.getKey())) {

                    entry2.getValue().stream().sorted().forEach((v -> System.out.println("--" + v)));

                }
            }
        }


    }
}

