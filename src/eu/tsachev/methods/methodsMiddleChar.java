package eu.tsachev.methods;

import java.util.Scanner;

public class methodsMiddleChar {

    public static String middlechars(String word) {
        if (word.length() % 2 == 0) {
            char chars1 = word.charAt(word.length() / 2);
            char chars2 = word.charAt((word.length() / 2) - 1);
            System.out.println(chars2 + "" + chars1);

        } else {
            System.out.println(word.charAt(word.length() / 2));
        }
        return word;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        middlechars(input);
    }
}

