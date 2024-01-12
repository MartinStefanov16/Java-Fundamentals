package Lists_Exercise.again;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class p05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        List<Integer> bombSeq = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> bombNum = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int bombCode = bombNum.get(0);
        int bombPower = bombNum.get(1);
        int cellsToDestroy = bombPower * 2 + 1;


        for (int i = 0; i < bombSeq.size(); i++) {

            if (bombSeq.get(i) == bombCode) {
                //detonate
                int cellToKillStart = i - bombPower;
                int cellToKillEnd = i + bombPower;
                if (cellToKillStart < 0) {
                    cellToKillStart = 0;
                }
                if (cellToKillEnd > bombSeq.size()) {
                    cellToKillEnd = bombSeq.size() - 1;
                }

                for (int x = cellToKillStart; x <= cellToKillEnd ; x++) {
                    bombSeq.remove(cellToKillStart);
                }
                i = -1;

            }



        }
        int sum = 0;
        for (int num : bombSeq) {
            sum += num;
        }
        System.out.println(sum);


    }
}
