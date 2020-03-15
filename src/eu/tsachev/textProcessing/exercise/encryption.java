package eu.tsachev.textProcessing.exercise;

import java.util.Scanner;

public class encryption {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char letter = (char) (input.charAt(i) + 3);
            sb.append(letter);
        }
        System.out.println(sb);
    }
}

