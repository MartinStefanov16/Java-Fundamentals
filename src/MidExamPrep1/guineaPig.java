package MidExamPrep1;

import java.util.Scanner;

import static java.lang.System.in;

public class guineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        double foodKg = Double.parseDouble(scanner.nextLine());
        double hayWeightKg = Double.parseDouble(scanner.nextLine());
        double coverQuantityKg = Double.parseDouble(scanner.nextLine());
        double pigWightKg = Double.parseDouble(scanner.nextLine());

        double foodGr = foodKg * 1000;
        double hayGr = hayWeightKg * 1000;
        double coverGr = coverQuantityKg * 1000;
        double pigGr = pigWightKg * 1000;

        for (int day = 1; day <= 30; day++) {
            foodGr -= 300;
            if (day % 2 == 0) {
                hayGr = hayGr - (foodGr * 0.05);
            }

            if (day % 3 == 0) {
                coverGr = coverGr - (pigGr / 3);
            }

            if (foodGr <= 0 || hayGr <= 0 || coverGr <= 0) {
                System.out.println("Merry must go to the pet store!");
                return;
            }

        }

        System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",foodGr / 1000, hayGr / 1000,coverGr / 1000);
    }
}
