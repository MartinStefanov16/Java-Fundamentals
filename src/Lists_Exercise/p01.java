package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class p01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxPassengers = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("end")) {

            if (command.contains("Add")) {
                int wagonToAdd = Integer.parseInt(command.split(" ")[1]);
                numbers.add(wagonToAdd);
            } else {
                int passengersToAdd = Integer.parseInt(command);
                for (int wagon = 0; wagon <= numbers.size()- 1; wagon++) {
                    int currentPassangerCount =numbers.get(wagon);

                    if (currentPassangerCount + passengersToAdd <= maxPassengers) {
                        numbers.set(wagon, currentPassangerCount + passengersToAdd);
                        break;
                    }
                }


            }

            command = scanner.nextLine();
        }

        for (int wagon : numbers) {
            System.out.print(wagon + " ");
        }


    }
}
