package eu.tsachev.arrays;

import java.util.Scanner;

public class arrayRotation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String[] stArray = input.split(" ");
        int jump = Integer.parseInt(scan.nextLine());

        for (int j = 0; j < jump; j++) {
            var temp = stArray[0];
            for (var i = 0; i < stArray.length - 1; i++) {
                stArray[i] = stArray[i + 1];
            }
            stArray[stArray.length - 1] = temp;
        }
       System.out.println(String.join(" "+stArray));

    }
}

