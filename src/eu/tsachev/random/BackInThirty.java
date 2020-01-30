package eu.tsachev.random;

import java.util.Scanner;

public class BackInThirty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hour = Integer.parseInt(scan.nextLine()), min = Integer.parseInt(scan.nextLine()) + 30;


        if (min > 59) {

            hour += 1;
            if (hour > 23) {
                hour = 0;
            }
            min -= 60;
        }
        if (min < 10) {
            System.out.printf("%d:%02d", hour, min);
        } else {
            System.out.printf("%d:%d", hour, min);
        }
    }
}

