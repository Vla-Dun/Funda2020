package eu.tsachev.methods;

import java.util.Scanner;

public class methodsLabOrders {

    public static void receip(String drink, int quanity) {
        double price;
        switch (drink) {
            case "coffee":
                price = 1.50;
                System.out.printf("%.2f", quanity * price);
                break;
            case "water":
                price = 1.00;
                System.out.printf("%.2f", quanity * price);
                break;
            case "coke":
                price = 1.40;
                System.out.printf("%.2f", quanity * price);
                break;
            case "snacks":
                price = 2.00;
                System.out.printf("%.2f", quanity * price);
                break;
            default:
                break;

        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String snack = scan.nextLine();
        int quanity = Integer.parseInt(scan.nextLine());

        receip(snack, quanity);
    }
}

