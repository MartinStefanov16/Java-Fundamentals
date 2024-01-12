package Methods;

import java.util.Scanner;

import static java.lang.System.in;

public class p01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int number = Integer.parseInt(scanner.nextLine());

        printSign(number);
    }

    public static void printSign(int number) {
        if (number == 0) {
            System.out.println("The number 0 is zero.");
        }
    }

}
