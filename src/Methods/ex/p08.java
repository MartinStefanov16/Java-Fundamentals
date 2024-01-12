package Methods.ex;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.System.in;

public class p08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        double n1 = Double.parseDouble(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());


        powerCalculator(n1, n2);
    }

    public static void powerCalculator (double n1, int n2) {

        double result = Math.pow(n1,n2);
        System.out.println(new DecimalFormat("0.####").format(result));


    }
}
