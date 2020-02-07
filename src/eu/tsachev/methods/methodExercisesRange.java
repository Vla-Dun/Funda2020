package eu.tsachev.methods;

import java.util.Scanner;

public class methodExercisesRange {

    public static int range(int start, int end) {
        int temp;
        int ran = 0;

        if (start > end) {
            temp = start;
            start = end;
            end = temp;
        }

        for (int i = start + 1; i < end; i++) {
            ran = (char) i;
            System.out.print((char) i+" ");
        }
        return ran;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char start = scan.nextLine().charAt(0);
        char end = scan.nextLine().charAt(0);
//        System.out.println((int) start);
//        System.out.println((int) end);
        range(start, end);
    }
}

