package exam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class p03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

                List<String> phones = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

                String input = scanner.nextLine();

                while (!input.equals("End")) {
                    String command = input.split(" - ")[0];
                    String phone = input.split(" - ")[1];

                    switch (command) {
                        case "Add":
                            if (!phones.contains(phone)) {
                                phones.add(phone);
                            }
                            break;
                        case "Remove":
                            phones.remove(phone);
                            break;
                        case "Bonus phone":
                            String oldPhone = phone.split(":")[0];
                            String newPhone = phone.split(":")[1];

                            if (phones.contains(oldPhone)) {
                                int index = phones.indexOf(oldPhone) + 1;
                                phones.add(index, newPhone);
                            }

                            break;
                        case "Last":
                            if (phones.contains(phone)) {
                                phones.remove(phone);
                                phones.add(phone);
                            }
                            break;
                    }


                    input = scanner.nextLine();
                }

        System.out.println(phones.toString()
                .replace("[", "")
                .replace("]", "")
        );

    }
}
