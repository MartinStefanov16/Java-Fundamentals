package DataTypesAndVariables;

import java.util.Scanner;

import static java.lang.System.in;

public class p04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int charCount = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= charCount; i++) {
            char symbol = scanner.nextLine().charAt(0);
            int code = (int) symbol;
            sum += code;

        }
        System.out.println("The sum equals: " + sum);
    }
}
