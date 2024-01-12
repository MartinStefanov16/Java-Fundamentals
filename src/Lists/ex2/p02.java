package Lists.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class p02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> newNumbers = new ArrayList<>();

        if (numbers.size() % 2 != 0) {
            numbers.add(numbers.size() / 2, 0);
        }

        for (int i = 0; i < numbers.size() / 2; i++) {
            int currentNum = numbers.get(i);
            int oppositeNum = numbers.get(numbers.size() - 1 - i );
            newNumbers.add(currentNum + oppositeNum);

        }

        for (int n : newNumbers) {
            System.out.print(n + " ");
        }




    }
}
