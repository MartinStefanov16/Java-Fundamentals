package BasicSyntax_ConditionalStatements_And_Loops_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class p10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

       double budget = Double.parseDouble(scanner.nextLine());
       int students = Integer.parseInt(scanner.nextLine());
         double singleSaberPrice = Double.parseDouble(scanner.nextLine());
        double singleRobePrice = Double.parseDouble(scanner.nextLine());
         double singleBeltPrice = Double.parseDouble(scanner.nextLine());



       double saberUnits = Math.ceil(students + (students * 0.10));
        //System.out.println(saberUnits);
       double totalSaberPrice =  saberUnits * singleSaberPrice;



       int freeBelts = students / 6;
       //double beltPrice = students * singleBeltPrice;
       double totalBeltPrice = singleBeltPrice * (students - freeBelts);
      // double totalBeltPrice = beltPrice - (freeBelts * singleBeltPrice);

        double totalRobePrice = students * singleRobePrice;
        double totalCost = totalSaberPrice + totalBeltPrice + totalRobePrice;

//        System.out.printf("sabers %f",totalSaberPrice);
//        System.out.printf("belts %f",totalBeltPrice );
//        System.out.printf("robes %f", totalRobePrice);

        if (totalCost <= budget) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalCost);
        } else {
            System.out.printf( "George Lucas will need %.2flv more.", totalCost - budget);
        }










    }
}
