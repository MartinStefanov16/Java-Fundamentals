package Methods.ex;

import java.util.Scanner;

import static java.lang.System.in;

public class p06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        calculateArea(width, length);


    }

    public static void calculateArea(int width, int length) {
        System.out.println(width * length);

    }
}
