package Arrays;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class p05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        
        int odd = 0;
        int even = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                even += number;
            } else {
                odd += number;
            }

        }

        System.out.println(even - odd);

    }
}
