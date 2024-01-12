package Methods_Exercise.ex;

import java.util.Scanner;

import static java.lang.System.in;

public class p04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        String input = scanner.nextLine();

        boolean isLengthValid = checkLength(input);
        boolean areCharsValid = checkChars(input);
        boolean areThere2Digits = check2Digits(input);


        if (isLengthValid && areCharsValid && areThere2Digits) {
            System.out.println("Password is valid");
            return;
        }

        if (!isLengthValid) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        if (!areCharsValid) {
            System.out.println("Password must consist only of letters and digits");
        }

        if (!areThere2Digits) {
            System.out.println("Password must have at least 2 digits");
        }

    }


    public static boolean checkLength(String pass) {

        if (pass.length() >= 6 && pass.length() <= 10) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkChars(String pass) {

        for (char chars: pass.toCharArray()) {

            if (!Character.isLetter(chars) && !Character.isDigit(chars)) {
                return false;
            }

        }
        return true;



    }

    public static boolean check2Digits(String pass) {
        int digitsCount = 0;

        for (char chars: pass.toCharArray()) {

            if (Character.isDigit(chars)) {
                digitsCount++;
            }

        }

        if (digitsCount >= 2) {
            return true;
        } else {
            return false;
        }


    }
}
