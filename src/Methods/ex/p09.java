package Methods.ex;

import java.util.Scanner;

import static java.lang.System.in;

public class p09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String type = scanner.nextLine();

        switch (type) {
            case "int":
                int n1 = Integer.parseInt(scanner.nextLine());
                int n2 = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(n1, n2));
                break;
            case "char":
                char c1 = scanner.nextLine().charAt(0);
                char c2 = scanner.nextLine().charAt(0);
                System.out.println(getMax(c1, c2));
                break;
            case "string":
                String s1 = scanner.nextLine();
                String s2 = scanner.nextLine();
                System.out.println(getMax(s1, s2));
                break;
        }


    }

    public static int getMax(int n1, int n2) {

        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }

    }

    public static char getMax(char c1, char c2) {
        if (c1 > c2) {
            return c1;
        } else {
            return c2;
        }
    }

    public static String getMax(String s1, String s2) {

        if (s1.compareTo(s2) >= 0) {
            return s1;
        } else {
            return s2;
        }

    }

}
