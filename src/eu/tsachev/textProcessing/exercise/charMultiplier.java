package eu.tsachev.textProcessing.exercise;

import java.util.Scanner;

public class charMultiplier {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\s+");
        String first = input[0];
        String secind = input[1];

        int min = Math.min(first.length(), secind.length());
        int max = Math.max(first.length(), secind.length());
        int sum = 0;
        for (int i = 0; i < max; i++) {

            if (i < min) {
                sum += first.charAt(i) * secind.charAt(i);

            } else if (first.length() == max) {
                sum += first.charAt(i);
            } else {
                sum += secind.charAt(i);
            }

        }
        System.out.println(sum);
    }
}

