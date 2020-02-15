package eu.tsachev.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listsExcercisesHouseParty {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> people = new ArrayList<String>();

        int input = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < input; i++) {
            String[] guest = scan.nextLine().split("\\s+");
            boolean exists = people.contains(guest[0]);
            boolean ticket = guest[2].contains("not");


            if (!exists && !ticket) {
                //System.out.println("added");
                people.add(guest[0]);
            } else if (exists && !ticket) {
                System.out.println(guest[0] + " is already in the list!");

            } else if (exists) {
                // System.out.println("remove");
                for (String name : people
                ) {
                    people.remove(guest[0]);
                }
            } else {
                System.out.println(guest[0] + " is not in the list!");
            }


            //jebane

        }
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }

    }
}



