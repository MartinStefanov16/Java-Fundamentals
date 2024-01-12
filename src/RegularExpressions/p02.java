package RegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;

public class p02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String numbers = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\+359([ -])2\\1[0-9]{3}\\1[0-9]{4}\\b");
        Matcher matcher = pattern.matcher(numbers);

        List<String> nums = new ArrayList<>();

        while (matcher.find()) {
            nums.add(matcher.group());
        }

        System.out.println(nums.toString().replace("[", "")
                .replace("]", ""));
    }
}
