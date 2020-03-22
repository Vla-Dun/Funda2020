package eu.tsachev.regex.Homework;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class furnitureRegex {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        ArrayList<String> itemsList = new ArrayList<>();
        double finalPrice = 0.0;
        String regex = ">>(?<name>\\w+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quanity>[0-9]+)";

        while (!"Purchase".equals(input)) {

            Pattern pattern = Pattern.compile(regex);
            Matcher items = pattern.matcher(input);


            if (items.find()) {

                String imte = items.group("name");
                double price = Double.parseDouble(items.group("price"));
                int quanity = Integer.parseInt(items.group("quanity"));

                itemsList.add(imte);
                finalPrice += price * quanity;
            }

            input = scan.nextLine();
        }//while
        System.out.println("Bought furniture:");

        itemsList.forEach(f -> System.out.println(f));
        System.out.printf("Total money spend: %.2f", finalPrice);

    }
}

