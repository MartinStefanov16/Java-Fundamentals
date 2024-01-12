package ExamPrep01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.in;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        Map<String, Integer> heroesAndHealth = new HashMap<>();
        heroesAndHealth.put("Marty", 100);

        if (heroesAndHealth.get("Marty") >= 100) {
            System.out.println(heroesAndHealth.get("Marty"));
        }



    }
}
