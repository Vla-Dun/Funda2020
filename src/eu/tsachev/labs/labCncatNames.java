package eu.tsachev.labs;

        import java.util.Scanner;

public class labCncatNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine(), lastname = scan.nextLine(), dellimiter = scan.nextLine();

        System.out.println(name+dellimiter+lastname);



    }
}
