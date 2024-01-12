package TextProccessing_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class p06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        char[] text = scanner.nextLine().toCharArray();

        StringBuilder result = new StringBuilder();
        result.append(text[0]);

        for (int i = 1; i < text.length; i++) {
            char lastChar = text[i-1];
            char currentChar = text[i];

            // if a new char is found, add it to SB

            if (lastChar != currentChar) {
                result.append(currentChar);
            }




        }
        System.out.println(result.toString());
    }
}
