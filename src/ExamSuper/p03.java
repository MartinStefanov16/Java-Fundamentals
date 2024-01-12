package ExamSuper;

import java.util.*;

import static java.lang.System.in;

public class p03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String input = scanner.nextLine();

        Map<String, List<String>> likedMeals = new LinkedHashMap<>();
        Map<String, List<String>> dislikedMeals = new LinkedHashMap<>();


        int unlikedMeals = 0;

        while (!input.equals("Stop")) {
            String[] commandParts = input.split("-");
            String command = commandParts[0];
            String guest = commandParts[1];
            String meal = commandParts[2];

            switch (command) {
                case "Like":

                     if (likedMeals.containsKey(guest) && likedMeals.get(guest).contains(meal)) {
                    break;
                     }

                    if (!likedMeals.containsKey(guest)) {
                        List<String> list = new ArrayList<>();
                        list.add(meal);
                        likedMeals.put(guest, list);
                    } else if (likedMeals.containsKey(guest)) {
                        List<String> newList = new ArrayList<>();
                        newList.addAll(likedMeals.get(guest));
                        newList.add(meal);
                        likedMeals.put(guest, newList);

                    }

                    break;
                case "Dislike":

                    if (likedMeals.containsKey(guest)) {

                        if (likedMeals.get(guest).contains(meal)) {
                            likedMeals.get(guest).remove(meal);
                            unlikedMeals++;
                            System.out.printf("%s doesn't like the %s.\n", guest, meal);
                        } else {
                            System.out.printf("%s doesn't have the %s in his/her collection.\n", guest, meal);

                        }

                    } else {
                        System.out.printf("%s is not at the party.\n", guest);
                    }

                    break;
            }


            input = scanner.nextLine();
        }

        for (String guest : likedMeals.keySet()) {
            System.out.printf("%s: ", guest);
            List<String> newList = new ArrayList<>();
            newList.addAll(likedMeals.get(guest));

            System.out.println(newList.toString()
                    .replace("[", "")
                    .replace("]", "")
                    .trim());


        }
        System.out.printf("Unliked meals: %d", unlikedMeals);

    }
}

