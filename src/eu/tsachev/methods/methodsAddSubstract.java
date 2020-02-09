package eu.tsachev.methods;

import java.util.Scanner;

public class methodsAddSubstract {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inputOne = Integer.parseInt(scan.nextLine());
        int inputTwo = Integer.parseInt(scan.nextLine());
        int inputThree = Integer.parseInt(scan.nextLine());

        int mid = add(inputOne, inputTwo);
        susbtract(mid, inputThree);


    }

    public static int add(int one, int two) {
        int add = one + two;

        return add;

    }

    public static int susbtract(int one, int two) {
        int subs = one - two;
        System.out.println(subs);
        return subs;
    }
}

