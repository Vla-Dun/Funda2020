package eu.tsachev.arrays;

import java.util.Scanner;

public class arrayZigZag {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inputs = Integer.parseInt(scan.nextLine()); // line input
        int[] arrOne = new int[inputs];
        int[] arrTwo = new int[inputs];
        boolean flip = true;

        for (int i = 0; i < inputs; i++) {

            String line = scan.nextLine();
            String[] items = line.split(" ");

            if (i % 2 == 0) {
                arrOne[i] = Integer.parseInt(items[0]);
                arrTwo[i] = Integer.parseInt(items[1]);
                //debug
//                System.out.println("added at one " + items[0]);
//                System.out.println("added at two " + items[1]);

            } else {
                arrOne[i] = Integer.parseInt(items[1]);
                arrTwo[i] = Integer.parseInt(items[0]);
                //debug
//                System.out.println("added at one " + items[1]);
//                System.out.println("added at two " + items[0]);

            }
        }
        for (int i = 0; i < arrOne.length; i++) {
            System.out.print(arrOne[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arrTwo.length; i++) {
            System.out.print(arrTwo[i] + " ");
        }
    }
}

