package Lists.ex;

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
                .map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());

                List<Integer> result = new ArrayList<>();

                if (numbers.size() % 2 != 0) {
                    numbers.add(numbers.size() / 2, 0);
                }


        for (int i = 0; i < numbers.size() / 2; i++) {
            int leftDigit = numbers.get(i);
            int rightDigit = numbers.get(numbers.size() - 1 - i);
            result.add(leftDigit + rightDigit);

        }

        for (int num : result) {
            System.out.print(num + " ");
        }









    }
}
