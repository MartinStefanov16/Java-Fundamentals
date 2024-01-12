package Lists.ex2;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class p01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(e -> Double.parseDouble(e))
                .collect(Collectors.toList());

        for (int i = 0; i < numbers.size() - 1; i++) {
            double currentDigit = numbers.get(i);
            double nextDigit = numbers.get(i + 1);

            if (currentDigit == nextDigit) {
                numbers.set(i, currentDigit * 2);
                numbers.remove(i + 1);
                i = -1;
            }

        }
        for (double n : numbers) {
            System.out.print(new DecimalFormat("0.##").format(n) + " ");
        }
    }
}
