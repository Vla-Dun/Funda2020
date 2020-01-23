package eu.tsachev;

import java.util.Scanner;

public class scramble {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = Integer.parseInt(scan.nextLine());

        char char1 = 'a', char2 = 'a', char3 = 'a';

        for (int i = 0; i < input; i++) {

            for (int j = 0; j < input; j++) {

                for (int k = 0; k < input; k++) {


                    char3 = (char) ('a' + k);
                    char2 = (char) ('a' + j);
                    char1 = (char) ('a' + i);

                    System.out.printf("%c%c%c%n", char1, char2, char3);

                }
            }

        }


    }
}
