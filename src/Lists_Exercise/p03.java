package Lists_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class p03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int commandsAmount = Integer.parseInt(scanner.nextLine());

        List<String> guests = new ArrayList<>();


        for (int i = 1; i <= commandsAmount; i++) {
            String input = scanner.nextLine();
            String guestName = input.split(" ")[0];
            String guestAction = input.split(" ")[2];

            switch (guestAction) {
                case "going!":

                    if (guests.contains(guestName)) {
                        System.out.printf("%s is already in the list!\n", guestName);
                    } else {
                        guests.add(guestName);
                    }

                    break;
                case "not":

                    if (guests.contains(guestName)) {
                        guests.remove(guestName);
                    } else {
                        System.out.printf("%s is not in the list!\n", guestName);
                    }

                    break;
            }

            //System.out.println(guests);
        }

        for (String people : guests) {
            System.out.println(people);
        }



    }
}
