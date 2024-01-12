package ExamPrep01;

import java.util.Scanner;

import static java.lang.System.in;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String message = scanner.nextLine();

        String input = scanner.nextLine();

        StringBuilder newMessage = new StringBuilder(message);

        while (!input.equals("Reveal")){
            String[] commandParts = input.split(":\\|:");
            String command = commandParts[0];

            switch (command) {
                case "InsertSpace":
                    int index = Integer.parseInt(commandParts[1]);

                    newMessage.insert(index, " ");
                    System.out.println(newMessage.toString());

                    break;
                case "Reverse":
                    String substring = commandParts[1];

                    if (newMessage.toString().contains(substring)) {
                       int subIndex = newMessage.indexOf(substring);

                       newMessage.delete(subIndex, subIndex + substring.length());
                       StringBuilder tempSB = new StringBuilder(substring);
                       newMessage.append(tempSB.reverse());


                        System.out.println(newMessage.toString());

                    } else {
                        System.out.println("error");
                    }


                    break;
                case "ChangeAll":
                    String theSubstring = commandParts[1];
                    String replacement = commandParts[2];

                    newMessage = new StringBuilder(newMessage.toString().replace(theSubstring, replacement));


                    System.out.println(newMessage.toString());

                    break;
            }



            input = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s", newMessage.toString());
    }
}
