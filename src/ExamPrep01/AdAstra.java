package ExamPrep01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("(#|\\|)(?<foodName>[A-Za-z\\s]+)\\1(?<expirationDate>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]+)\\1");
        Matcher matcher = pattern.matcher(input);

        int calories = 0;
        List<String> foods = new ArrayList<>();

        while (matcher.find()) {
            calories += Integer.parseInt(matcher.group("calories"));
            String foodName = matcher.group("foodName");
            String expirationDate = matcher.group("expirationDate");
            String foodCalories = matcher.group("calories");

            foods.add(String.format("Item: %s, Best before: %s, Nutrition: %s", foodName, expirationDate, foodCalories));
            //foods.add("Item: " + foodName + ", Best before: " + expirationDate + ", Nutrition: " + foodCalories);
        }

        System.out.printf("You have food to last you for: %d days!\n", calories / 2000);

        for (String food : foods) {
            System.out.println(food);
        }
    }
}
