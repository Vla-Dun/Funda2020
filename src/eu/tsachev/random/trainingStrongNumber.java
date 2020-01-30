package eu.tsachev.random;

import java.util.Scanner;

public class trainingStrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int num = Integer.parseInt(scan.nextLine());
        int i, f, r, sum = 0, temp;
        temp = num;

        while (num != 0) {
            i = 1;
            f = 1;
            r = num % 10;
            while (i <= r) {
                f = f * i;
                i++;
            }
            sum = sum + f;
            num = num / 10;
        }

        if (sum == temp) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
