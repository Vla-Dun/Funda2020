package eu.tsachev.methods;

import java.util.Scanner;

public class methodsLabGrades {

    public static void grades(double grade) {
        if (grade >= 2.0 && grade <= 2.99) {
            System.out.println("Fail");
        } else if (grade >= 3.0 && grade <= 3.49) {
            System.out.println("Poor");
        } else if (grade >= 3.50 && grade <= 4.49) {
            System.out.println("Good");
        } else if (grade >= 4.50 && grade <= 5.49) {
            System.out.println("Very good");
        } else if (grade >= 5.50 && grade <= 6.0) {
            System.out.println("Excellent");
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        grades(Double.parseDouble(scan.nextLine()));
    }
}

