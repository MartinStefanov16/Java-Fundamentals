package ObjectsExP04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int countStudents = Integer.parseInt(scanner.nextLine());
        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < countStudents; i++) {
            String studentInfo = scanner.nextLine();
            String firstName = studentInfo.split(" ")[0];
            String lastName = studentInfo.split(" ")[1];
            double grade = Double.parseDouble(studentInfo.split(" ")[2]);

            Student student = new Student(firstName, lastName, grade);
            studentList.add(student);
        }


    }
}
