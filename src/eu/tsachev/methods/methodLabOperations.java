package eu.tsachev.methods;

import java.util.Scanner;


public class methodLabOperations {
    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void substr(int a, int b) {
        System.out.println(a - b);
    }

    public static void divide(int a, int b) {
        System.out.println(a / b);
    }

    public static void multi(int a, int b) {
        System.out.println(a * b);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());

        switch (command) {
            case "add":
                add(a, b);
                break;
            case "divide":
                divide(a, b);
                break;
            case "subtract":
                substr(a, b);
                break;
            case "multiply":
                multi(a, b);
                break;
            default:
                break;
        }
    }
}

