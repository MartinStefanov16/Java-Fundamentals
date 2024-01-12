package ExamPrep01;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());




        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            if (isBarcodeValid(input)) {
                String group = findGoup(input);
                System.out.printf("Product group: %s\n", group);


            } else {
                System.out.println("Invalid barcode");
            }






        }
    }

    private static String findGoup(String input) {
        String group = "";
        boolean numberFound = false;

        for (char ch : input.toCharArray()){
            if (Character.isDigit(ch)) {
                numberFound = true;
                group += ch;
            }
        }





        if (numberFound) {
            return group;
        } else {
            return "00";
        }
    }

    private static boolean isBarcodeValid(String input) {
        Pattern pattern = Pattern.compile("(@#+)([A-Z][A-Za-z0-9]{4,}[A-Z])(@#+)");
        Matcher matcher = pattern.matcher(input);
        return (matcher.find());
    }
}
