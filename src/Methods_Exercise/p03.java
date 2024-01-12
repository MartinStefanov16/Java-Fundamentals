package Methods_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class p03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);

        printSymbols(firstSymbol, secondSymbol);
    }

    public static void printSymbols (char first, char second) {

        if (first < second) {

            for (char symbol = (char) (first + 1); symbol < second; symbol++) {
                System.out.print(symbol + " ");
            }

        } else {
            for (char symbol = (char) (second + 1); symbol < first; symbol++) {
                System.out.print(symbol + " ");
            }

        }
    }
}
