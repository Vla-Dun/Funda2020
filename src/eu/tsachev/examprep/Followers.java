package eu.tsachev.examprep;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Followers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Map<String, int[]> followers = new TreeMap<>();
        String input = "";
        while (!"Log out".equals(input = console.nextLine())) {
            String[] commands = input.split(": ");
            switch (commands[0]) {
                case "New follower":
                    newFollower(followers, commands[1]);
                    break;
                case "Like":
                    like(followers, commands[1], Integer.parseInt(commands[2]));
                    break;
                case "Comment":
                    comment(followers, commands[1]);
                    break;
                case "Blocked":
                    blocked(followers, commands[1]);
                    break;
            }

        }
        System.out.println(followers.size() + " followers");
        followers
                .entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue()[0] - e1.getValue()[0])
                .forEach(e -> System.out.printf("%s: %d%n", e.getKey(), e.getValue()[0] + e.getValue()[1]));
    }

    private static void blocked(Map<String, int[]> followers, String username) {
        if (followers.containsKey(username))
            followers.remove(username);
        else
            System.out.printf("%s doesn't exist.%n", username);
    }

    private static void comment(Map<String, int[]> followers, String username) {
        followers.putIfAbsent(username, new int[]{0, 0});
        followers.put(username, new int[]{followers.get(username)[0], followers.get(username)[1] + 1});
    }

    private static void newFollower(Map<String, int[]> followers, String username) {
        followers.putIfAbsent(username, new int[]{0, 0});
    }

    private static void like(Map<String, int[]> followers, String username, int count) {
        followers.putIfAbsent(username, new int[]{0, 0});
        followers.put(username, new int[]{count + followers.get(username)[0], followers.get(username)[1]});
    }
}