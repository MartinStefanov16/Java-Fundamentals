package Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class p07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();


        int currentStreak = 1;
        int longestStreak = Integer.MIN_VALUE;
        int streakNumber = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length - 1; i++) {

            if (numbers[i] == numbers[i + 1]) {
                currentStreak++;
            } else {
                currentStreak = 1;
            }

            if (currentStreak > longestStreak) {
                longestStreak = currentStreak;
            }
        }


            int numbersFound = 1;
            int maxNumbersFound = Integer.MIN_VALUE;

            for (int i = 0; i < numbers.length - 1; i++) {

                if (numbers[i] == numbers[i + 1]) {
                    streakNumber = numbers[i];
                    numbersFound++;
                } else {
                    numbersFound = 1;
                }

                if (numbersFound > maxNumbersFound) {
                    maxNumbersFound = numbersFound;
                }

                if (numbersFound == longestStreak) {
                    break;
                }

            }

            int[] print = new int[longestStreak];
        Arrays.fill(print, streakNumber);

        for (int console: print) {
            System.out.print(console + " ");

        }


            //System.out.println(streakNumber);
            //System.out.println(longestStreak);


        }
    }
