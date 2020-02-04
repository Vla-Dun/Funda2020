package eu.tsachev.methods;

public class methodParameters {

    public static void Numbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.printf("%d", i);
        }

    }

    public static void main(String[] args) {
        Numbers(1, 10);
    }
}
