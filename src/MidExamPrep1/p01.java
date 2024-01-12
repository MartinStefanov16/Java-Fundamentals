package MidExamPrep1;

import java.util.Scanner;

import static java.lang.System.in;

public class p01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String input = scanner.nextLine();

        double sum = 0;

        while (!input.equals("regular") && !input.equals("special")) {
            double currentPartPrice = Double.parseDouble(input);

            if (currentPartPrice <= 0) {
                System.out.println("Invalid price!");
                input = scanner.nextLine();
                continue;
            }

            sum += currentPartPrice;

            input = scanner.nextLine();
        }

        if (sum == 0) {
            System.out.println("Invalid order!");
            return;
        }

        double taxes = sum * 0.20;
        double sumPlusTaxes = sum + taxes;
        double sumSpecial = sumPlusTaxes - (sumPlusTaxes * 0.10);

        System.out.println("Congratulations you've just bought a new computer!");
        System.out.printf("Price without taxes: %.2f$\n", sum);
        System.out.printf("Taxes: %.2f$\n", taxes);
        System.out.println("-----------");

        if (input.equals("regular")) {
            System.out.printf("Total price: %.2f$", sumPlusTaxes);
        } else {
            System.out.printf("Total price: %.2f$",sumSpecial );
        }







    }
}
