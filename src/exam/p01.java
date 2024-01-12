package exam;

import java.util.Scanner;

import static java.lang.System.in;

public class p01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        //int cookiePerDay = Integer.parseInt(scanner.nextLine());
        double cookiePerDay = Double.parseDouble(scanner.nextLine());
        int workersAmount = Integer.parseInt(scanner.nextLine());
        //double workersAmount = Double.parseDouble(scanner.nextLine());
        int rivalFactoryCookies = Integer.parseInt(scanner.nextLine());


        double cookiesProduced = 0;

        for (int day = 1; day <= 30; day++) {


            if (day % 3 == 0) {
                cookiesProduced += Math.floor((workersAmount * cookiePerDay) * 0.75);

            } else {
                cookiesProduced += workersAmount * cookiePerDay;
            }

        }
        int cookiesPrint = (int)cookiesProduced;


        System.out.printf("You have produced %d biscuits for the past month.\n", cookiesPrint);

        if (cookiesPrint > rivalFactoryCookies) {
            double difference = cookiesProduced - rivalFactoryCookies;
            double result = (difference / rivalFactoryCookies) * 100;



            System.out.printf("You produce %.2f percent more biscuits.", result);
        } else {
            double difference = rivalFactoryCookies - cookiesProduced;
            double result = (difference / rivalFactoryCookies) * 100;
            System.out.printf("You produce %.2f percent less biscuits.", result);
        }

    }
}
