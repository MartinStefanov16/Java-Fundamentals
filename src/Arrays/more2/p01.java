package Arrays.more2;

import java.util.Scanner;

import static java.lang.System.in;

public class p01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();

            int vowel = 0;
            int constant = 0;


            for (int j = 0; j <= input.length() - 1; j++) {

                if (input.charAt(j) == 'a' || input.charAt(j) == 'e' || input.charAt(j) == 'i' || input.charAt(j) == 'o' || input.charAt(j) == 'u') {
                    vowel = input.charAt(j) * input.length();
                } else {
                    constant = input.charAt(j) / input.length();
                }



            }
            System.out.println(vowel + constant);


        }

    }
}
