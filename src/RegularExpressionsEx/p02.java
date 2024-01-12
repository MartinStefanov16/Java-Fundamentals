package RegularExpressionsEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;

public class p02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        String input = scanner.nextLine();

        double sum = 0.0;

        while (!input.equals("end of shift")) {
            //Pattern pattern = Pattern.compile("%(?<name>[A-Z][a-z]+)%<(?<product>[A-Za-z]+)>\\|(?<amount>\\d)\\|(?<price>[0-9]+\\.?[0-9]+)\\$");
            //Pattern pattern = Pattern.compile("%(?<name>[A-Z][a-z]+)%<(?<product>\\w+)>\\w*\\|(?<amount>\\d+)\\|[A-Za-z]*(?<price>[0-9]+\\.?[0-9]*)\\$");
            //Pattern pattern = Pattern.compile("%(?<name>[A-Z][a-z]+)%\\w*<(?<product>\\w+)>\\w*\\|(?<amount>\\d+)\\|\\w*(?<price>[0-9]+\\.?[0-9]*)\\$");
            Pattern pattern = Pattern.compile("%(?<name>[A-Z][a-z]+)%\\w*<(?<product>\\w+)>\\w*\\|(?<amount>\\d+)\\|[A-Za-z]*(?<price>[0-9]+\\.?[0-9]*)\\$");
            Matcher matcher = pattern.matcher(input);



            if (matcher.find()) {
                String name = matcher.group("name");
                String product = matcher.group("product");
                int amount = Integer.parseInt(matcher.group("amount"));
                double price = Double.parseDouble(matcher.group("price"));
                sum += amount * price;

                System.out.printf("%s: %s - %.2f\n", name, product, amount * price);

            }

            input = scanner.nextLine();
        }

        System.out.printf("Total income: %.2f", sum);

    }
}
