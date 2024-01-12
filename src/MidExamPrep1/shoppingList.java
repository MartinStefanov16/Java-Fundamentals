package MidExamPrep1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class shoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

                List<String> products = Arrays.stream(scanner.nextLine().split("!"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();



        while (!input.equals("Go Shopping!")) {
            String command = input.split(" ")[0];
            String product1 = input.split(" ")[1];

            switch (command) {
                case "Urgent":
                    if (!products.contains(product1)) {
                        products.add(0, product1);
                    }
                    break;
                case "Unnecessary":
                    products.remove(product1);


                    break;
                case "Correct":
                    String product2 = input.split(" ")[2];
                    if (products.contains(product1)) {

                        int index = products.indexOf(product1);
                        products.set(index, product2);
                    }


                    break;
                case "Rearrange":
                    if (products.contains(product1)) {
                        products.remove(product1);
                        products.add(product1);
                    }


                    break;

            }




            input = scanner.nextLine();
        }

        System.out.println(products.toString()
                .replace("[", "")
                .replace("]", "")

        );
    }
}
