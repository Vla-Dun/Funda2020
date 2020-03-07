package eu.tsachev.asoc;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class asocArray {

    public static void main(String[] args) {


        Map<String, Double> hash = new LinkedHashMap<>();

        hash.put("pear", 3.0);
        hash.put("apple", 2.22);
        hash.put("banana", 1.50);


        hash.forEach((key, value) -> System.out.printf("%s -> %.2f%n", key, value));

    }
}

