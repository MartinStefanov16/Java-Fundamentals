package DataTypesAndVariables;

import java.util.Scanner;

import static java.lang.System.in;

public class p05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());

        for (int i = startNumber; i <= endNumber; i++) {
            System.out.print((char) i + " ");

        }
    }
}
