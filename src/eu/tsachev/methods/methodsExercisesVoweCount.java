package eu.tsachev.methods;

import java.util.Scanner;

public class methodsExercisesVoweCount {

    public static int vowelCount(String userInput) {
        int vowels = 0;
        for (int i = 0; i < userInput.length(); i++) {
            char ch = userInput.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowels++;
            }

        }
        return vowels;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();
        System.out.println(vowelCount(userInput));
    }
}

