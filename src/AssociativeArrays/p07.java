package AssociativeArrays;

import java.util.*;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class p07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

//        List<String> items = Arrays.stream(scanner.nextLine().split(" "))
//                .collect(Collectors.toList());
        Map<String, Integer> inventory = new LinkedHashMap<>();
        inventory.put("shards", 0);
        inventory.put("fragments", 0);
        inventory.put("motes", 0);
        Map<String, Integer> inventoryJunk = new LinkedHashMap<>();

        boolean isWin = false;

        int currentItemAmount = 0;
        //int i = 0;

        String input = scanner.nextLine();
        while (!isWin) {

            String[] inputData = input.split(" ");

            for (int i = 1; i <= inputData.length; i++) {

                if (i % 2 != 0) {
                    //item amount
                    currentItemAmount = Integer.parseInt(inputData[i - 1]);
                } else {
                    int n = 0;
                    String currentThing = inputData[i-1].toLowerCase();
                    // item name
                    switch (currentThing) {
                        case "shards":
                        case "fragments":
                        case "motes":
                            n = inventory.get(currentThing);
                            inventory.put(currentThing, n + currentItemAmount);
                            currentItemAmount = 0;
                            break;
                        default:
                            if (!inventoryJunk.containsKey(currentThing)) {
                                inventoryJunk.put(currentThing, currentItemAmount);
                                currentItemAmount = 0;
                            } else {
                                n = inventoryJunk.get(currentThing);
                                inventoryJunk.put(currentThing, n + currentItemAmount);
                                currentItemAmount = 0; }
                            break;
                    }

                }
                if (inventory.get("shards") >= 250) {
                    inventory.put("shards", inventory.get("shards") - 250);
                    System.out.println("Shadowmourne obtained!");
                    isWin = true;
                    break;
                } else if (inventory.get("fragments") >= 250) {
                    inventory.put("fragments", inventory.get("fragments") - 250);
                    System.out.println("Valanyr obtained!");
                    isWin = true;
                    break;
                } else if (inventory.get("motes") >= 250) {
                    inventory.put("motes", inventory.get("motes") - 250);
                    System.out.println("Dragonwrath obtained!");
                    isWin = true;
                    break;
                }

            }



            if (isWin) {
                break;
            }





            input = scanner.nextLine();
        }




        System.out.printf("shards: %d\n", inventory.get("shards"));
        System.out.printf("fragments: %d\n", inventory.get("fragments"));
        System.out.printf("motes: %d\n", inventory.get("motes"));

        inventoryJunk.entrySet()
                .forEach(entry ->System.out.println(entry.getKey() + ": " + entry.getValue()));

    }


}