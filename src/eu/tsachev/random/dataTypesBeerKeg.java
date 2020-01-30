package eu.tsachev.random;

import java.util.Scanner;

public class dataTypesBeerKeg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int beer = Integer.parseInt(scan.nextLine());

        double biggestKeg = Double.NEGATIVE_INFINITY;
        String modelBeer = "", biggestBeer = "";

        for (int i = 1; i <= beer; i++) {
            modelBeer = scan.nextLine();
            double radius = Double.parseDouble(scan.nextLine());
            double height = Double.parseDouble(scan.nextLine());

            double volumeKeg = Math.PI * radius * radius * height;
            if (volumeKeg > biggestKeg) {
                biggestKeg = volumeKeg;
                biggestBeer = modelBeer;
            }
        }
        System.out.println(biggestBeer);
    }


}

