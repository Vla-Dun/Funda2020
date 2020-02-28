package midExamDecember;

import java.util.Scanner;

public class disneyMoney {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double moneyToSave = Double.parseDouble(scan.nextLine());
        int monthsToSave = Integer.parseInt(scan.nextLine());
        double totalMoneySaved = 0;


        for (int i = 1; i <= monthsToSave; i++) {


            if ((i % 2 != 0) && i > 1) {
                totalMoneySaved -= totalMoneySaved * 0.16;
                //     System.out.println("minus 16%----"+totalMoneySaved);
            }
            if (i % 4 == 0) {  // NOTE !!!
                totalMoneySaved += totalMoneySaved * 0.25;
                //     System.out.println("fourth month +25% ---");
            }

            totalMoneySaved += moneyToSave * 0.25;
            //  System.out.println("end of month == "+totalMoneySaved);


        }//month loop


        if (totalMoneySaved >= moneyToSave) {
            System.out.printf("Bravo! You can go to Disneyland and you will have %.2flv. for souvenirs.", totalMoneySaved - moneyToSave);
        } else {
            System.out.printf("Sorry. You need %.2flv. more.", moneyToSave - totalMoneySaved);
        }

    }
}