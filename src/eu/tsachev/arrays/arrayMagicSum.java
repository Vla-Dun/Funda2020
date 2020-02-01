package eu.tsachev.arrays;

import java.util.Scanner;

public class arrayMagicSum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String[] stArray = input.split(" ");
        int target = Integer.parseInt(scan.nextLine());
        int[] intArr = new int[stArray.length];

        for (int i = 0; i < stArray.length; i++) {
            intArr[i] = Integer.parseInt(stArray[i]);
        }

        for (int i = 0; i <= intArr.length - 1; i++) {
            for (int j = i + 1; j < intArr.length; j++) {

                if (intArr[i] + intArr[j] == target) {
                    System.out.print(intArr[i] + " " + intArr[j]);
                    System.out.println();
                }
            }


        }

    }
}

