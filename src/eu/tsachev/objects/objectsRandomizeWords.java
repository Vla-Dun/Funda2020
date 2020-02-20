package eu.tsachev.objects;

import java.util.Random;
import java.util.Scanner;

public class objectsRandomizeWords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] word = scan.nextLine().split(" ");
        Random rand = new Random();
        String tmp;

        for (int pos1 = 0; pos1 < word.length; pos1++) {

            int pos2 = rand.nextInt(word.length);

            tmp = word[pos1];
            word[pos1] = word[pos2];
            word[pos2] = tmp;


        }
        System.out.println(String.join(System.lineSeparator(), word));


    }
}

