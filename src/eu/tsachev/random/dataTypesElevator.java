package eu.tsachev.random;

import java.util.Scanner;

public class dataTypesElevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ppl = Integer.parseInt(scan.nextLine());
        int course = Integer.parseInt(scan.nextLine());

        if (ppl % course != 0) {
            System.out.println((int) Math.ceil((double) ppl / course));
        } else {
            System.out.println(ppl / course);
        }


    }
}
