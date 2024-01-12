package Methods_Exercise.ex;

import java.util.Scanner;

import static java.lang.System.in;

public class p01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        printSmallest(n1,n2,n3);
    }

    public static void printSmallest(int n1, int n2, int n3) {

        if (n1 < n2 && n1 < n3 ) {
            System.out.println(n1);
        } else if (n2 < n3) {
            System.out.println(n2);
        } else {
            System.out.println(n3);
        }

    }
}
