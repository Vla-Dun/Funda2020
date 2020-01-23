package eu.tsachev;

import java.util.Scanner;

public class dataTYpesSumDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        int a = Integer.parseInt(input), sum = 0;

        for (int i = 0; i < input.length(); i++) {
//            System.out.println(String.valueOf(input.charAt(i)));
            sum += Integer.parseInt(String.valueOf(input.charAt(i)));

        }
        System.out.println(sum);
    }

}

