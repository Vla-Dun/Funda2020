package eu.tsachev.arrays;

import java.util.Scanner;

public class arrayTrains {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int wag = Integer.parseInt(scan.nextLine()), total = 0;
        int[] ppl = new int[wag];

        for (int i = 0; i < wag; i++) {
            int input = Integer.parseInt(scan.nextLine());
            ppl[i] = input;

        }
        for (int i = 0; i < ppl.length; i++) {
            total += ppl[i];
            System.out.print(ppl[i] + " ");

        }
        System.out.println();
        System.out.println(total);

    }
}

