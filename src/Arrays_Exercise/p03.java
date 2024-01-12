package Arrays_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class p03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int rows = Integer.parseInt(scanner.nextLine());

        int[] row1 = new int[rows];
        int[] row2 = new int[rows];



        for (int i = 0; i < rows; i++) {
            String input = scanner.nextLine();
            String[] numbers = input.split(" ");
            int number1 =  Integer.parseInt(numbers[0]);
            int number2 =  Integer.parseInt(numbers[1]);

            if (i % 2 == 0) {
                row1[i] = number1;
                row2[i] = number2;
            } else {
                row1[i] = number2;
                row2[i] = number1;
            }
        }

        for (int printRow1: row1) {
            System.out.print(printRow1 + " ");
        }
        System.out.println();
        for (int printRow2: row2) {
            System.out.print(printRow2 + " ");
        }


    }
}
