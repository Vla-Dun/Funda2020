package eu.tsachev.lists;

import java.util.*;

public class listsSorting {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> lista = new ArrayList<>(Arrays.asList("Peter", "Michael", "George", "Victor", "John"));

        Collections.sort(lista);

        System.out.println(String.join(", ", lista));

        Collections.reverse(lista);

        System.out.println(String.join(", ", lista));
    }
}

