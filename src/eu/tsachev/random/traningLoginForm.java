package eu.tsachev.random;

import java.util.Scanner;

public class traningLoginForm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String usernameInput = scan.nextLine(), passwd = "";
        int failAttempts = 0;

        //reverse
        for (int i = usernameInput.length() - 1; i >= 0; i--) {
            passwd = passwd + usernameInput.charAt(i);
        }

        while (true) {
            String input = scan.nextLine();

            if (input.equals(passwd)) {
                System.out.println("User " + usernameInput + " logged in.");
                break;
            } else {
                if (failAttempts >= 3) {
                    System.out.println("User " + usernameInput + " blocked!");
                    break;
                } else {
                    System.out.println("Incorrect password. Try again.");
                    failAttempts += 1;
                }
            }

        }//end


    }//main
}
