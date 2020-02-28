package midExamDecember;

import java.util.Scanner;

public class archeryTournament {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] field = input.split("\\|");

        String command = scanner.nextLine();


        Integer[] fieldValue = new Integer[field.length];
        for (int i = 0; i < field.length; i++) {
            fieldValue[i] = Integer.parseInt(field[i]);
        }


        int[] reverse = new int[fieldValue.length];


        boolean isValidIndex = false;
        int iskrenPoint = 0;

        while (!command.equals("Game over")) {

            String[] action = command.split("@");

            if (!action[0].equals("Reverse")) {
                isValidIndex = false;
                int startIndex = Integer.parseInt(action[1]);
                int lenght = Integer.parseInt(action[2]);

                boolean isValidLenght = false;
                if (startIndex >= 0 && startIndex < field.length) {
                    isValidIndex = true;
                }

                if (lenght >= 0) {
                    isValidLenght = true;
                }
                if ((isValidIndex && isValidLenght)) {
                    switch (action[0]) {
                        case "Shoot Left":
                            while (lenght != 0) {
                                if (startIndex == 0) {
                                    lenght--;
                                    startIndex = field.length - 1;
                                }
                                startIndex--;
                                lenght--;
                            }
                            if (fieldValue[startIndex] < 5) {
                                int points = fieldValue[startIndex];
                                iskrenPoint += points;
                                fieldValue[startIndex] = 0;
                            } else {
                                fieldValue[startIndex] -= 5;
                                iskrenPoint += 5;
                            }
                            break;

                        case "Shoot Right":
                            while (lenght != 0) {
                                if (startIndex == field.length - 1) {
                                    lenght--;
                                    startIndex = 0;
                                }
                                startIndex++;
                                lenght--;
                            }
                            if (fieldValue[startIndex] < 5) {
                                int points = fieldValue[startIndex];
                                iskrenPoint += points;
                                fieldValue[startIndex] = 0;
                            } else {
                                fieldValue[startIndex] -= 5;
                                iskrenPoint += 5;
                            }
                            break;
                    }
                }
            }

            if (action[0].equals("Reverse")) {
                int count = 0;
                for (int i = fieldValue.length - 1; i >= fieldValue.length / 2; i--) {
                    int temp = fieldValue[count];
                    fieldValue[count] = fieldValue[i];
                    fieldValue[i] = temp;
                    count++;
                }
            }

            command = scanner.nextLine();
        }

        for (int i = 0; i <= fieldValue.length - 1; i++) {

            if (i == fieldValue.length - 1) {
                System.out.print(fieldValue[i]);
                System.out.println();
            } else {
                System.out.print(fieldValue[i] + " - ");
            }
        }
        System.out.printf("Iskren finished the archery tournament with %d points!", iskrenPoint);

    }
}


