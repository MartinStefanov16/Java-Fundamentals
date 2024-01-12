package Lists.ex;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class p01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

                List<Double> numbersDouble = Arrays.stream(scanner.nextLine().split(" "))
                .map(e -> Double.parseDouble(e))
                .collect(Collectors.toList());

        for (int i = 0; i < numbersDouble.size() - 1; i++) {
            double leftNumber = numbersDouble.get(i);
            double rightNumber = numbersDouble.get(i + 1);
            if (leftNumber == rightNumber) {
                double result = leftNumber + rightNumber;
                numbersDouble.set(i, result);
                numbersDouble.remove(i + 1);
                i = - 1;
            }

        }

        for (double number : numbersDouble) {
            System.out.print(new DecimalFormat("0.##").format(number) + " ");
        }










    }
}
