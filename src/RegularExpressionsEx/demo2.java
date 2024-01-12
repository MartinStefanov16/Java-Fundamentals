package RegularExpressionsEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo2 {
    public static void main(String[] args) {

        String text = "123, 456, 789, 852";

        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(text);


//        while (matcher.find()) {
//            System.out.println(matcher.group());
//        }
        matcher.find();
        System.out.println(matcher.group());

        matcher.find();
        System.out.println(matcher.group());

    }
}
