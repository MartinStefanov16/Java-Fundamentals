package Methods.ex;

import java.util.Scanner;

import static java.lang.System.in;

public class p03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int n = Integer.parseInt(scanner.nextLine());

        printTableFirstHalf(n);
        printTableSecondHalf(n);

    }

    public static void printTableFirstHalf(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    public static void printTableSecondHalf(int n) {

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
