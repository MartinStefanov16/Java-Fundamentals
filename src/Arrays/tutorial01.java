package Arrays;

import java.util.Scanner;

import static java.lang.System.in;

// set the lenght of an array
// and populate it from the scanner

public class tutorial01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int n = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println();
    }
}
