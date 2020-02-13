package eu.tsachev.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listsSImpleListAdd {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> names = new ArrayList<>();
        names.add("Maria");
        names.add("Stamat");
        names.add("Pavel");
        names.add("Silvia");
        for (String name : names
        ) {
            System.out.println(name);
        }
    }
}

