package exam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class p02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

                List<String> list = Arrays.stream(scanner.nextLine().split(">>"))
                .collect(Collectors.toList());

                double totalTaxCollected = 0;

        for (int i = 0; i < list.size(); i++) {
            String car = list.get(i).split(" ")[0];
            int year = Integer.parseInt(list.get(i).split(" ")[1]);
            int kmTraveled = Integer.parseInt(list.get(i).split(" ")[2]);

            double initialTax = 0;
            double totalVehicleTax = 0;



            switch (car) {
                case "family":
                    initialTax = 50;
                    totalVehicleTax = (initialTax - (year * 5)) + ((kmTraveled / 3000) * 12);
                    totalTaxCollected += totalVehicleTax;

                    break;
                case "heavyDuty":
                    initialTax = 80;
                    totalVehicleTax = (initialTax - (year * 8)) + ((kmTraveled / 9000) * 14);
                    totalTaxCollected += totalVehicleTax;
                    break;
                case "sports":
                    initialTax = 100;
                    totalVehicleTax = (initialTax - (year * 9)) + ((kmTraveled / 2000) * 18);
                    totalTaxCollected += totalVehicleTax;
                    break;
                default:
                    System.out.println("Invalid car type.");
                    continue;

            }

            System.out.printf("A %s car will pay %.2f euros in taxes.\n", car, totalVehicleTax);

        }

        System.out.printf("The National Revenue Agency will collect %.2f euros in taxes.", totalTaxCollected);




    }
}
