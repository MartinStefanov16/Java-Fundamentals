package Methods.ex;

import java.util.Scanner;

import static java.lang.System.in;

public class p10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int input = Integer.parseInt(scanner.nextLine());

        System.out.print(getSum(input));

    }

    public static int getSum(int number) {
        number = Math.abs(number);

        int sumEven = 0;
        int sumOdd = 0;

        while (number > 0) {
            int currentDigit = number % 10;
            if (currentDigit % 2 == 0) {
                sumEven += currentDigit;
            } else {
                sumOdd += currentDigit;
            }
            number /= 10;

        }

        return Math.abs(sumOdd) * Math.abs(sumEven);


    }
}
