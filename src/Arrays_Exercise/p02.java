package Arrays_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class p02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String firstRow = scanner.nextLine();
        String secondRow = scanner.nextLine();

        String [] element1 = firstRow.split(" ");
        String [] element2 = secondRow.split(" ");

        for (String el2: element2) {
            for (String el1: element1) {

                if (el1.equals(el2)) {
                    System.out.print(el2 + " ");

                }

            }

        }
    }
}
