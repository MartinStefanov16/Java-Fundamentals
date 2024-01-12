package BasicSyntax_ConditionalStatements_And_Loops_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class p01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int age = Integer.parseInt(scanner.nextLine());


        if (age >= 0 && age <= 2) {
            System.out.println("baby");
        } else if (age >= 3 && age <= 13) {
            System.out.println("child");
        } else if (age >= 14 && age <= 19) {
            System.out.println("teenager");
        } else if (age >= 20 && age <= 65) {
            System.out.println("adult");
        } else if (age >= 60) {
                System.out.println("elder");
            }
        }





    }
