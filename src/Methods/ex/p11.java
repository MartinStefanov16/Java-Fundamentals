package Methods.ex;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.System.in;

public class p11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int number1 = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        int number2 = Integer.parseInt(scanner.nextLine());

        double result = doMath(number1,operator,number2);
        System.out.println(new DecimalFormat("0.##").format(result));

    }

    public static double doMath(int n1, char operator, int n2) {
        double result = 0.0;

        switch (operator) {
            case '/':
                result = (n1 * 1.0) / n2;
                break;
            case '*':
                result = n1 * n2;
                break;
            case '+':
                result = n1 + n2;
                break;
            case '-':
                result = n1 - n2;
                break;
        }

        return result;
    }
}
