package eu.tsachev.labs;

import java.util.Scanner;

public class labReverseChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = "";
        for (int i = 0; i < 3; i++) {

            String input = scan.nextLine();
            word = word + " " + input;


        }
        StringBuilder sb = new StringBuilder(word);
        System.out.println(sb.reverse());

    }
}

