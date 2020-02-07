package eu.tsachev.methods;

import java.util.Scanner;

public class methodLabReturnOverload {
    public static double rect(double width, double height) {

        return width * height;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double width = Double.parseDouble(scan.nextLine());
        double height = Double.parseDouble(scan.nextLine());
        double area = rect(width, height);

        System.out.println((int)area);
    }
}

