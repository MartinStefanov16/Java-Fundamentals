package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class p08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int magicNum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i +1; j < numbers.length; j++) {

                if (numbers[i] + numbers[j] == magicNum) {
                    System.out.printf("%d %d\n", numbers[i], numbers[j]);
                }

            }

        }


    }
}
