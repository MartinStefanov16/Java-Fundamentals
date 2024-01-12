package Lists_Exercise.again;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class p06two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        List<Integer> playerDeck1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> playerDeck2 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (!playerDeck1.isEmpty() || !playerDeck2.isEmpty()) {
            int player1Card = playerDeck1.get(0);
            int player2Card = playerDeck2.get(0);

            // cards are the same
            if (player1Card == player2Card) {
                playerDeck1.remove(0);
                playerDeck2.remove(0);
            }

            if (player1Card > player2Card) {
                // deck 1
                playerDeck1.add(player1Card);
                playerDeck1.add(player2Card);
                playerDeck1.remove(0);
                //deck 1
                playerDeck2.remove(0);
            }

            if (player1Card < player2Card) {
                playerDeck2.add(player2Card);
                playerDeck2.add(player1Card);
                playerDeck2.remove(0);

                playerDeck1.remove(0);
            }



            if (playerDeck1.isEmpty() || playerDeck2.isEmpty()) {
                break;
            }

        }

        int sum = 0;
        if (playerDeck2.isEmpty()) {
            for (int n : playerDeck1) {
                sum += n;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        } else {
            for (int n : playerDeck2) {
                sum += n;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        }





    }

}
