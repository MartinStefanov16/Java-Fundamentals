package RegularExpressionsEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;

public class p06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int n = Integer.parseInt(scanner.nextLine());

        Pattern pattern = Pattern.compile("_\\.+(?<pass>[A-Z][A-Za-z0-9]{4,}[A-Z])_\\.+");


        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();
            Matcher matcher = pattern.matcher(text);

            if (matcher.find()) {
                String passText = matcher.group("pass");
                StringBuilder sb = new StringBuilder();

                for (char ch : passText.toCharArray()) {
                    if (Character.isDigit(ch)) {
                        sb.append(ch);
                    }
                }

                if (sb.length() == 0) {
                    System.out.println("Group: default");
                } else {
                    System.out.printf("Group: %s\n", sb);
                }



            } else {
                System.out.println("Invalid pass!");
            }

        }


    }
}