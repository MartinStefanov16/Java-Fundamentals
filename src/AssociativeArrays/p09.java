package AssociativeArrays;

import java.util.*;

import static java.lang.System.in;

public class p09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String input = scanner.nextLine();

        Map<String, List<String>> force = new LinkedHashMap<>();

        while (!input.equals("Lumpawaroo")) {

            if (input.contains("|")) {
                //"{force_side} | {force_user}"
                String forceSide = input.split(" \\| ")[0];
                String forceUser = input.split(" \\| ")[1];

                if (!force.containsKey(forceSide) && !force.containsValue(forceUser)){
                    force.put(forceSide, new ArrayList<>());
                    force.get(forceSide).add(forceUser);

                } else if (!force.containsValue(forceUser)) {
                    force.get(forceSide).add(forceUser);
                }


            } else if (input.contains("->")) {
                //"{force_user} -> {force_side}"
                String forceUser = input.split(" -> ")[0];
                String forceSide = input.split(" -> ")[1];

                force.entrySet().forEach(entryForce -> entryForce.getValue().remove(forceUser));

                if (!force.containsKey(forceSide)) {
                    force.put(forceSide, new ArrayList<>());
                    force.get(forceSide).add(forceUser);
                } else {
                    force.get(forceSide).add(forceUser);
                }
                System.out.printf("%s joins the %s side!%n", forceUser, forceSide);





            }


            input = scanner.nextLine();
        }
        force.entrySet().stream().filter(teamEntry -> teamEntry.getValue().size() > 0) //оставяме само тези записи, които отговарят на условието
                .forEach(entry -> {System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue().forEach(player -> System.out.println("! " + player));
                });

}
}