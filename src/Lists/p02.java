package Lists;

import java.util.*;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class p02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();



        if (numbers.size() % 2 != 0) {
            numbers.add(numbers.size() / 2, Integer.valueOf("0"));
        }

        for (int i = 0; i < numbers.size() / 2; i++) {
            int currentLeft = numbers.get(i);
            int currentRight = numbers.get(numbers.size() - 1 - i);
            result.add(currentLeft + currentRight);

        }

        System.out.println(result);



    }
}
