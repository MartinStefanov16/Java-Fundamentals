package Arrays.more;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class p07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int[] temp = new int[array.length];
        temp = array;

        for (int i = 0; i < array.length - 1; i++) {
            int[] current = new int[temp.length - 1];
            for (int j = 0; j <= current.length - 1; j++) {
                current[j] = temp[j] + temp[j + 1];
            }
            temp = current;



        }
        System.out.println(temp[0]);
    }
}
