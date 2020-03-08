package eu.tsachev.asoc.homework;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class softUniParking {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, String> parkingUsers = new LinkedHashMap<>();
        int num = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < num; i++) {
            String command = scan.nextLine();
            String[] tokens = command.split("\\s+");
            String operation = tokens[0], name = tokens[1];

            if ("register".equals(operation)) {
                String plate = tokens[2];
                if (!parkingUsers.containsKey(name)) {
                    parkingUsers.put(name, plate);
                    System.out.printf("%s registered %s successfully%n", name, plate);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", plate);
                }
            } else if (operation.equals("unregister")) {
                if (!parkingUsers.containsKey(name)) {
                    System.out.printf("ERROR: user %s not found%n", name);
                } else {
                    parkingUsers.remove(name);
                    System.out.printf("%s unregistered successfully%n", name);
                }
            }
        }

        parkingUsers.forEach((k, v) -> System.out.println(String.format("%s => %s", k, v)));

    }
}



