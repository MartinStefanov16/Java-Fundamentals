package TextProccessing_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class p08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String[] input = scanner.nextLine().split("\\s+");
        System.out.println();

        double sum = 0;

        for (String text : input) {
            char leftChar = text.charAt(0);
            char rightChar = text.charAt(text.length()-1);
            double number = Double.parseDouble(text.replace(leftChar, ' ')
                    .replace(rightChar, ' ')
                    .trim());

            double modifiedNumber = getModifiedNumber(leftChar,rightChar,number);
            sum += modifiedNumber;


        }

        System.out.printf("%.2f",sum);

    }

    private static double getModifiedNumber(char leftChar, char rightChar, double number) {

        if (Character.isUpperCase(leftChar)) {
            int pos = (int) leftChar - 64;
            number /= pos;
        } else {
            int pos = (int) leftChar - 96;
            number *= pos;
        }

        if (Character.isUpperCase(rightChar)) {
            int pos = (int) rightChar - 64;
            number -= pos;
        } else {
            int pos = (int) rightChar - 96;
            number += pos;
        }


        return number;
    }
}
