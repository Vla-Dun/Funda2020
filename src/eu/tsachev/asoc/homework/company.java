package eu.tsachev.asoc.homework;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class company {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        TreeMap<String, ArrayList> db = new TreeMap<>();

        String[] input = scan.nextLine().split("\\s+->");
        outer:
        while (!"End".equals(input[0])) {
            db.putIfAbsent(input[0], new ArrayList());

            if (db.containsKey(input[0])) {


                if (!db.get(input[0]).contains(input[1])) {

                    db.get(input[0]).add(input[1]);
                }


            }


            input = scan.nextLine().split("\\s+->");
        }//while


        for (Map.Entry<String, ArrayList> entry : db.entrySet()) {

            System.out.println(entry.getKey());


            for (Map.Entry<String, ArrayList> entry2 : db.entrySet()) {
                if (entry2.getKey().equals(entry.getKey())) {

                    entry2.getValue().stream().forEach((v -> System.out.println("--" + v)));

                }
            }
        }

    }
}
