package Methods_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class p07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());

        print(n);

    }

    public static void print (int n) {

        for (int rows = 1; rows <= n; rows++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(n + " ");
            }
            System.out.println();

        }


    }
}
