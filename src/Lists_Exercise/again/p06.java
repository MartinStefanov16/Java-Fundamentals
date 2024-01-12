package Lists_Exercise.again;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class p06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        List<Integer> playerDeck1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> playerDeck2 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (!playerDeck1.isEmpty()|| !playerDeck2.isEmpty()) {
            int player1Card = playerDeck1.get(playerDeck1.size() -2);
            int player2Card = playerDeck2.get(playerDeck1.size() -1);

            // cards are the same
            if (player1Card == player2Card) {
                playerDeck1.remove(playerDeck1.size() -2);
                playerDeck2.remove(playerDeck2.size() -1);
            }

            if (player1Card > player2Card) {
                playerDeck1.add(player2Card);
                playerDeck2.remove(playerDeck2.size() -1);
            }

            if (player1Card < player2Card) {
                playerDeck2.add(player1Card);
                playerDeck1.remove(playerDeck1.size() -2);
            }




        }



    }
}
