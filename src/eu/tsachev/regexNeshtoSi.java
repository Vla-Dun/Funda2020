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
                String name = matcher.group("name"); // взимаме имет на клиента от наименованата група
                String product = matcher.group("product"); // взимаме името на продукта от наименованата група
                int count = Integer.parseInt(matcher.group("count")); // взимаме броя на покупките и ги парсваме
                double price = Double.parseDouble(matcher.group("price")); // взимаме цената на продукта и го парсваме
                double totalPrice = count * price; // изчисляваме общата цена за продукта
                income += totalPrice; // добавяме цената към печалбата на бара

                System.out.printf("%s: %s - %.2f%n", name, product, totalPrice); // принтираме информация за текущия продукт
            }
            line = scan.nextLine();
        }

        System.out.printf("Total income: %.2f", income); // принтираме печалбата на бара
    }
}