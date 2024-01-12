package ExamPrep01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(input);

        int coolThreshold = 1;

        while (matcher.find()) {
                coolThreshold *= Integer.parseInt(matcher.group());
        }


        pattern = Pattern.compile("(::|\\*\\*)(?<emoji>[A-Z][a-z]{2,})\\1");
        matcher = pattern.matcher(input);

        int emojiCount = 0;
        List<String> coolEmojis = new ArrayList<>();

        while (matcher.find()) {
            emojiCount++;
            String currentEmoji = matcher.group("emoji");
            int currentEmojiCool = 0;

            for (char ch : currentEmoji.toCharArray()) {
                currentEmojiCool += (int) ch;
            }

            if (currentEmojiCool >= coolThreshold){
                coolEmojis.add(matcher.group());
            }

        }
        if (emojiCount > 0) {
            System.out.printf("Cool threshold: %d\n", coolThreshold);
            System.out.printf("%d emojis found in the text. The cool ones are:\n", emojiCount);

            for (String emoji : coolEmojis) {
                System.out.println(emoji);
            }
        }


 }
}