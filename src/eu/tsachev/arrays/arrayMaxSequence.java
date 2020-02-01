package eu.tsachev.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrayMaxSequence {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int counter = 0;
        int currentCounter = 0;
        String currentSequence = "";
        String sequence = "";

        for (int i = 0; i < numbers.length - 1; i++) {
            if (currentCounter > counter) {
                counter = currentCounter;
                sequence = currentSequence + numbers[i - 1];

            }
            currentCounter = 0;
            currentSequence = "";

            for (int j = i + 1; j <= numbers.length - 1; j++) {
                if (numbers[i] == numbers[j]) {
                    currentCounter++;
                    currentSequence += numbers[i] + " ";
                } else {
                    break;
                }
            }
        }
        if (sequence.equals("")) {
            System.out.println(numbers[0]);
        }

        System.out.println(sequence);


    }

}

