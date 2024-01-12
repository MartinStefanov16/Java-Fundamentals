package ExamSuper;

import java.util.*;

import static java.lang.System.in;

public class actualDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        Map<String, List<String>> map = new LinkedHashMap<>();

        List<String> list = new ArrayList<>();
        list.add("Meze");
        map.put("Marty", list);

        List<String> newList = new ArrayList<>();
        newList.addAll(map.get("Marty"));
        newList.add("kola");
        map.put("Marty", newList);

        System.out.println();



    }
}
