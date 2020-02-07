package eu.tsachev.methods;

import java.util.Scanner;

public class methodGreaterOfTwo {

    public static String getMax(String first, String second) {
        if (first.compareTo(second) >= 0) {
            System.out.println(first);
            return first;
        }
        System.out.println(second);
        return second;
    }

    public static char getMax(char first, char second) {
        if (first > second) {
            System.out.println(first);
            return first;
        }
        System.out.println(second);
        return second;

    }

    public static int getMax(int firstNum, int secondNum) {
        if (firstNum > secondNum) {
            System.out.println(firstNum);
            return firstNum;
        }
        System.out.println(secondNum);
        return secondNum;
    }

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();


        if ("int".equals(type)) {
            int a = Integer.parseInt(scan.nextLine());
            int b = Integer.parseInt(scan.nextLine());
            getMax(a, b);

        } else if ("char".equals(type)) {
            char a = scan.nextLine().charAt(0);
            char b = scan.nextLine().charAt(0);
            getMax(a, b);
        } else if ("string".equals(type)) {
            String a = scan.nextLine();
            String b = scan.nextLine();
            getMax(a, b);
        }

    }
}

