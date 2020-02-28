package eu.tsachev;

import java.util.*;

public class treasurehunt {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] splite = scan.nextLine().split("\\|");

        List<String> chest = new ArrayList<>(Arrays.asList(splite));

        String command = scan.nextLine();

        while (!command.equals("Yohoho!")) {
            String[] commandArg = command.split(" ");
            String commandName = commandArg[0];

            switch (commandName) {
                case "Loot":
                    for (int i = 1; i <= commandArg.length; i++) {
                        if (!chest.contains(commandArg[i])) {
                            chest.add(0, commandArg[i]);
                        }
                    }

                    break;
                case "Drop":
                    int index = Integer.parseInt(commandArg[1]);
                    if (index >= chest.size() || index < 0) {
                        break;
                    }

                    String element = chest.remove(index);
                    chest.add(element);


                    break;
                case "Steal":
                    int counte = Integer.parseInt(commandArg[1]);
                    if (counte >= chest.size()) {
                        String output = String.join(", ", chest);
                        System.out.println(output);

                        chest.clear();
                    }

                    List<String> stolen = new ArrayList<>();
                    for (int i = 0; i < counte; i++) {
                        int lastIndex = chest.size() - 1;
                    }
                    Collections.reverse(stolen);

                    String outputt = String.join(", ", stolen);
                    System.out.println(outputt);
                    break;
            }


        }

        if (chest.size() > 0) {
            int lenghtSum = 0;
//            for (String:
//                 chest
//            ) {
//                lenghtSum += lenghtSum;
//
//            }
            System.out.println("average");
            double kur = (lenghtSum * 1.0) / chest.size();
        } else {
            System.out.println("failed hunt");
        }

    }
}

