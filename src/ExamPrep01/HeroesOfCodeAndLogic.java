package ExamPrep01;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.in;

public class HeroesOfCodeAndLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int heroesAmount = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> heroesAndHealth = new LinkedHashMap<>();
        Map<String, Integer> heroesAndMana = new LinkedHashMap<>();

        for (int i = 0; i < heroesAmount; i++) {
            String input = scanner.nextLine();
            String heroName = input.split(" ")[0];
            int heroHP = Integer.parseInt(input.split(" ")[1]);
            int heroMP = Integer.parseInt(input.split(" ")[2]);

            heroesAndHealth.put(heroName, heroHP);
            heroesAndMana.put(heroName, heroMP);

        }

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String command = input.split(" - ")[0];
            String heroName = input.split(" - ")[1];

            switch (command) {
                case "CastSpell":
                    int neededMP = Integer.parseInt(input.split(" - ")[2]);
                    String spellName = input.split(" - ")[3];

                    if (heroesAndMana.get(heroName) >= neededMP) {
                        int currentMP = heroesAndMana.get(heroName);
                        heroesAndMana.put(heroName, currentMP - neededMP);

                        System.out.printf("%s has successfully cast %s and now has %d MP!\n", heroName, spellName, heroesAndMana.get(heroName));
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!\n", heroName, spellName);
                    }

                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(input.split(" - ")[2]);
                    String attacker = input.split(" - ")[3];

                    heroesAndHealth.put(heroName, heroesAndHealth.get(heroName) - damage);

                    if (heroesAndHealth.get(heroName) > 0){
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!\n", heroName, damage, attacker, heroesAndHealth.get(heroName));
                    } else {
                        System.out.printf("%s has been killed by %s!\n", heroName, attacker);
                        heroesAndHealth.remove(heroName);
                        heroesAndMana.remove(heroName);
                    }

                    break;
                case "Recharge":
                    int rechargeAmount = Integer.parseInt(input.split(" - ")[2]);
                    int manaBefore = heroesAndMana.get(heroName);
                    heroesAndMana.put(heroName, heroesAndMana.get(heroName) + rechargeAmount );
                    //int manaAfter = heroesAndMana.get(heroName);

                    if (heroesAndMana.get(heroName) > 200) {
                        heroesAndMana.put(heroName, 200);
                        int rechargedAmount = heroesAndMana.get(heroName) - rechargeAmount;

                        System.out.printf("%s recharged for %d MP!\n", heroName, 200 - manaBefore);
                    } else {
                        System.out.printf("%s recharged for %d MP!\n", heroName, rechargeAmount);
                    }
                    break;
                case "Heal":
                    int healAmount = Integer.parseInt(input.split(" - ")[2]);
                    int healthBefore = heroesAndHealth.get(heroName);
                    heroesAndHealth.put(heroName, heroesAndHealth.get(heroName) + healAmount);
                    //int healthAfter = heroesAndHealth.get(heroName);

                    if (heroesAndHealth.get(heroName) > 100) {
                        heroesAndHealth.put(heroName, 100);
                        System.out.printf("%s healed for %d HP!\n", heroName, 100 - healthBefore);
                    } else {
                        System.out.printf("%s healed for %d HP!\n", heroName, healAmount);
                    }

                    break;
            }





            input = scanner.nextLine();
        }

        for (String hero : heroesAndHealth.keySet()) {
            int health = heroesAndHealth.get(hero);
            int mana = heroesAndMana.get(hero);
            System.out.println(hero);
            System.out.printf("  HP: %d\n", health);
            System.out.printf("  MP: %d\n", mana);
        }


    }
}
