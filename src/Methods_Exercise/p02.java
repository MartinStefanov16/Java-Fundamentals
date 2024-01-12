package Methods_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class p02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String input = scanner.nextLine().toLowerCase();
        getWord(input);
    }


    public static void getWord(String word) {
        int count = 0;
// a e i o u
        for (char letter: word.toCharArray()) {

            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                count++;
            }

        }
        System.out.println(count);




    }
}
