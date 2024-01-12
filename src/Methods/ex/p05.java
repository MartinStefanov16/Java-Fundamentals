package Methods.ex;

import java.util.Scanner;

import static java.lang.System.in;

public class p05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String product = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());

        priceCalculator(product, amount);


    }

    public static void priceCalculator(String product, int amount) {
        double price = 0;

        switch (product) {
            case "coffee":
                price = amount * 1.50;
                break;
            case "water":
                price = amount * 1.00;
                break;
            case "coke":
                price = amount * 1.40;
                break;
            case "snacks":
                price = amount * 2.00;
                break;
        }

        System.out.printf("%.2f", price);

    }
}
