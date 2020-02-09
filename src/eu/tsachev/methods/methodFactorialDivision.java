package eu.tsachev.methods;

import java.util.Scanner;

public class methodFactorialDivision {
    public static double factoriala(double n, double m) {
        double fact = 1, factwo = 1;

        for (int i = 1; i <= n; i++) {
            fact = (fact * i);

        }
        for (int i = 1; i <= m; i++) {

            factwo = (factwo * i);
        }
//        System.out.println(fact);
        return fact / factwo;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int factOne = Integer.parseInt(scan.nextLine());
        int factTwo = Integer.parseInt(scan.nextLine());
        if (factOne == 0 || factTwo == 0) {

        } else {
            double one = factoriala(factOne, factTwo);

            System.out.printf("%.2f", one);
        }
    }

}

