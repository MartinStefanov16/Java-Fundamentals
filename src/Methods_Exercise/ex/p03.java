package Methods_Exercise.ex;

import java.util.Scanner;

import static java.lang.System.in;

public class p03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);

        printChars(firstChar, secondChar);

    }

    public static void printChars(char c1, char c2) {

        if (c1 < c2) {

            for (int i = c1 + 1; i < c2; i++) {
                System.out.print((char) i + " ");
            }
        } else {
            for (int i = c2 + 1; i < c1; i++) {
                System.out.print((char) i + " ");
            }

        }
    }
}