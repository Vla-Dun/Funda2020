package eu.tsachev.lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listsExcercieseChangeList {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String[] input = {""};
        while (!"end".equals(input[0])) {
            input = scan.nextLine().split("\\s+");

            switch (input[0]) {
                case "Delete":
                    for (int i = 0; i < list.size(); i++) {
                        list.removeAll(Arrays.asList(Integer.parseInt(input[1])));
                    }
                    break;
                case "Insert":
                    if (Integer.parseInt(input[2]) < list.size()) {
                        list.add(Integer.parseInt(input[2]), Integer.parseInt(input[1]));
                    }
                    break;
            }//case

//print list

        }
        for (Integer inte : list) {

            System.out.print(inte + " ");


        }
    }
}


