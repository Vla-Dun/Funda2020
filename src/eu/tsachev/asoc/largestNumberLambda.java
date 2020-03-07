package eu.tsachev.asoc;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class largestNumberLambda {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> sorted = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).sorted((n1, n2) -> n2.compareTo(n1))
                .collect(Collectors.toList());

        if (sorted.size() > 2) {
            for (int i = 0; i <= 2; i++) {

                System.out.print(sorted.get(i) + " ");
            }
        } else {
            for (int i = 0; i < sorted.size(); i++) {

                System.out.print(sorted.get(i) + " ");
            }
        }


    }
}


