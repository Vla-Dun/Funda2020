package eu.tsachev.arrays;

import java.util.Scanner;

public class classArrayRevers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] list = scan.nextLine().split(" ");

        for (int i = 0; i < list.length / 2; i++) {
            String temp = list[i];
            list[i] = list[list.length - 1 - i];
            list[list.length - 1 - i] = temp;

        }
        System.out.println(String.join(" ", list));

    }

}


