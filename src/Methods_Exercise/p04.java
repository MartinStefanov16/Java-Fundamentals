package Methods_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class p04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String input = scanner.nextLine();

        boolean isLenghtValid = lenghtCeck(input);
        boolean isCharValid = charCheck(input);
        boolean has2Digits = digitCheck(input);

       if (isLenghtValid && isCharValid && has2Digits) {
           System.out.print("Password is valid");
           return;
       }

       if (!isLenghtValid) {
           System.out.println("Password must be between 6 and 10 characters");
       }

       if (!isCharValid) {
           System.out.println("Password must consist only of letters and digits");
       }

       if (!has2Digits) {
           System.out.println("Password must have at least 2 digits");
       }

    }

    public static boolean lenghtCeck(String pass) {
        if (pass.length() >= 6 && pass.length() <= 10) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean charCheck(String pass) {

        for (char c : pass.toCharArray()) {

            if (!Character.isDigit(c) && !Character.isLetter(c)) {
                return false;
            }


        }
        return true;

    }

    public static boolean digitCheck (String pass) {
        int digitsAmount = 0;

        for (char c: pass.toCharArray()) {
            if (Character.isDigit(c)) {
                digitsAmount++;
            }

        }

        if (digitsAmount >= 2) {
            return true;
        } else {
            return false;
        }


    }

}