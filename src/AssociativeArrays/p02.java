package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.in;

public class p02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        Map<String, Integer> minerals = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("stop")) {
            int minedAmount = Integer.parseInt(scanner.nextLine());

            if (!minerals.containsKey(input)) {
                minerals.put(input, minedAmount);
            } else {
                int currentMinedAmount = minerals.get(input);
                minerals.put(input, currentMinedAmount + minedAmount);
            }
            input = scanner.nextLine();

        }

        for (Map.Entry<String, Integer> entry : minerals.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


    }
}
