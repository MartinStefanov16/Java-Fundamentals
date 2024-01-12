package Lists.ex2;

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

                while (!input.equals("end")) {
                    String command = input.split(" ")[0];
                    int commandNum1 = Integer.parseInt(input.split(" ")[1]);

                    switch (command) {
                        case "Add":
                            numbers.add(commandNum1);
                            break;
                        case "Remove":
                            numbers.remove(Integer.valueOf(commandNum1));
                            break;
                        case "RemoveAt":
                            numbers.remove(commandNum1);
                            break;
                        case "Insert":
                            int commandNum2 = Integer.parseInt(input.split(" ")[2]);
                            numbers.add(commandNum2, commandNum1);
                            break;
                    }


                    input = scanner.nextLine();
                }

        for (int num : numbers) {
            System.out.print(num + " ");
        }

    }
}
