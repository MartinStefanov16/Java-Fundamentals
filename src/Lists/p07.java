package Lists;

import java.util.*;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class p07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();

        for (int number : numbers) {

            if (number > 0) {
                result.add(number);
            }
        }

        Collections.reverse(result);


        if (result.size() == 0) {
            System.out.println("empty");
        } else {
            for (int number : result) {
                System.out.print(number + " ");
            }
        }
    }
}
