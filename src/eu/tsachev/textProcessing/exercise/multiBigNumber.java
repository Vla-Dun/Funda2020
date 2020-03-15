package eu.tsachev.textProcessing.exercise;

import java.util.Scanner;

public class multiBigNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inpOne = scan.nextLine();
        int inpTwo = Integer.parseInt(scan.nextLine());
        if (inpTwo == 0) {
            System.out.println(0);
            return;
        }
        while (inpOne.charAt(0) == '0'
        ) {

            inpOne = inpOne.substring(1);
        }


        StringBuilder sb = new StringBuilder();
        int remainder = 0;

        for (int i = inpOne.length() - 1; i >= 0; i--) {
            int digit = Integer.parseInt(String.valueOf(inpOne.charAt(i)));
            int result = digit * inpTwo + remainder;
            sb.append(result % 10);
            remainder = result / 10;

        }
        if (remainder != 0) {
            sb.append(remainder);
        }
        System.out.println(sb.reverse());

    }
}

