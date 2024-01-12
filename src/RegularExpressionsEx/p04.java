package RegularExpressionsEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;

public class p04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String[] demons = scanner.nextLine().split(", ");

        for (String demon : demons) {
            int health = getDemonHealth(demon);
            int damage = getDemonDamage(demon);

        }
        System.out.println("end fori");
    }

    private static int getDemonDamage(String demon) {


        return 0;
    }

    private static int getDemonHealth(String demon) {
        Pattern pattern = Pattern.compile("[^\\+\\-\\*\\\\0-9]");
        Matcher matcher = pattern.matcher(demon);

        int health = 0;

        while (matcher.find()){
            health += matcher.group().charAt(0);
        }

        return health;
    }


}
