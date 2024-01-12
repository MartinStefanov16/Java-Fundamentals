package AssociativeArrays;

import java.lang.reflect.Array;
import java.util.*;

import static java.lang.System.in;

public class p08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        Map<String, List<String>> data =  new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("End")){
            String[] inputParts = input.split(" -> ");
            String company = inputParts[0];
            String employee = inputParts[1];

            if (data.containsKey(company)) {
                List<String> currentEmployees = data.get(company);
                if (!currentEmployees.contains(employee)) {
                    data.get(company).add(employee);
                }

            } else {
                data.put(company, new ArrayList<>());
                data.get(company).add(employee);
            }

            input = scanner.nextLine();
        }

        data.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            entry.getValue().forEach(employee -> System.out.println("-- " + employee));
        });
    }
}
