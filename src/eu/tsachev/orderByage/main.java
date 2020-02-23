package eu.tsachev.orderByage;


import java.util.*;
import java.util.stream.Collectors;

public class main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<age> agelist = new ArrayList<>();

        while (true) {
            String[] in = scan.nextLine().split(" ");
            if ("End".equals(in[0])) {
                break;
            }

            age agelists = new age(in[0], in[1], Integer.parseInt(in[2]));

            agelist.add(agelists);

        }//while

        List<age> ageList = agelist.stream().sorted(Comparator.comparingInt(age::getAge)).collect(Collectors.toList());
        //Collections.reverse(ageList);

        for (age studene : ageList
        ) {
            System.out.println(studene);

        }
    }
}

