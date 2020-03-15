package eu.tsachev.textProcessing.exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class filenameExtract {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\\\");

        ArrayList<String> part = new ArrayList<>();

        for (String s : input) {
            part.add(s);

        }
        String fileName = part.get(part.size() - 1);
        String[] filenameee = fileName.split("\\.");
        System.out.println("File name: " + filenameee[0]);
        System.out.println("File extension: " + filenameee[1]);

    }
}

