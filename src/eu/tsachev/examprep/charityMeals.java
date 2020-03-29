package eu.tsachev.examprep;

import java.util.*;

public class charityMeals {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, List<String>> liked = new HashMap<>();
        String line = scan.nextLine();
        while (!"Stop".equals(line)) {
            String[] split = line.split("-");
            String type = split[0];
            String guestName = split[1];
            String mealName = split[2];

            if ("Like".equals(type)
            ) {

                List<String> guestMeals = liked.get(guestName);

                if (guestMeals == null) {
                    guestMeals = new ArrayList<>();
                }
                if (!guestMeals.contains(mealName)) {
                    guestMeals.add(mealName);
                }


                liked.put(guestName, guestMeals);

            } else {

                List<String> meals = liked.get(guestName);
                if (!meals.contains(mealName)) {
                    System.out.printf("%s doesn't have the %s in his/her collection.%n", guestName, mealName);
                } else {
                    meals.remove(mealName);
                    System.out.printf("%s doesn't like the %s.%n");
                }

            }


            line = scan.nextLine();
        }//while
    }
}

