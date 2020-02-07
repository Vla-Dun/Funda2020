package eu.tsachev.methods;

import java.util.Scanner;

public class methodsLabSoI {

    public static void signOfInteger(int num) {
        if (num > 0) {
            System.out.printf("The number %d is positive.", num);
        } else if (num < 0) {
            System.out.printf("The number %d is negative.", num);
        } else {
            System.out.printf("The number %d is zero.", num);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        signOfInteger(Integer.parseInt(scan.nextLine()));

    }
}

