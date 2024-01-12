package Methods_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class p09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String input = scanner.nextLine();
        //if (Arrays.equals(array, arrayTwo))

        while (!input.equals("END")) {


            System.out.println(check(input));
            input = scanner.nextLine();
        }



    }

    public static boolean check (String text) {
        String reversedText = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversedText += text.charAt(i);

        }

        return text.equals(reversedText);


    }
}
