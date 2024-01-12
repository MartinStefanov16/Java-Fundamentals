package BasicSyntax_ConditionalStatements_And_Loops_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class p05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String username = scanner.nextLine();
        String pass = "";

        for (int i = username.length() - 1; i >= 0 ; i--) {
            char currentSymbol = username.charAt(i);
            pass += currentSymbol;
        }

        int errorCount = 0;
        String input = scanner.nextLine();

        while (!input.equals(pass)) {
            errorCount++;

            if (errorCount == 4) {
                System.out.printf("User %s blocked!", username);
                return;
            }

            System.out.println("Incorrect password. Try again.");
            input = scanner.nextLine();
        }

        System.out.printf("User %s logged in.", username);



    }
}
