package TextProccessing_Exercise;

import java.math.BigInteger;
import java.util.Scanner;

import static java.lang.System.in;

public class p05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        BigInteger firstNumber = new BigInteger(scanner.nextLine());
        BigInteger secondNumber = new BigInteger(scanner.nextLine());

        System.out.println(firstNumber.multiply(secondNumber));

    }
}
