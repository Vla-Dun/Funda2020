package eu.tsachev.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class listsLab {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> lines = new ArrayList<>(
                Arrays.asList("10","10", "20","10", "40", "50")
        );

            for(String item : lines){
                System.out.println(item);
            }
            lines.remove("10");
        System.out.println("------------------------------------");
        for(String item : lines){
            System.out.println(item);
        }
    }
}

