package Arrays.more;

import java.util.Scanner;

import static java.lang.System.in;

public class p01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int input = Integer.parseInt(scanner.nextLine());

        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        if (input >= 1 && input <= days.length ) {
            System.out.println(days[input - 1]);
        } else {
            System.out.println("Invalid day!");
        }

    }
}
