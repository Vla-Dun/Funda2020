package eu.tsachev.lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listsExcerciseTrains {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int max = Integer.parseInt(scan.nextLine());
        String[] input;

        while (true) {
            input = scan.nextLine().split("\\s+");


            if ("end".equals(input[0])) {
//                Collections.sort(wagons);
//                Collections.reverse(wagons);
                for (Integer str : wagons) {
                    System.out.print(str + " ");
                }
                break;
            }

            if ("Add".equals(input[0])) {
                wagons.add(Integer.parseInt(input[1]));
            } else {

                for (int i = 0; i < wagons.size(); i++) {

                    if (wagons.get(i) + Integer.parseInt(input[0]) <= max) {
                        wagons.set(i, Integer.parseInt(input[0]) + wagons.get(i));
                        break;

                    }//wagons
                }
            }//else
        }

    }//while

}//main


