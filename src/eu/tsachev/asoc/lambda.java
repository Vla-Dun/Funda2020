package eu.tsachev.asoc;

import java.util.Arrays;
import java.util.Scanner;

public class lambda {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] input = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(n -> Integer.parseInt(n))
                .toArray();

    }

}

