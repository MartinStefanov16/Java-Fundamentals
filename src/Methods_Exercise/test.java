package Methods_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String input = scanner.nextLine();

        for (char c: input.toCharArray()) {
            if (Character.isDigit(c)) {

                if (Character.isLetter(c)) {

                }



            } else if (Character.isLetter(c)) {
                System.out.println("letter");
            } else {
                System.out.println("not valid");
            }

        }
    }
}
