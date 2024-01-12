package AssociativeArrays;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class demo3 {
    public static void main(String[] args) {


        Map<String, List<String>> map = new LinkedHashMap<>();
        map.put("marty", new ArrayList<>());
        map.get("marty").add("hello");
        map.get("marty").add("hello2");
        map.put("viss", new ArrayList<>());
        map.get("viss").add("auxo");
        map.get("viss").add("is best");

//        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " -> " + entry.getValue());
//        }

//        map.entrySet()
//                .forEach(entry ->System.out.println(entry.getKey() + " -> " + entry.getValue()));

//        map.forEach((key, value) -> System.out.println(key + " " + value));

        map.entrySet().forEach(entry -> {
                System.out.printf("Name %s %d msgs\n", entry.getKey(), entry.getValue().size());
                entry.getValue().forEach(message -> System.out.printf("message %s\n", message));

        });

    }
}
