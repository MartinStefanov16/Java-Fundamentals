package Arrays;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class p06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int[] firstSequence = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int[] secondSequence = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int sum = 0;

        for (int i = 0; i < firstSequence.length; i++) {

            if (firstSequence[i] != secondSequence[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                return;
            } else {
                sum += firstSequence[i];
            }

        }

        System.out.printf("Arrays are identical. Sum: %d", sum);



    }
}
