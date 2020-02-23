package eu.tsachev.StudentsGrade;

import java.util.*;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            String[] input = scan.nextLine().split("[  ]");


            String firstName = input[0];
            String lastName = input[1];
            String grade = input[2];

            Student student = new Student(firstName, lastName, Double.parseDouble(grade));
            students.add(student);


        }//fori


        List<Student> studentsSorted = students.stream().sorted(Comparator.comparingDouble(Student::getGrade)).collect(Collectors.toList());
        Collections.reverse(studentsSorted);

        for (Student studene : studentsSorted
        ) {
            System.out.println(studene);

        }

    }

}