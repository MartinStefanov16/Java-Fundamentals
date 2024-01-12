package ExamPrep01;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String password = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals("Done")){
            String[] commandParts = input.split(" ");
            String command = commandParts[0];

            switch (command) {
                case "TakeOdd":
                    password = getOddChars(password);
                    System.out.println(password);
                    break;
                case "Cut":
                    int index =  Integer.parseInt(commandParts[1]);
                    int length =  Integer.parseInt(commandParts[2]);
                    String leftPart = password.substring(0, index);
                    String rightPart = password.substring(index+length);
                    password = leftPart + rightPart;
                    System.out.println(password);
                    break;
                case "Substitute":
                    String substring = commandParts[1];
                    String substitute = commandParts[2];
                    if (password.contains(substring)){
                        password = password.replace(substring, substitute);
                        System.out.println(password);
                    } else {
                        System.out.println("Nothing to replace!");
                    }

                    break;
            }



            input = scanner.nextLine();
        }
        System.out.printf("Your password is: %s", password);
    }

    private static String getOddChars(String password) {
        StringBuilder tempPass = new StringBuilder();
        int iteration = 1;
        for (char ch : password.toCharArray()){
            if (iteration % 2 == 0) {
                tempPass.append(ch);
            }
            iteration++;
        }

        return tempPass.toString();
    }
}
