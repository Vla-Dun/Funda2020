package eu.tsachev.regex.Homework;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class furnitureRegex {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        List<String> itemsList = new LinkedList<>();
        while (!"Purchase".equals(input)) {
            String regex = ">>(?<name>[A-Z]+[a-z]*)<<(?<price>[0-9]+.*)!(?<quanity>\\d)";
            String inputWhile = scan.nextLine();

            Pattern pattern = Pattern.compile(regex);
            Matcher items = pattern.matcher(inputWhile);


            String imte = items.group("name");
            double price = Double.parseDouble(items.group("price"));
            int quanity = Integer.parseInt(items.group("name"));

            itemsList.add(items.group());

        }//while

        System.out.println(String.join(", ", itemsList));
    }
}

