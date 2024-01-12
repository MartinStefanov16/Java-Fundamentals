package AssociativeArrays;

import java.util.*;

import static java.lang.System.in;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("John", 56894);


//        String[] words = Arrays.stream(scanner.nextLine().split(" "))
//                .filter(x -> x.length() % 2 == 0)
//                .toArray(String[]::new);
//
//        for (String word : words) {
//            System.out.println(word);
//        }

        // Need to figure out how this even works
        Map<String, List<Double>> studentPerformance =  new LinkedHashMap<>();
        List<Double> grades = new ArrayList<>();
        grades.add(1.5);

        studentPerformance.put("Marty", grades);
        List<Double> copyOfGrades = studentPerformance.get("Marty");
        copyOfGrades.add(2.5);

        System.out.println("done");
        // question ends here




    }
}
