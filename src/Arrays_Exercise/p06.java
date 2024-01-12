package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class p06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int leftSum = 0;
        int rightSum = 0;

        for (int index = 0; index < array.length; index++) {
            int currentNumber =  array[index];

            for (int i = 0; i < index; i++) {
                leftSum += array[i];
            }

            for (int j = index + 1; j < array.length; j++) {
                rightSum += array[j];
            }

            if (leftSum == rightSum) {
                System.out.println(index);
                return;
            } else {
                leftSum = 0;
                rightSum = 0;
            }



        }

        System.out.println("no");

    }
}
