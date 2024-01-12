package TextProccessing;

import java.util.Scanner;

import static java.lang.System.in;

public class p04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();



        for (String word : bannedWords) {
            int wordLength = word.length();
            if (text.contains(word)) {
                text = text.replace(word, generateAsterix(word, wordLength));
            }

        }

        System.out.println(text);
    }

    private static String generateAsterix(String word, int wordLength) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < wordLength; i++) {
            sb.append("*");

        }
        return sb.toString();
    }
}
