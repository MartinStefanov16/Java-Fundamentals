package Methods_Exercise.ex;

import java.util.Scanner;

import static java.lang.System.in;

public class p02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        String input = scanner.nextLine();

        System.out.print(countVowels(input));

    }

    public static int countVowels(String text) {
        text = text.toLowerCase();
        int vowelCount = 0;

        for (int i = 0; i <= text.length() - 1; i++) {

            if (text.charAt(i) == 'a'
            || text.charAt(i) == 'e'
                    || text.charAt(i) == 'i'
                    || text.charAt(i) == 'o'
                    || text.charAt(i) == 'u') {

                vowelCount++;

            }

        }

        return vowelCount;
    }
}
