package eu.tsachev.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        while (true) {
            String[] input = scan.nextLine().split(" ");
            if ("end".equals(input[0])) {
                break;
            }
            String firstName = input[0];
            String lastName = input[1];
            String yearsOld = input[2];
            String homeTown = input[3];


            Student student = new Student(input[0], input[1], Integer.parseInt(input[2]), input[3]);

            student.setFirstName(input[0]);
            student.setLastName(input[1]);
            student.setYearsOld(Integer.parseInt(input[2]));
            student.setHomeTown(input[3]);

            students.add(student);

        }//while

        String filterCity = scan.nextLine();

        for (Student student : students
        ) {

            if (student.getHomeTown().equals(filterCity)) {
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getYearsOld());
            }

        }

    }
}

