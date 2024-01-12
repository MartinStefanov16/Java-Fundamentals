package TextProccessing;

import java.util.Scanner;

import static java.lang.System.in;

public class p02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String[] words = scanner.nextLine().split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            int wordLength = word.length();
            result.append(repeatWords(wordLength, word));

        }
        System.out.println(result.toString());



    }

    private static String repeatWords(int wordLength, String word) {
        StringBuilder results = new StringBuilder();

        for (int i = 0; i < wordLength; i++) {
            results.append(word);

        }

        return results.toString();
    }
}
