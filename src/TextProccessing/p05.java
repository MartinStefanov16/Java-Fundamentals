package TextProccessing;

import java.util.Scanner;

import static java.lang.System.in;

public class p05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String text = scanner.nextLine();

        StringBuilder numbers = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder other = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isDigit(ch)) {
                numbers.append(ch);
            } else if (Character.isLetter(ch)) {
                letters.append(ch);
            } else {
                other.append(ch);
            }

        }
        System.out.println(numbers);
        System.out.println(letters);
        System.out.println(other);


    }
}
