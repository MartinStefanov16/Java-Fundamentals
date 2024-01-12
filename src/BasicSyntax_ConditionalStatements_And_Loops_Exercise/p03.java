package BasicSyntax_ConditionalStatements_And_Loops_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class p03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int people = Integer.parseInt(scanner.nextLine());
       String type = scanner.nextLine();
       String day = scanner.nextLine();



        double price = 0;

        switch (type) {
            case "Students":

                switch (day) {
                    case "Friday":
                    price = 8.45;
                    break;
                    case "Saturday":
                        price = 9.80;
                        break;
                    case "Sunday":
                        price = 10.46;
                        break;
                }

                break;
            case "Business":
                switch (day) {
                    case "Friday":
                        price = 10.90;
                        break;
                    case "Saturday":
                        price = 15.60;
                        break;
                    case "Sunday":
                        price = 16;
                        break;
                }
                break;
            case "Regular":
                switch (day) {
                    case "Friday":
                        price = 15;
                        break;
                    case "Saturday":
                        price = 20;
                        break;
                    case "Sunday":
                        price = 22.50;
                        break;
                }
                break;

        }

        double priceNoDiscount = people * price;

        if (type.equals("Students") && people >= 30) {
            priceNoDiscount = priceNoDiscount - (priceNoDiscount * 0.15);
        }

        System.out.printf("Total price: %.2f", priceNoDiscount);

    }
}
