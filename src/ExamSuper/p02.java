package ExamSuper;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;

public class p02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String text = scanner.nextLine();

        StringBuilder password = new StringBuilder(text);

        String input = scanner.nextLine();

        while (!input.equals("Complete")) {
            String[] commandParts = input.split(" ");
            String command = commandParts[0];

            switch (command) {
                case "Make":
                    String commandTwo = commandParts[1];
                    int index = Integer.parseInt(commandParts[2]);
                    String charToBeModified = "";
                    switch (commandTwo) {
                        case "Upper":
                            charToBeModified = String.valueOf(password.charAt(index));
                            charToBeModified = charToBeModified.toUpperCase();
                            password.delete(index, index + 1);
                            password.insert(index, charToBeModified);
                            System.out.println(password.toString());

                            break;
                        case "Lower":
                            charToBeModified = String.valueOf(password.charAt(index));
                            charToBeModified = charToBeModified.toLowerCase();
                            password.delete(index, index + 1);
                            password.insert(index, charToBeModified);
                            System.out.println(password.toString());
                            break;
                    }
                    break;
                case "Insert":
                    index = Integer.parseInt(commandParts[1]);
                    String characterToAdd = commandParts[2];

                    if (index < password.length() && index >= 0) {
                        password.insert(index, characterToAdd);
                        System.out.println(password.toString());
                    } else {
                        break;
                    }

                    break;
                case "Replace":
                    char character = commandParts[1].charAt(0);

                    if (!password.toString().contains(commandParts[1])) {
                        break;
                    }

                    int value = Integer.parseInt(commandParts[2]);
                    int newValue = (int) character + value;
                    char newChar = (char) newValue;


                    String char1 = String.valueOf(character);
                    String char2 = String.valueOf(newChar);

                    char1 = replaceMetaChars(char1);
                    char2 = replaceMetaChars(char2);


                    String passTemp = password.toString();
                    //passTemp = passTemp.replaceAll(char1, char2);
                    //System.out.println(password);


                    password = new StringBuilder(password.toString().replaceAll(char1, char2));
                    System.out.println(password);




                    break;
                case "Validation":

                    if (password.length() < 8) {
                        System.out.println("Password must be at least 8 characters long!");
                    }

                    if (!checkForValidChars(password)) {
                        System.out.println("Password must consist only of letters, digits and _!");
                    }

                    if (!checkForUpperCase(password)) {
                        System.out.println("Password must consist at least one uppercase letter!");
                    }

                    if (!checkForLowerCase(password)) {
                    System.out.println("Password must consist at least one lowercase letter!");
                    }

                    if (!checkForDigit(password)) {
                        System.out.println("Password must consist at least one digit!");
                    }

                    break;
                default:
                    break;

            }

            input = scanner.nextLine();
        }
        System.out.println();

    }

    private static String replaceMetaChars(String char1) {
        if (char1.equals("*")) {
            return "\\*";
        } else if (char1.equals("+")) {
            return "\\+";
        } else if (char1.equals("?")) {
            return "\\?";
        }

        return char1;

    }

    private static boolean checkForDigit(StringBuilder password) {
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(password);

        if (matcher.find()) {
            return true;
        }

        return false;
    }

    private static boolean checkForLowerCase(StringBuilder password) {
        Pattern pattern = Pattern.compile("[a-z]+");
        Matcher matcher = pattern.matcher(password);

        if (matcher.find()) {
            return true;
        }

        return false;
    }

    private static boolean checkForUpperCase(StringBuilder password) {
        Pattern pattern = Pattern.compile("[A-Z]+");
        Matcher matcher = pattern.matcher(password);

        if (matcher.find()) {
            return true;
        }

        return false;


    }

    private static boolean checkForValidChars(StringBuilder password) {
        Pattern pattern = Pattern.compile("\\W");
        Matcher matcher = pattern.matcher(password);

        if (matcher.find()) {
            return false;
        }

        return true;
    }
}
