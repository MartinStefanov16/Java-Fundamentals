package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class p09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            if (input.contains("swap")) {
                int index1 = Integer.parseInt(input.split(" ")[1]);
                int index2 = Integer.parseInt(input.split(" ")[2]);

                int clipboard = array[index1];
                array[index1] = array[index2];
                array[index2] = clipboard;

            } else if (input.contains("multiply")) {
                int index1 = Integer.parseInt(input.split(" ")[1]);
                int index2 = Integer.parseInt(input.split(" ")[2]);

                array[index1] = array[index1] * array[index2];


            } else if (input.equals("decrease")) {


                for (int i = 0; i < array.length; i++) {
                    array[i]--;
                }



            }
            input = scanner.nextLine();

        }


        for (int i = 0; i < array.length; i++) {

            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }

        }


    }
}
