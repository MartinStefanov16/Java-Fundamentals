package BasicSyntax_ConditionalStatements_And_Loops_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class p07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String input = scanner.nextLine();
        double coin = Double.parseDouble(input);
        double money = 0;


        while (!input.equals("Start")) {
            coin = Double.parseDouble(input);

            if (coin == 0.1) {
                money += 0.1;
            } else if (coin == 0.2) {
                money += 0.2;
            } else if (coin == 0.5) {
                money += 0.5;
            } else if (coin == 1) {
                money += 1;
            } else if (coin == 2) {
                money += 2;
            } else {
                System.out.printf("Cannot accept %.2f\n", coin);

            }

            input = scanner.nextLine();
        }

        double nutsPrice = 2.0;
        double waterPrice = 0.7;
        double crispsPrice = 1.5;
        double sodaPrice = 0.8;
        double cokePrice = 1.0;


        input = scanner.nextLine();
        while (!input.equals("End")) {

            switch (input) {
                case "Nuts":

                    if (money >= nutsPrice) {
                        System.out.println("Purchased Nuts");
                        money -= nutsPrice;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }

                    break;
                case "Water":

                    if (money >= waterPrice) {
                        System.out.println("Purchased Water");
                        money -= waterPrice;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }

                    break;
                case "Crisps":

                    if (money >= crispsPrice) {
                        System.out.println("Purchased Crisps");
                        money -= crispsPrice;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }

                    break;
                case "Soda":

                    if (money >= sodaPrice) {
                        System.out.println("Purchased Soda");
                        money -= sodaPrice;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }

                    break;
                case "Coke":

                    if (money >= cokePrice) {
                        System.out.println("Purchased Coke");
                        money -= cokePrice;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }

                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            input = scanner.nextLine();

        }

        System.out.printf("Change: %.2f", money);

    }
}
