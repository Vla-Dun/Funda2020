package eu.tsachev.random;

import java.util.Scanner;

public class tranngVacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scan.nextLine());
        String group = scan.nextLine();
        String weekDay = scan.nextLine();
        double price = 0.0, discount = 0.0;

        switch (group) {
            case "Students":
                if ("Friday".equals(weekDay)) {
                    price = 8.45;
                }
                if ("Saturday".equals(weekDay)) {
                    price = 9.80;
                }
                if ("Sunday".equals(weekDay)) {
                    price = 10.46;
                }
                break;
            case "Business":
                if ("Friday".equals(weekDay)) {
                    price = 10.90;
                }
                if ("Saturday".equals(weekDay)) {
                    price = 15.60;
                }
                if ("Sunday".equals(weekDay)) {
                    price = 16;
                }
                break;
            case "Regular":
                if ("Friday".equals(weekDay)) {
                    price = 15;
                }
                if ("Saturday".equals(weekDay)) {
                    price = 20;
                }
                if ("Sunday".equals(weekDay)) {
                    price = 22.50;
                }
                break;

            default:
                break;
        }//switch

        //discount
        if ("Students".equals(group) && peopleCount >= 30) {
            discount = 0.85;
        } else if ("Business".equals(group) && peopleCount >= 100) {
            peopleCount -= 10;
        } else if ("Regular".equals(group) && (peopleCount >= 10 && peopleCount <= 20)) {
            discount = 0.95;
        }

        double totalPrice = (peopleCount * price);

        if (discount > 0) {
            System.out.printf("Total price: %.2f", totalPrice * discount);
        } else {
            System.out.printf("Total price: %.2f", totalPrice);
        }
    }
}
