package AssociativeArrays;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static java.util.Map.Entry.comparingByValue;

public class demo2 {
    public static void main(String[] args) {
        Map<String, Integer> grades = new HashMap<>();
        grades.put("Marty", 2);
        grades.put("Ivan", 1);
        grades.put("Viss", 3);



        grades.entrySet().stream()
                .sorted(comparingByValue())
                .forEach(entry -> System.out.println(entry.getKey() + entry.getValue()));

        grades.entrySet().stream()
                .sorted(Collections.reverseOrder(comparingByValue()))
                .forEach(entry -> System.out.println(entry.getKey() + entry.getValue()));
    }
}
