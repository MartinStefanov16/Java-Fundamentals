package TextProccessing_Exercise;

import java.util.Scanner;

import static java.lang.System.in;

public class p01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String[] usernames = scanner.nextLine().split(", ");

        for (String username : usernames) {
            if (isValid(username)) {
                System.out.println(username);
            }


        }
    }
    public static boolean isValid(String username) {

        for (int i = 0; i < username.length(); i++) {
            char ch = username.charAt(i);
            if (!Character.isLetter(ch) && !Character.isDigit(ch) && ch != '-' && ch != '_'){
                return false;
            }
        }

        if (username.length() >= 3 && username.length() <= 16) {
            return true;
        } else {
            return false;
        }


    }

}
