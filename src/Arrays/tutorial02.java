package Arrays;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

//enter numbers in the console on a single line, seperated by SPACE
//have that populated into an array

public class tutorial02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        System.out.println();


    }

}
