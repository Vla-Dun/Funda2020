package eu.tsachev.OpinionPoll;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int in = Integer.parseInt(scan.nextLine());

        ArrayList<Person> peope = new ArrayList<>();

        for (int i = 0; i < in; i++) {

            String[] input = scan.nextLine().split(" ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);

            Person person = new Person(name, age);
            peope.add(person);

        }

        peope
                .stream()
                .filter(p -> p.getAge() > 30)
                .sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
                .forEach(p -> System.out.println(p));


    }
}

