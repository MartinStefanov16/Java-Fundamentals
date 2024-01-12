package Arrays.more;

import java.util.Scanner;

import static java.lang.System.in;

public class p04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String[] array = scanner.nextLine().split(" ");
        String[] arrayReversed = new String[array.length];

        int index = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            arrayReversed[index] = array[i];
            index++;
        }

        for (String print: arrayReversed) {
            System.out.print(print + " ");

        }

    }
}
