package AssociativeArrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

import static java.lang.System.in;

public class p01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        double[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        TreeMap<Double, Integer> counts = new TreeMap<>();

        for (double num : nums) {
            if (!counts.containsKey(num)) {
                counts.put(num, 0);
            }
            counts.put(num, counts.get(num) + 1);
        }
    }
}
