package eu.tsachev.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class listsAddItemsAndSortOutput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int items = Integer.parseInt(scan.nextLine());
        List<String> listItems = new ArrayList<>();
        for (int i = 0; i < items; i++) {
            String enter = scan.nextLine();
            listItems.add(enter);
        }
        Collections.sort(listItems);
        for (int i = 0; i < listItems.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, listItems.get(i));
        }
    }
}

