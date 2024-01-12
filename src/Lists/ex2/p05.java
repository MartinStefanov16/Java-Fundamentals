package Lists.ex2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class p05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String command = input.split(" ")[0];
            String command2 = input.split(" ")[1];

            switch (command) {
                case "Contains":
                    if (numbers.contains(Integer.valueOf(command2))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":

                    switch (command2) {
                        case "even":
                            for (int even : numbers) {
                                if (even % 2 == 0) {
                                    System.out.print(even + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "odd":
                            for (int odd : numbers) {
                                if (odd % 2 != 0) {
                                    System.out.print(odd + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (int num : numbers) {
                        sum += num;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    int num = Integer.parseInt(input.split(" ")[2]);

                    switch (command2) {
                        case "<":

                            for (int currentNum : numbers) {
                                if (currentNum < num) {
                                    System.out.print(currentNum + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">":
                            for (int currentNum : numbers) {
                                if (currentNum > num) {
                                    System.out.print(currentNum + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">=":
                            for (int currentNum : numbers) {
                                if (currentNum >= num) {
                                    System.out.print(currentNum + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "<=":
                            for (int currentNum : numbers) {
                                if (currentNum <= num) {
                                    System.out.print(currentNum + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }



                    break;

            }



            input = scanner.nextLine();
        }


    }
}
