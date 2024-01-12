package TextProccessing_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class p02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String[] input = scanner.nextLine().split(" ");
        String leftWord = input[0];
        String rightWord = input[1];

        getSum(leftWord,rightWord);



    }

    private static void getSum(String leftWord, String rightWord) {
        int maxLength = Math.max(leftWord.length() ,rightWord.length());
        int minLength = Math.min(leftWord.length() ,rightWord.length());

        int sum = 0;

        for (int i = 0; i < minLength; i++) {
            sum += leftWord.charAt(i) * rightWord.charAt(i);
        }

        if (maxLength == minLength) {
            System.out.println(sum);
        } else if (leftWord.length() >= maxLength) {
            for (int i = rightWord.length(); i < maxLength; i++) {
                sum += leftWord.charAt(i);
            }
            System.out.println(sum);
        } else if (rightWord.length() >= maxLength) {
            for (int i = leftWord.length(); i < maxLength; i++) {
                sum += rightWord.charAt(i);
            }
            System.out.println(sum);
        }


    }
}
