package Lists;

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
                double newDigit = currentDigit + nextDigit;
                numbers.remove(i + 1);
                numbers.set(i, newDigit);
                i = -1;

            }


        }
        for (double digit : numbers) {
            System.out.print(new DecimalFormat("0.##").format(digit) + " ");
        }

        //System.out.println(new DecimalFormat("0.##").format(numbers));

    }
}
