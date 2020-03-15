package eu.tsachev.textProcessing.exercise;

import java.util.Scanner;

public class validUsername {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(", ");

        for (String s : input) {
            if (isValid(s)) {
                System.out.println(s);
            }
        }


    }

    private static boolean isValid(String input) {

        if (input.length() < 3 || input.length() > 16) {
            return false;
        }

        for (int i = 0; i < input.length(); i++) {

            char letter = input.charAt(i);

            if (!Character.isLetterOrDigit(letter) && letter != '_' && letter != '-') {
                return false;
            }
        }
        return true;
    }
}

