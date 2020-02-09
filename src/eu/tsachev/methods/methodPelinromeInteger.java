package eu.tsachev.methods;

import java.util.Scanner;

public class methodPelinromeInteger {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        while (true) {
            String input = scan.nextLine();
            if ("END".equals(input)) {
                break;
            }


            int num = Integer.parseInt(input);
            int n = 0, dig = 0, rev = 0;
            n = num;
            while (num > 0) {
                dig = num % 10;
                rev = rev * 10 + dig;
                num = num / 10;
            }
            // If (n == rev) then num is a palindrome

            if (n == rev) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

        } //end

    }

}


