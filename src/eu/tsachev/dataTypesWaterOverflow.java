package eu.tsachev;

import java.util.Scanner;

public class dataTypesWaterOverflow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = Integer.parseInt(scan.nextLine()), capacity = 255, capacityLeft = capacity;

        for (int i = 0; i < input; i++) {

            int liters = Integer.parseInt(scan.nextLine());
            if (capacityLeft - liters >= 0) {
                capacityLeft -= liters;
            } else {
                System.out.println("Insufficient capacity!");

            }
        }
        int filled = capacity - capacityLeft;
        System.out.println(filled);
    }
}
