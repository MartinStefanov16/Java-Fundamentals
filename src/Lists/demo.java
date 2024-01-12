package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

//        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
//                .map(Integer::parseInt)
//                .toList();
        // ^ this may be irrelevant


        //making inout from console in a List
//        List<Double> numbersDouble = Arrays.stream(scanner.nextLine().split(" "))
//                .map(e -> Double.parseDouble(e))
//                .collect(Collectors.toList());

//        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
//                .map(e -> Integer.parseInt(e))
//                .collect(Collectors.toList());

        // better version of above
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

//        List<String> topics = Arrays.stream(scanner.nextLine().split(", "))
//                .collect(Collectors.toList());

numbers.add(0, 10);
        System.out.println(numbers);



    }
}
