package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class p02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
        .map(e -> Integer.parseInt(e))
        .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            if (command.contains("Delete")) {
                int numToDelete = Integer.parseInt(command.split(" ")[1]);
                for (int i = 0; i < numbers.size() - 1; i++) {
                    numbers.remove(Integer.valueOf(numToDelete));
                }

            } else if (command.contains("Insert")) {
                int numToInsert = Integer.parseInt(command.split(" ")[1]);
                int index = Integer.parseInt(command.split(" ")[2]);
                numbers.add(index, numToInsert);
            }




            command = scanner.nextLine();
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }




    }
}
