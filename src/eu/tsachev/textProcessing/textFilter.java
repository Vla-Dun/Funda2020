package eu.tsachev.textProcessing;

import java.util.Scanner;

public class textFilter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] toBan = scan.nextLine().split(", ");
        String text = scan.nextLine();

        for (int i = 0; i < toBan.length; i++) {
            String replacement = generateReplacement(toBan[i].length());
            text = text.replace(toBan[i], replacement);

        }

        System.out.println(text);
    }

    private static String generateReplacement(int wordlength) {

        String[] parts = new String[wordlength];
        for (int i = 0; i < wordlength; i++) {
            parts[i] = "*";
        }
        return String.join("", parts);
    }
}

