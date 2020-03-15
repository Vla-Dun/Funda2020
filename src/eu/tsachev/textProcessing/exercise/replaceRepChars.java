package eu.tsachev.textProcessing.exercise;

import java.util.Scanner;

public class replaceRepChars {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        StringBuilder res = new StringBuilder();
        char base = input.charAt(0);
        res.append(base);
        for (int i = 0; i < input.length(); i++) {
            char cl = input.charAt(i);
            if (base != input.charAt(i)) {
                res.append(cl);
                base = cl;

            }

        }
        System.out.println(res);
    }
}

