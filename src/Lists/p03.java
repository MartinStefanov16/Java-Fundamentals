package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class p03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int[] firstSeq = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int[] secondSeq = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        List<Integer> result = new ArrayList<>();

        int shortestSeq = 0;
        boolean isFirstSeqShortest = false;

        if (firstSeq.length > secondSeq.length) {
            shortestSeq = secondSeq.length - 1;
        } else {
            shortestSeq = firstSeq.length - 1;
            isFirstSeqShortest = true;
        }

        for (int i = 0; i <= shortestSeq; i++) {
            result.add(firstSeq[i]);
            result.add(secondSeq[i]);
        }

        if (isFirstSeqShortest) {

            for (int i = firstSeq.length; i < secondSeq.length ; i++) {
                result.add(secondSeq[i]);

            }

        } else {

            for (int i = secondSeq.length; i < firstSeq.length; i++) {
                result.add(firstSeq[i]);
            }

        }


        for (int num : result) {
            System.out.print(num + " ");
        }

    }

}
