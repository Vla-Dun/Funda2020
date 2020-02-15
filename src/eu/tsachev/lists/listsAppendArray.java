package eu.tsachev.lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listsAppendArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> numbers = Arrays.stream(scan.nextLine().split("\\s+")).collect(Collectors.toList());
        String[] data = scan.nextLine().split("\\s+");

        String bombNumber = data[0] ;
        int sizeOfBomb = Integer.parseInt(data[1]);

        while (numbers.contains(bombNumber)){
            int elementIndex = numbers.indexOf(bombNumber);

            int left = Math.max(0, elementIndex - sizeOfBomb);
            int right = Math.min( elementIndex + sizeOfBomb, numbers.size() - 1);

            for (int i = right; i >=left ; i--) {
                numbers.remove(i);
            }
        }
        System.out.println(numbers.stream().mapToInt(Integer::parseInt).sum());


    }
}

