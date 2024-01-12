package Methods_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class p10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 17; i <= number; i++) {
            boolean isDivisable = checkIfDivisable(i);
            boolean isContainingOddNumber = checkIfContainsOdd(i);

            if (isDivisable && isContainingOddNumber) {
                System.out.println(i);
            }

        }




    }

    public static boolean checkIfDivisable (int n) {
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sum += lastDigit;
            n /= 10;
        }

        if (sum % 8 == 0) {
            return true;
        } else {
            return false;
        }


    }

    public static boolean checkIfContainsOdd (int n) {


        while (n > 0) {
            int lastDigit = n % 10;

            if (lastDigit % 2 != 0) {
                return true;
            }


            n /= 10;
        }

        return false;

    }
}
