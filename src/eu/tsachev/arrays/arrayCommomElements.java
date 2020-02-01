package eu.tsachev.arrays;

import java.util.Scanner;

public class arrayCommomElements {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] lineOne = scan.nextLine().split(" ");
        String[] lineTwo = scan.nextLine().split(" ");
        String[] bucket = new String[lineTwo.length];

//        for (int i = 0; i < lineTwo.length; i++) {
//
//            for (int j = 0; j < lineOne.length; j++) {
//                if (lineOne[i].equals(lineTwo[i])) {
//                    System.out.print(lineOne[i] + " ");
//                    break;
//                } else if (lineOne[j].equals(lineTwo[i])) {
//                    System.out.print(lineTwo[i] + " ");
//
//                }

        for (String num : lineTwo) {
            for (String num2 : lineOne) {
                if (num.equals(num2)) {
                    System.out.print(num+" ");

                }

            }
        }

    }
}



