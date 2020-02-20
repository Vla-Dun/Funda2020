package eu.tsachev.random;

import java.math.BigInteger;
import java.util.Scanner;

public class bigFactorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        BigInteger factorial = new BigInteger("1");

        for (int i = 2; i <= n; i++) {
            BigInteger multiplier = new BigInteger("" + i);
            factorial = factorial.multiply(multiplier);


        }
        System.out.println(factorial);
    }
}

