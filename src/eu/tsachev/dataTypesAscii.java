package eu.tsachev;

import java.util.Scanner;

public class dataTypesAscii {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inputOne = Integer.parseInt(scan.nextLine()), inputTwo = Integer.parseInt(scan.nextLine()), diff = 0;
        if (inputOne > inputTwo) {
            diff = inputOne - inputTwo;
        } else {
            diff = inputTwo - inputOne;
        }

        for (int i = 0; i < diff + 1; i++) {

            System.out.print((char) (inputOne + i)+" ");
        }

    }
}
