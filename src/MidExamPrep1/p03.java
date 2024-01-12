package MidExamPrep1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class p03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String command = input.split(" ")[0];
            int index = Integer.parseInt(input.split(" ")[1]);
            int modifier = Integer.parseInt(input.split(" ")[2]);

            switch (command) {
                case "Shoot":
                    // CHECK THIS LINE BELOW
                    if (index <= targets.size() - 1 && index >= 0) {
                        int targetValue = targets.get(index);
                        if (targetValue - modifier <= 0) {
                            targets.remove(index);
                        } else {
                            targets.set(index, targetValue - modifier);
                        }
                    }

                    break;
                case "Add":
                    if (index <= targets.size() - 1 && index >= 0) {
                        targets.add(index, modifier);
                    } else {
                        System.out.println("Invalid placement!");
                    }


                    break;
                case "Strike":
                    int indexRadiusStart = index - modifier;
                    int indexRadiusEnd = index + modifier;

                    if (indexRadiusStart < 0 || indexRadiusEnd > targets.size()) {
                        System.out.println("Strike missed!");
                    } else {
                        for (int i = indexRadiusStart; i <= indexRadiusEnd; i++) {
                            targets.remove(indexRadiusStart);

                        }
                    }


                    break;
            }



            input = scanner.nextLine();
        }

        for (int i = 0; i < targets.size(); i++) {
            if (i == targets.size() -1) {
                System.out.print(targets.get(i));
            } else {
                System.out.print(targets.get(i) + "|");
            }

        }
    }
}
