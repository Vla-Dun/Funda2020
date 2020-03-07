package eu.tsachev.asoc;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class synoyms {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        Map<String, ArrayList<String>> words = new LinkedHashMap<>();

        for (int i = 0; i < n ; i++) {
            String word = scan.nextLine();
            String synonym = scan.nextLine();

            words.put(word, new ArrayList<>()); //initlialize LIST in key -> value

            words.get(word).add(synonym); //adds entry to list for key location.



        }


    }
}

