package eu.tsachev.methods;

import java.util.Scanner;

public class methodRepeatString {

    public static String repeatStr(String str, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            System.out.print(str);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        int coun = Integer.parseInt(scan.nextLine());

        repeatStr(str, coun);
    }
}

