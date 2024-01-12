package DataTypesAndVariables;

import java.util.Scanner;

import static java.lang.System.in;

public class p08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int kegAmount = Integer.parseInt(scanner.nextLine());
        double bestVolume = 0;
        String bestModel = "";

        for (int i = 1; i <= kegAmount; i++) {
            String kegName = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int high = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * (radius * radius) * high;

            if (volume > bestVolume) {
                bestVolume = volume;
                bestModel = kegName;
            }

        }
        System.out.println(bestModel);

    }
}
