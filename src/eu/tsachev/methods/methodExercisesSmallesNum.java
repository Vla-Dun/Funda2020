package eu.tsachev.methods;

import java.util.Scanner;

public class methodExercisesSmallesNum {

    public static int smallest(int[] integers) {
        int temp;

        for (int i = 0; i < integers.length; i++) {
            for (int j = i + 1; j < integers.length; j++) {
                if (integers[i] > integers[j]) {
                    temp = integers[i];
                    integers[i] = integers[j];
                    integers[j] = temp;
                }
            }
        }
        return integers[0];
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] integers = new int[3];

        for (int i = 0; i <= 2; i++) {
            integers[i] = Integer.parseInt(scan.nextLine());
        }

        System.out.println(smallest(integers));
    }

}
