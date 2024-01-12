package Methods_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class p06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        String text = scanner.nextLine();

        printMiddle(text);










    }

    public static void printMiddle (String text) {
        int lenght = text.length();

        if (lenght % 2 != 0) {
            int indexOfMiddleChar = lenght / 2;
            System.out.println(text.charAt(indexOfMiddleChar));

        } else {
            int firstChar = (lenght / 2) - 1;
            int secondChar = lenght / 2;
            System.out.print(text.charAt(firstChar));
            System.out.print(text.charAt(secondChar));

        }

    }
}
