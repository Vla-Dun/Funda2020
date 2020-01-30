package eu.tsachev.random;

import java.util.Scanner;

public class dataTypesSumOfChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int chars = Integer.parseInt(scan.nextLine()), sum=0;
        for (int i = 0; i < chars; i++) {
            String input = scan.nextLine();
            sum+=input.charAt(0);

        }
        System.out.printf("The sum equals: %d", sum);

    }
}
