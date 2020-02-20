package eu.tsachev.objects;

import java.math.BigInteger;
import java.util.Scanner;

public class objectsSUmBigNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BigInteger bigInt = new BigInteger(scan.nextLine());
        BigInteger bigIntTwo = new BigInteger(scan.nextLine());

        System.out.println(bigInt.add(bigIntTwo));


    }
}

