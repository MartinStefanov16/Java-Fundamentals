package ExamSuper;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("([@|#]+)(?<color>[a-z]{3,})([@|#]+)([^A-Za-z0-9]*)(\\/+)(?<amount>[0-9]+)(\\/+)");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            String color = matcher.group("color");
            String amount = matcher.group("amount");

            System.out.printf("You found %s %s eggs!\n", amount, color);


        }
        System.out.println();
    }
}
