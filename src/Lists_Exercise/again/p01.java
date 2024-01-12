package Lists_Exercise.again;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class p01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxPassengers = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String command = input.split(" ")[0];

            if (command.equals("Add")) {
                int passengersToAdd = Integer.parseInt(input.split(" ")[1]);
                wagons.add(passengersToAdd);
            } else {
                int passengersToAdd = Integer.valueOf(command);
                for (int i = 0; i < wagons.size(); i++) {
                    int currentWagonPassenger = wagons.get(i);

                    if (currentWagonPassenger + passengersToAdd <= maxPassengers) {
                        wagons.set(i, currentWagonPassenger + passengersToAdd);
                        break;
                    }

                }
            }


            input = scanner.nextLine();
        }



        for (int wagon : wagons) {
            System.out.print(wagon + " ");
        }

    }
}
