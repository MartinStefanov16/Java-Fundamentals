package ObjectsExP03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int n = Integer.parseInt(scanner.nextLine());
        List<person> peopleList = new ArrayList<>();

        for (int row = 0; row < n; row++) {
            String personalData = scanner.nextLine();
            String name = personalData.split(" ")[0];
            int age = Integer.parseInt(personalData.split(" ")[1]);

            if (age > 30) {
                // creating new obj
                person person = new person(name, age);
                peopleList.add(person);

            }


        }

        for (person person : peopleList) {
            System.out.println(person.getName() + " - " + person.getAge());
        }


    }
}
