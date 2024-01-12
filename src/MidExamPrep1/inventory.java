package MidExamPrep1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

                List<String> inventory = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

                String input = scanner.nextLine();

                while (!input.equals("Craft!")) {
                    String command = input.split(" - ")[0];
                    String item = input.split(" - ")[1];

                    switch (command) {
                        case "Collect":
                            if (!inventory.contains(item)) {
                                inventory.add(item);
                            }
                            break;
                        case "Drop":
                            inventory.remove(item);
                            break;
                        case "Combine Items":
                            String oldItem = item.split(":")[0];
                            String newItem = item.split(":")[1];

                            if (inventory.contains(oldItem)) {
                                int index = inventory.indexOf(oldItem) + 1;
                                inventory.add(index, newItem);
                            }

                            break;
                        case "Renew":
                            if (inventory.contains(item)) {
                                inventory.remove(item);
                                inventory.add(item);
                            }
                            break;
                    }



                    input = scanner.nextLine();
                }


                        System.out.print(inventory.toString()
                                .replace("[", "")
                                .replace("]", "")

                        );

    }
}
