package Methods.ex;

import java.util.Scanner;

import static java.lang.System.in;

public class p07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String text = scanner.nextLine();
        int repeat = Integer.parseInt(scanner.nextLine());

        printString(text, repeat);
    }

    public static void printString(String text, int repeat) {


        for (int i = 1; i <= repeat; i++) {
            System.out.print(text);

        }


    }
}
