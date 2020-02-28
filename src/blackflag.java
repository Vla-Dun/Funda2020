import java.util.Scanner;

public class blackflag {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());
        int plunder = Integer.parseInt(scan.nextLine());
        double target = Double.parseDouble(scan.nextLine());

        double totalP = 0;
        for (int i = 1; i <= days; i++) {
            totalP += plunder;


            if (i % 3 == 0) {
                totalP += plunder * 0.5;
            }
            if (i % 5 == 0) {
                totalP -= 0.3 * totalP;
            }


        }

        if (totalP >= target) {
            System.out.println("ahoy");
        } else {
            double collected = (totalP / target) * 100;
            System.out.println("ahoy");
        }

    }

}


