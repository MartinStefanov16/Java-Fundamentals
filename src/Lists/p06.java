package Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class p06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> products = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String product = scanner.nextLine();
            products.add(product);
        }

        Collections.sort(products);

        for (int i = 0; i < n; i++) {
            System.out.printf("%d.%s\n", i + 1, products.get(i));
        }
    }
}
