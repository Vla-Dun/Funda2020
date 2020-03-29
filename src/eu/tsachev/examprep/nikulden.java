package eu.tsachev.examprep;

import java.util.Scanner;

public class nikulden {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String encrypted = scan.nextLine();
        String command = scan.nextLine();

        while (!"Finish".equals(command)) {
            String[] commandParts = command.split(" ");
            String commandName = commandParts[0];

            switch (commandName) {
                case "Replace":
                    encrypted = replace(encrypted, commandParts[1].charAt(0), commandParts[2].charAt(0));
                    break;
                case "Cut":
                    encrypted = cut(encrypted, Integer.parseInt(commandParts[1]), Integer.parseInt(commandParts[2]));
                    break;
                case "Make":
                    encrypted = make(encrypted, commandParts[1]);
                    break;
                case "Check":
                    check(encrypted, commandParts[1]);
                    break;
                case "Sum":
                    sum(encrypted, Integer.parseInt(commandParts[1]), Integer.parseInt(commandParts[2]));
                    break;

            }//switch
            command = scan.nextLine();

        }//while
    }

    private static void sum(String current, int Start, int End) {
        if (!isValidIndex(Start, current.length())) {
            System.out.println("Invalid indexes!");
            return;
        } else if (!isValidIndex(End, current.length())) {
            System.out.println("Invalid indexes!");
            return;
        }
        int sum = 0;
        for (int i = Start; i <= End; i++) {
            sum += current.charAt(i);
        }
        System.out.println(sum);

    }

    private static void check(String current, String targetCheck) {
        int searchIndex = current.indexOf(targetCheck);
        if (searchIndex == -1) {
            System.out.println("Message doesn't contain " + targetCheck);

        } else {
            System.out.println("Message contains " + targetCheck);
        }

    }

    private static String make(String current, String targetCase) {
        String result = current;

        if (targetCase.equals("Upper")) {
            result = current.toUpperCase();
        } else {
            result = current.toLowerCase();
        }
        System.out.println(result);
        return result;
    }

    public static String cut(String current, int startIndex, int endIndex) {

        if (!isValidIndex(startIndex, current.length())) {
            System.out.println("Invalid indexes!");
            return current;
        } else if (!isValidIndex(endIndex, current.length())) {
            System.out.println("Invalid indexes!");
            return current;
        }

        String firstpart = current.substring(0, startIndex);
        String secondPart = current.substring(endIndex + 1);
        String result = firstpart + secondPart;
        System.out.println(result);
        return result;
    }

    private static boolean isValidIndex(int toCheck, int length) {
        return toCheck >= 0 && toCheck < length;
    }

    private static String replace(String current, char searchFor, char replaceWith) {
        String result = current.replace(searchFor, replaceWith);

        System.out.println(result);
        return result;
    }
}

