package eu.tsachev.methods;

import java.util.Scanner;

public class methodsNxNmatrix {

    public static int nXn(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(n + " ");

            }

        }
        return n;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = Integer.parseInt(scan.nextLine());
        nXn(input);
    }
}

