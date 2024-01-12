package Methods_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        printSmallestNumber(firstNumber, secondNumber, thirdNumber);
    }


    public static void printSmallestNumber (int n1, int n2, int n3) {

        if (n1 < n2 && n1 < n3) {
            System.out.println(n1);
        } else if (n2 < 1 && n2 < n3) {
            System.out.println(n2);
        } else {
            System.out.println(n3);
        }

    }
}
