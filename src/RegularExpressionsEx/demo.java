package RegularExpressionsEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String text = ">Hello1<";

        Pattern pattern = Pattern.compile("(?<pass>[A-Za-z0-9]+)");
        Matcher matcher = pattern.matcher(text);

        System.out.println(matcher.group("pass"));
    }
}
