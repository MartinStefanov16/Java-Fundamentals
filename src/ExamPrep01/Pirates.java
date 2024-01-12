package ExamPrep01;

import java.util.*;

import static java.lang.System.in;

public class Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String input = scanner.nextLine();

        Map<String, Integer> cityAndPop =  new HashMap<>();
        Map<String, Integer> cityAndGold =  new HashMap<>();

        while (!input.equals("Sail")) {
            String[] commandParts = input.split("\\|+");
            String cityName = commandParts[0];
            int cityPop = Integer.parseInt(commandParts[1]);
            int cityGold = Integer.parseInt(commandParts[2]);

            if (!cityAndPop.containsKey(cityName)) {
                cityAndPop.put(cityName, cityPop);
                cityAndGold.put(cityName, cityGold);
            } else {
                cityAndPop.put(cityName, cityAndPop.get(cityName) + cityPop);
                cityAndGold.put(cityName, cityAndGold.get(cityName) + cityGold);
            }


            input = scanner.nextLine();
        }



        input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] commandParts = input.split("=>");
            String command = commandParts[0];
            String town = commandParts[1];
            //int people = Integer.parseInt(commandParts[2]);
            //int gold = Integer.parseInt(commandParts[3]);

            switch (command) {
                case "Plunder":
                    int people = Integer.parseInt(commandParts[2]);
                    int gold = Integer.parseInt(commandParts[3]);

                    cityAndPop.put(town, cityAndPop.get(town) - people);
                    cityAndGold.put(town, cityAndGold.get(town) - gold);

                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.\n", town, gold, people);

                    if (cityAndPop.get(town) <= 0 || cityAndGold.get(town) <= 0) {
                        cityAndPop.remove(town);
                        cityAndGold.remove(town);
                        System.out.printf("%s has been wiped off the map!\n", town);
                    }


                    break;
                case "Prosper":
                    gold = Integer.parseInt(commandParts[2]);

                    if (gold < 0 ) {
                        System.out.println("Gold added cannot be a negative number!");
                        break;
                    }

                    cityAndGold.put(town, cityAndGold.get(town) + gold);
                    System.out.printf("%d gold added to the city treasury. %s now has %d gold.", gold, town, cityAndGold.get(town) );


                    break;
            }


            input = scanner.nextLine();
        }

        if (cityAndPop.isEmpty()) {
            System.out.printf("Ahoy, Captain! All targets have been plundered and destroyed\n!");
        } else {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:\n", cityAndPop.size());

            for (String city : cityAndPop.keySet()) {
                int pop = cityAndPop.get(city);
                int gold = cityAndGold.get(city);
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg\n", city, pop, gold);
            }


        }

    }
}
