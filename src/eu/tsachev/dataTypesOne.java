package eu.tsachev;

import java.util.Scanner;

public class dataTypesOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int one = Integer.parseInt(scan.nextLine());
        int two = Integer.parseInt(scan.nextLine());
        int three = Integer.parseInt(scan.nextLine());
        int four = Integer.parseInt(scan.nextLine());

        System.out.println(((one+two)/three)*four);



    }
}
