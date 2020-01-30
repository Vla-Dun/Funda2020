package eu.tsachev.random;

import java.util.Scanner;

public class traningPadawanEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double moneyz = Double.parseDouble(scan.nextLine());
        int padawansCount = Integer.parseInt(scan.nextLine());
        double pricePerSaber = Double.parseDouble(scan.nextLine());
        double pricePerRobe = Double.parseDouble(scan.nextLine());
        double pricePerBelt = Double.parseDouble(scan.nextLine());

        double lightsaberssTotalPrice = Math.ceil(padawansCount * 1.1) * pricePerSaber;
        double robesTotalPrice = padawansCount * pricePerRobe;
        int freeBelts = padawansCount / 6;
        double beltsTotalPrice = (padawansCount - freeBelts) * pricePerBelt;

        double finalSum = lightsaberssTotalPrice + robesTotalPrice + beltsTotalPrice;

        if (finalSum > moneyz) {
            double moneyNeed = finalSum - moneyz;
            System.out.printf("Ivan Cho will need %.2flv more.%n", moneyNeed);
        } else {
            System.out.printf("The money is enough - it would cost %.2flv.%n", finalSum);
        }


    }
}
