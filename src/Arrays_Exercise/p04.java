package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class p04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= rotations; i++) {
            int takenNumber = numbers[0];

            for (int j = 1; j <= numbers.length -1; j++) {
                numbers[j - 1] = numbers[j];
            }
            numbers[numbers.length -1] = takenNumber;

        }

        for (int num: numbers) {
            System.out.print(num + " ");

        }


    }
}
