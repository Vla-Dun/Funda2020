package eu.tsachev.asoc.homework;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class charINstring {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] words = scan.nextLine().split("");

        Map<String, Integer> letters = new LinkedHashMap<>();


        for (String t : words) {


            letters.putIfAbsent(t, 0);
            letters.put(t, letters.get(t) + 1);

        }


        for (Map.Entry<String, Integer> entry : letters.entrySet()) {
            if (!entry.getKey().equals(" ")) {
                System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
            }
        }

    }
}

