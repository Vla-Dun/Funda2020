package eu.tsachev.regex;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class matchPhoneNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "\\+359([- ])2\\1[\\d]{3}\\1[\\d]{4}\\b";
        String phones = scan.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher phoneMaker = pattern.matcher(phones);
        List<String> matchedPhones = new LinkedList<>();

        while (phoneMaker.find()) {
            matchedPhones.add(phoneMaker.group());
        }

        System.out.println(String.join(", ", matchedPhones));
    }
}

