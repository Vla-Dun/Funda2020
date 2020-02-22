package eu.tsachev.advertisement;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random randPhrase = new Random();

        String[] phrase = {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String[] event = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] author = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};


        String wordOne = phrase[randPhrase.nextInt(phrase.length)];
        String wordTwo = event[randPhrase.nextInt(event.length)];
        String wordThree = author[randPhrase.nextInt(author.length)];
        String wordFour = cities[randPhrase.nextInt(cities.length)];


        System.out.printf("%s %s %s - %s%n", wordOne, wordTwo, wordThree, wordFour);

    }
}

