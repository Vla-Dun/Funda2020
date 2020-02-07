package eu.tsachev.methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class methodLabPower {

    public static double power(double num, int power) {
        double result = 1;

        result = Math.pow(num, power);

        return result;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double number = Double.parseDouble(scan.nextLine());
        int power = Integer.parseInt(scan.nextLine());

        System.out.println(new DecimalFormat("0.####").format(power(number, power)));
    }
}

