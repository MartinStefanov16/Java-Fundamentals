package TextProccessing_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class p04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        String text = scanner.nextLine();

        for (char ch : text.toCharArray()) {
            char encryptedChar = (char) (ch + 3);
            System.out.print(encryptedChar);

        }


    }
}
