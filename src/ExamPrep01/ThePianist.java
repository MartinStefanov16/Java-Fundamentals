package ExamPrep01;

import java.util.*;

import static java.lang.System.in;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int pieces = Integer.parseInt(scanner.nextLine());

        Map<String, String> pieceAndComposer =  new TreeMap<>();
        Map<String, String> pieceAndKey =  new TreeMap<>();

        for (int i = 0; i < pieces; i++) {
            String input = scanner.nextLine();
            //"{piece}|{composer}|{key}".
            String piece = input.split("\\|")[0];
            String composer = input.split("\\|")[1];
            String key = input.split("\\|")[2];

            pieceAndComposer.put(piece, composer);
            pieceAndKey.put(piece, key);
        }

        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            String command = input.split("\\|")[0];
            String newPiece = input.split("\\|")[1];
            String newKey = "";

            switch (command) {
                case "Add":
                    String newComposer = input.split("\\|")[2];
                    newKey = input.split("\\|")[3];

                    if (!pieceAndComposer.containsKey(newPiece)){
                        pieceAndComposer.put(newPiece, newComposer);
                        pieceAndKey.put(newPiece, newKey);
                        System.out.printf("%s by %s in %s added to the collection!\n", newPiece, newComposer, newKey);
                    } else {
                        System.out.printf("%s is already in the collection!\n", newPiece);
                    }


                    break;
                case "Remove":
                    if (pieceAndComposer.containsKey(newPiece)){
                        pieceAndComposer.remove(newPiece);
                        pieceAndKey.remove(newPiece);
                        System.out.printf("Successfully removed %s!\n", newPiece);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.\n", newPiece);
                    }
                    break;
                case "ChangeKey":
                    newKey = input.split("\\|")[2];
                    if (pieceAndComposer.containsKey(newPiece)){
                        pieceAndKey.put(newPiece, newKey);
                        System.out.printf("Changed the key of %s to %s!\n", newPiece, newKey);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.\n", newPiece);
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        // printing
//        for (Map.Entry<String, String> entry : pieceAndComposer.entrySet()) {
//            System.out.printf("%s -> Composer: %s, Key: ", entry.getKey(), entry.getValue());
//            for (Map.Entry<String, String> entry2 : pieceAndKey.entrySet()) {
//                if (entry2.getKey().equals(entry.getKey())){
//                    System.out.printf("%s\n", entry2.getValue());
//                }
//            }
//        }

        for (String piece : pieceAndComposer.keySet()) {
            String composer = pieceAndComposer.get(piece);
            String key = pieceAndKey.get(piece);
            System.out.printf("%s -> Composer: %s, Key: %s\n",piece, composer, key);
        }





    }
}
