package Lists.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class p03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        List<Integer> numbers1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> numbers2 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> resultList = new ArrayList<>();

        int smallestListLength = 0;
        boolean isFirstListShortest = false;

        if (numbers1.size() < numbers2.size()) {
            isFirstListShortest = true;
            smallestListLength = numbers1.size();
        } else {
            smallestListLength = numbers2.size();
        }


        for (int i = 0; i < smallestListLength; i++) {
            int n1 = numbers1.get(i);
            int n2 = numbers2.get(i);
            resultList.add(n1);
            resultList.add(n2);
        }

        if (isFirstListShortest) {
            for (int i = numbers1.size(); i < numbers2.size(); i++) {
                int numToAdd = numbers2.get(i);
                resultList.add(numToAdd);
            }
        } else {
            for (int i = numbers2.size(); i < numbers1.size(); i++) {
                int numToAdd = numbers1.get(i);
                resultList.add(numToAdd);
            }
        }

        for (int n : resultList) {
            System.out.print(n + " ");
        }
    }
}
