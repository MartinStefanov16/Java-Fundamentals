package TextProccessing;

import java.util.Scanner;

import static java.lang.System.in;

public class p03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);


        String key = scanner.nextLine();
        String text = scanner.nextLine();

        while (text.contains(key)) {
            int index = text.indexOf(key);
            String leftSide = text.substring(0, index);
            String rightSide = text.substring(index + key.length());
            text = leftSide + rightSide;


        }

        System.out.println(text);

    }
}
