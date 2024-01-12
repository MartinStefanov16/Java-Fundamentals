package Arrays_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class p01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int wagons = Integer.parseInt(scanner.nextLine());

        int[] passengers = new int[wagons];
        int passengersTotal = 0;



        for (int i = 0; i <= wagons - 1; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            passengers[i] =input;
            passengersTotal += input;


        }

        for (int eachWagon: passengers) {
            System.out.print(eachWagon + " ");

        }
        System.out.println();
        System.out.println(passengersTotal);



    }
}
