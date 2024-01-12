package Methods_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class p08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        double factorial1 = factorial(firstNumber);
        double factorial2 = factorial(secondNumber);

        System.out.printf("%.2f", factorial1 / factorial2);

    }

    public static long factorial (int n1) {
        long fact = 1;
        for (int i = 1; i <= n1; i++) {
            fact = fact * i;
        }
        return fact;


    }
}
