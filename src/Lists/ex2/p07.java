package Lists.ex2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class p07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < 0) {
                numbers.remove(Integer.valueOf(numbers.get(i)));
                i = -1;
            }

        }
        if (numbers.size() <= 0) {
            System.out.println("empty");
        } else {
            Collections.reverse(numbers);

            for (int n : numbers) {
                System.out.print(n + " ");
            }

        }
    }
}
