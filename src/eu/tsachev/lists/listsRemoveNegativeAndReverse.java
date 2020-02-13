package eu.tsachev.lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listsRemoveNegativeAndReverse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> lista = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < lista.size(); i++)
            if (lista.get(i) < 0)
                lista.remove(i--);
        Collections.reverse(lista);
        if (lista.size() == 0)
            System.out.println("empty");
        else
            System.out.println(lista.toString().replaceAll("[\\[\\],]", ""));

    }
}

