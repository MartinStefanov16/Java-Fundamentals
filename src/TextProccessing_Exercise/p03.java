package TextProccessing_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class p03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String[] input = scanner.nextLine().split("[.\\\\]");
        System.out.printf("File name: %s\n", input[input.length-2]);
        System.out.printf("File extension: %s", input[input.length-1]);
    }
}
