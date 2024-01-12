package TextProccessing;

import java.util.Scanner;

import static java.lang.System.in;

public class p03B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String key = scanner.nextLine();
        String text = scanner.nextLine();

        while (text.contains(key)) {
            text = text.replace(key, "");

        }

        System.out.println(text);
    }
}
