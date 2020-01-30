package eu.tsachev.random;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Integer n=Integer.parseInt(scan.nextLine());

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
