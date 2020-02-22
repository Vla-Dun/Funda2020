package eu.tsachev.article;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Article> articles = new ArrayList<>();

        String[] input = scan.nextLine().split(", ");

        String title = input[0];
        String content = input[1];
        String author = input[2];

        Article art = new Article(title, content, author);

        int edits = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < edits; i++) {
            String[] inputs = scan.nextLine().split(": ");

            switch (inputs[0]) {
                case "Edit":
                    art.setContent(inputs[1]);
                    break;
                case "ChangeAuthor":
                    art.setAuthor(inputs[1]);
                    break;
                case "Rename":
                    art.setTitle(inputs[1]);
                    break;
            }

//            articles.add(art);
        }

        System.out.println(art);


    }


}

