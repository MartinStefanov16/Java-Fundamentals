package MidExamPrep1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class p02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        List<String> rooms = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        int health = 100;
        int bitcoin = 0;

        for (int i = 0; i < rooms.size(); i++) {
            String encounter = rooms.get(i).split(" ")[0];
            int number = Integer.parseInt(rooms.get(i).split(" ")[1]);

            switch (encounter) {
                case "potion":
                    int oldHealth = health;
                    health += number;
                    if (health > 100) {
                        health = 100;
                    }
                    System.out.printf("You healed for %d hp.\n", health - oldHealth);
                    System.out.printf("Current health: %d hp.\n", health);
                    break;
                case "chest":
                    bitcoin += number;
                    System.out.printf("You found %d bitcoins.\n", number);
                    break;
                default: // monster
                    health -= number;

                    if (health <= 0) {
                        System.out.printf("You died! Killed by %s.\n", encounter);
                        System.out.printf("Best room: %d", i + 1);
                        return;
                    } else {
                        System.out.printf("You slayed %s.\n", encounter);
                    }

                    break;
            }

        }

        System.out.println("You've made it!");
        System.out.printf("Bitcoins: %d\n", bitcoin);
        System.out.printf("Health: %d", health);
    }
}
