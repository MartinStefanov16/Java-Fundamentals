package Lists.ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class p06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int amountOfProducts = Integer.parseInt(scanner.nextLine());

        List<String> products = new ArrayList<>();

        for (int i = 1; i <= amountOfProducts ; i++) {
            String product = scanner.nextLine();
            products.add(product);
        }
        Collections.sort(products);

        int n = 1;
        for (String prod : products) {
            System.out.printf("%d.%s\n",n,prod);
            n++;

        }
    }
}
