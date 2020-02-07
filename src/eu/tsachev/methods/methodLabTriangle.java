package eu.tsachev.methods;

import java.util.Scanner;

public class methodLabTriangle {
    public static void printLine(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < input; i++) {
            printLine(1, i);
        }

        for (int i = input; i >= 1; i--) {
            printLine(1, i);
        }

    }
}

