package AssociativeArrays;

import java.util.*;

import static java.lang.System.in;

public class p05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String input = scanner.nextLine();

        Map<String, List<String>> courseData = new LinkedHashMap<>();

        while (!input.equals("end")){
            String courseName = input.split(" : ")[0];
            String studentName = input.split(" : ")[1];

            if (!courseData.containsKey(courseName)) {
                courseData.put(courseName, new ArrayList<>());
                courseData.get(courseName).add(studentName);
            } else {
                courseData.get(courseName).add(studentName);
            }

            input = scanner.nextLine();
        }
        courseData.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ": " + entry.getValue().size());
            entry.getValue().forEach(employee -> System.out.println("-- " + employee));
        });


}
}