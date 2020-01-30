package eu.tsachev.random;

        import java.util.Scanner;

public class traningPrintSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inputStartNum = Integer.parseInt(scan.nextLine());
        int inputEndNum = Integer.parseInt(scan.nextLine()), finalCount = 0;

        while (inputEndNum >= inputStartNum) {
            System.out.print(inputStartNum + " ");
            finalCount += inputStartNum;
            inputStartNum++;
        }
        System.out.println();
        System.out.println("Sum: " + finalCount);

    }
}
