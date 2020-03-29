package eu.tsachev.examprep;

import java.util.*;

public class charityMeals {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, List<String>> liked = new TreeMap<>();
        String line = scan.nextLine();
        int unlikedMeals = 0;

        while (!"Stop".equals(line)) {
            String[] split = line.split("-");
            String type = split[0];
            String guestName = split[1];
            String mealName = split[2];

            if ("Like".equals(type)) {

                List<String> guestMeals = liked.get(guestName);

                if (guestMeals == null) {
                    guestMeals = new ArrayList<>();
                }
                if (!guestMeals.contains(mealName)) {
                    guestMeals.add(mealName);
                }


                liked.put(guestName, guestMeals);

            } else {
                if (!liked.containsKey(guestName)) {
                    System.out.println(guestName + " is not at the party.");
                } else {

                    List<String> meals = liked.get(guestName);

                    if (!meals.contains(mealName)) {
                        System.out.printf("%s doesn't have the %s in his/her collection.%n", guestName, mealName);
                    } else {
                        unlikedMeals++;
                        meals.remove(mealName);
                        System.out.printf("%s doesn't like the %s.%n", guestName, mealName);
                    }
                }
            }
            line = scan.nextLine();
        }


        liked
                .entrySet()
                .stream()
                .sorted((l, r) -> r.getValue().size() - l.getValue().size())
                .forEach(s -> System.out.println(s.getKey() + ": " + printList(s.getValue())));


        System.out.println("Unliked meals: " + unlikedMeals);

    }

    private static String printList(List<String> value) {
        return value.toString().replaceAll("[\\[\\]]", "");
    }
}

