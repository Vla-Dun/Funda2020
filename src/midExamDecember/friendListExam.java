package midExamDecember;

import java.util.Scanner;

public class friendListExam {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String[] friendlist = scan.nextLine().split(", ");
        String[] input = scan.nextLine().split(" ");
        String action = "";
        int blCount = 0, lostCount = 0;
        boolean isThere = true;
outer:
        while (!"Report".equals(action)) {
            input = scan.nextLine().split(" ");
            switch (input[0]) {


                case "Blacklist":

                    for (int i = 0; i < friendlist.length; i++) {

                        if (friendlist[i].equals(input[1])) {
                            System.out.println(friendlist[i] + " was blacklisted.");
                            friendlist[i] = friendlist[i].replace(friendlist[i], "Blacklisted");

                        }
                        if (!friendlist[i].contains(input[1])) {
                            isThere = false;
                        }

                    }
                    if (isThere) {
                        System.out.println(input[1] + " was not found.");
                    }

                    //  System.out.println(String.join(" ", friendlist));
                    break;


                case "Error":

                    int index = Integer.parseInt(input[1]);

                    if (!friendlist[index].equals("Blacklisted") && !friendlist[index].equals("Lost")) {
                        System.out.println(friendlist[index] + " was lost due to an error.");
                        friendlist[index] = friendlist[index].replace(friendlist[index], "Lost");
                    }

                    //   System.out.println(String.join(" ", friendlist));
                    break;
                case "Change":
                    int in = Integer.parseInt(input[1]);
                    if (in <= friendlist.length) {
                        System.out.printf("%s changed his username to %s.%n", friendlist[in], input[2]);
                        friendlist[in] = friendlist[in].replace(friendlist[in], input[2]);

                    }

                    break;

                case "Report":

                    break outer;
            }//switch

            action = scan.nextLine();

        }//while

        for (String s : friendlist) {

            if (s.equals("Blacklisted")) {
                blCount++;
            }
            if (s.equals("Lost")) {
                lostCount++;
            }
        }
        System.out.println("Blacklisted names: " + blCount);
        System.out.println("Lost names: " + lostCount);
        System.out.println(String.join(" ", friendlist));

    }
}

