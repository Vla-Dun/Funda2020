package eu.tsachev.regex.Homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexNeshtoSi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String regex = "%(?<name>[A-Z][a-z]+)%(?:[^|$%.]*)<(?<product>[^<>]+)>(?:[^|$%.]*)\\|(?<count>\\d+)\\|(?:[^|$%.]*?)(?<price>[-+]?\\d+\\.?\\d+)\\$";
        Pattern patterns = Pattern.compile(regex);

        double income = 0;
        String line = scan.nextLine();
        while (!"end of shift".equals(line)) {
            Matcher matcher = patterns.matcher(line);
            if (matcher.find()) {
                String name = matcher.group("name");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                double totalPrice = count * price;
                income += totalPrice; //

                System.out.printf("%s: %s - %.2f%n", name, product, totalPrice);
            }
            line = scan.nextLine();
        }

        System.out.printf("Total income: %.2f", income);
    }
}