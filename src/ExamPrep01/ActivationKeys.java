package ExamPrep01;

import java.util.Scanner;

import static java.lang.System.in;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String rawKey = scanner.nextLine();

        String input = scanner.nextLine();

        StringBuilder key = new StringBuilder(rawKey);

        while (!input.equals("Generate")) {
            String[] commandParts = input.split(">>>");
            String command = commandParts[0];

            switch (command) {
                case "Contains":
                    String substring = commandParts[1];

                    if (key.toString().contains(substring)) {
                        System.out.printf("%s contains %s\n", key.toString(), substring);
                    } else {
                        System.out.println("Substring not found!");
                    }


                    break;
                case "Flip":
                    String subCommand = commandParts[1];
                    int startInd = Integer.parseInt(commandParts[2]);
                    int endInd = Integer.parseInt(commandParts[3]);

                    String partToBeModified = key.substring(startInd, endInd);

                    switch (subCommand) {
                        case "Upper":
                            partToBeModified = partToBeModified.toUpperCase();
                            break;
                        case "Lower":
                            partToBeModified = partToBeModified.toLowerCase();
                            break;
                    }
                    key.replace(startInd, endInd, partToBeModified);
                    System.out.println(key.toString());


                    break;
                case "Slice":
                    startInd = Integer.parseInt(commandParts[1]);
                    endInd = Integer.parseInt(commandParts[2]);

                    key.delete(startInd, endInd);
                    System.out.println(key.toString());

                    break;
            }





            input = scanner.nextLine();
        }

        System.out.printf("Your activation key is: %s", key);
    }
}
