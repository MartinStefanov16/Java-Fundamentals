package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class p04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

                List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String command = input.split(" ")[0];




            switch (command) {
                case "Add":
                    numbers.add(Integer.parseInt(input.split(" ")[1]));
                    break;
                case "Insert":


                    if (Integer.parseInt(input.split(" ")[2]) >= numbers.size() || Integer.parseInt(input.split(" ")[2]) < 0 ) {
                        System.out.println("Invalid index");
                        break;
                    }

                    numbers.add(Integer.parseInt(input.split(" ")[2]), Integer.parseInt(input.split(" ")[1]));
                    break;
                case "Remove":
                    if (Integer.parseInt(input.split(" ")[1]) >= numbers.size() || Integer.parseInt(input.split(" ")[1]) < 0) {
                        System.out.println("Invalid index");
                        break;
                    }
                    numbers.remove(Integer.parseInt(input.split(" ")[1]));
                    break;
                case "Shift":
                    String shiftCommand = input.split(" ")[1];
                    int count = Integer.parseInt(input.split(" ")[2]);

                    switch (shiftCommand) {
                        case "left":
                            for (int j = 0; j < count; j++) {

                        int number1 = numbers.get(0);
                        for (int i = 0 ; i < numbers.size() - 1 ; i++) {
                            numbers.set(i, numbers.get(i + 1));
                        }
                        numbers.set(numbers.size() - 1, number1);
                    }
                            break;
                            case "right":
                                for (int j = 0; j < count; j++) {

                        int number1 = numbers.get(numbers.size() - 1);
                        for (int i = numbers.size() - 1 ; i > 0 ; i--) {
                            numbers.set(i, numbers.get(i - 1));
                        }
                        numbers.set(0, number1);
                    }
                            break;
                    }

                    break;
            }






            input = scanner.nextLine();
        }

        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
