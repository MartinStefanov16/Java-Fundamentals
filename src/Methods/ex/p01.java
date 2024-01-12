package Methods.ex;

import java.util.Scanner;

import static java.lang.System.in;

public class p01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int n = Integer.parseInt(scanner.nextLine());

        printSign(n);

    }

    public static void printSign(int number) {

        if (number < 0) {
            System.out.printf("The number %d is negative.", number);
        } else if (number > 0) {
            System.out.printf("The number %d is positive.", number);
        } else {
            System.out.println("The number 0 is zero.");
        }

    }
}
