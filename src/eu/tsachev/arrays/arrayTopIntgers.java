package eu.tsachev.arrays;

import java.util.Scanner;

public class arrayTopIntgers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String[] stArray = input.split(" ");

        int size = stArray.length;
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(stArray[i]);

        }

        for (int i = 0; i < stArray.length; i++) {
            boolean isItBigger = true;
            for (int j = i + 1; j < stArray.length; j++) {
                if (arr[i] <= arr[j]) {
                    isItBigger = false;
                    break;
                }
            }

            if (isItBigger) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}