package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class demo5 {
    public static void main(String[] args) {

        Map<String, String> myMap = new TreeMap<>();
        myMap.put("Aaa", "111");
        myMap.put("Bbb", "222");

        for (String entry : myMap.keySet()) {
            String text = myMap.get("Aaa");
            System.out.printf("%s", text);
        }

    }
}
