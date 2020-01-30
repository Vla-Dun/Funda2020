package eu.tsachev.labs;

import java.util.Scanner;

public class labsTownInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String town = scan.nextLine(), pop = scan.nextLine(), area = scan.nextLine();

        System.out.printf("Town %s has population of %s and area %s square km.", town, pop, area);
    }
}
