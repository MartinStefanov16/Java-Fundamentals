package ExamPrep01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class p01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        StringBuilder destinations = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Travel")){
            String command = input.split(":")[0];

            switch (command) {
                case "Add Stop":
                    int index = Integer.parseInt(input.split(":")[1]);
                    String newStop = input.split(":")[2];

                    if (destinations.length() - 1 >= index) {
                        destinations.insert(index, newStop);
                    }
                    System.out.println();
                    System.out.print(destinations);
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(input.split(":")[1]);
                    int endIndex = Integer.parseInt(input.split(":")[2])+1;

                    if (destinations.length() - 1 >= startIndex && destinations.length() - 1 >= endIndex && startIndex >= 0 && endIndex >= 0) {
                        destinations.replace(startIndex,endIndex, "");
                    }
                    System.out.println();
                    System.out.print(destinations);
                    break;
                case "Switch":
                    String oldStop = input.split(":")[1];
                    newStop = input.split(":")[2];

                    if (destinations.toString().contains(oldStop)) {
                        String newWord = destinations.toString();
                        newWord = newWord.replace(oldStop,newStop);
                        destinations = new StringBuilder();
                        destinations.append(newWord);
                    }
                    System.out.println();
                    System.out.print(destinations);
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.println();
        System.out.println("Ready for world tour! Planned stops: " + destinations);



    }
}
