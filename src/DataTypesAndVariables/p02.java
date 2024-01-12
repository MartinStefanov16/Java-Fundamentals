package DataTypesAndVariables;

import java.util.Scanner;

import static java.lang.System.in;

public class p02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (number > 0) {
            int lastDigit =  number % 10;
            sum += lastDigit;
            number /= 10;
        }

        System.out.println(sum);
    }
}
