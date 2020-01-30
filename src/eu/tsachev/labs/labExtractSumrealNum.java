package eu.tsachev.labs;

import java.math.BigDecimal;
import java.util.Scanner;

public class labExtractSumrealNum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nums = Integer.parseInt(scan.nextLine());
        BigDecimal big = new BigDecimal(0);

        for (int i = 0; i < nums - 1; i++) {

            BigDecimal biggie = new BigDecimal(scan.nextLine());
            big = big.add(biggie);


        }
        System.out.println(big);

    }
}
