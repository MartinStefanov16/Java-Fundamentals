package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.in;

public class p03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> parkingData = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String[] commands = scanner.nextLine().split(" ");
            String command = commands[0];
            String username = commands[1];

            switch (command) {
                case "register":
                    String plate = commands[2];

                    if (parkingData.containsKey(username)) {
                        System.out.printf("ERROR: already registered with plate number %s\n", parkingData.get(username));
                    } else {
                        parkingData.put(username, plate);
                        System.out.printf("%s registered %s successfully\n", username, plate);
                    }

                    break;
                case "unregister":
                    if (!parkingData.containsKey(username)) {
                        System.out.printf("ERROR: user %s not found\n", username);
                    } else {
                        parkingData.remove(username);
                        System.out.printf("%s unregistered successfully\n", username);
                    }

                    break;
            }


        }

        for (Map.Entry<String, String> entry : parkingData.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

    }
}
