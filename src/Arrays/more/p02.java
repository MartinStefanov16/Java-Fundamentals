package Arrays.more;

import java.util.Scanner;

import static java.lang.System.in;

public class p02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int numbersAmount = Integer.parseInt(scanner.nextLine());

        int[] array = new int[numbersAmount];

        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }


        for (int i = array.length - 1 ; i >= 0 ; i--) {
            System.out.print(array[i] + " ");

        }
    }
}
