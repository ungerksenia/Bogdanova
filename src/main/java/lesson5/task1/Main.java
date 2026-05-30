package lesson5.task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<Student>();

        List<Integer> grades1 = new ArrayList<>();
        grades1.add(4);
        grades1.add(3);
        grades1.add(5);
        grades1.add(4);
        Student student1 = new Student(
                "Анна",
                "К5",
                2,
                grades1
        );
        students.add(student1);

        List<Integer> grades2 = new ArrayList<>();
        grades2.add(4);
        grades2.add(3);
        grades2.add(5);
        grades2.add(4);
        Student student2 = new Student(
                "Виктор",
                "В6",
                3,
                grades2
        );
        students.add(student2);

        List<Integer> grades3 = new ArrayList<>();
        grades3.add(4);
        grades3.add(3);
        grades3.add(5);
        grades3.add(4);
        Student student3 = new Student(
                "Клавдия",
                "В6",
                3,
                grades3
        );
        students.add(student3);

        List<Integer> grades4 = new ArrayList<>();
        grades4.add(4);
        grades4.add(3);
        grades4.add(5);
        grades4.add(4);
        Student student4 = new Student(
                "Апполинарий",
                "К1",
                4,
                grades4
        );
        students.add(student4);

        StudentService service = new StudentService();

        service.printStudents(students, 3);
    }
}
