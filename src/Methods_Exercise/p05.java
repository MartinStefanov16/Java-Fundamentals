package Methods_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class p05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        int sum = sumOfFirstTwo(firstNumber, secondNumber);
        int diff = subtract(sum, thirdNumber);
        System.out.println(diff);
    }



    public static int sumOfFirstTwo (int one, int two) {
        return one + two;
    }

    public static int subtract (int n1, int n2) {
        return n1 - n2;
    }

}
