package Arrays;

import java.util.Scanner;

import static java.lang.System.in;

public class p01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int day = Integer.parseInt(scanner.nextLine());

        String[] days = {
          "Monday",
          "Tuesday",
          "Wednesday",
          "Thursday",
          "Friday",
          "Saturday",
          "Sunday",
        };

        if (day >= 1 && day <= days.length) {
            System.out.println(days[day - 1]);
        } else {
            System.out.println("Invalid day!");
        }


    }
}
