package Arrays;

import java.util.Scanner;

import static java.lang.System.in;

// takes array string from console
// reverses it

public class reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String[] elements = scanner.nextLine().split(" ");
        String[] reversed = new String[elements.length];

        int reversedInd = 0;
        for (int i = elements.length - 1; i >= 0; i--) {
            reversed[reversedInd] = elements[i];
            reversedInd += 1;
        }

        System.out.println(String.join(" ", reversed));
    }
}
