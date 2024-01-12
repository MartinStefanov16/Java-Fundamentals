package RegularExpressionsEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;

public class p01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String input = scanner.nextLine();

        double sum = 0.0;
        List<String> purchasedFurniture = new ArrayList<>();

        while (!input.equals("Purchase")) {
            Pattern pattern = Pattern.compile(">>(?<furniture>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>[0-9]+)");
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                purchasedFurniture.add(matcher.group("furniture"));
                System.out.println();
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                sum += price * quantity;
            }


            input = scanner.nextLine();
        }

        System.out.println("Bought furniture:");
        for (String furniture : purchasedFurniture) {
            System.out.println(furniture);
        }
        System.out.printf("Total money spend: %.2f", sum);

    }
}
