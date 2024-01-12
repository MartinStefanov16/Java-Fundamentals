package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;

public class p03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String dates = scanner.nextLine();

        Pattern pattern = Pattern.compile("(?<date>[0-9]{2})([\\/.-])(?<month>[A-Z][a-z]{2})\\2(?<year>[0-9]{4})");
        Matcher matcher = pattern.matcher(dates);

        while (matcher.find()) {
            String date = matcher.group("date");
            String month = matcher.group("month");
            String year = matcher.group("year");

            System.out.printf("Day: %s, Month: %s, Year: %s\n", date, month, year);
        }
    }
}
