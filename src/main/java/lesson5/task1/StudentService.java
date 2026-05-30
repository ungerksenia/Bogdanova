package lesson5.task1;

import java.util.Iterator;
import java.util.Set;

public class StudentService {

    public void printStudents(Set<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public void deleteStudents(Set<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.averageGrade() < 3) {
                iterator.remove();
            }
        }
    }

    public void transferStudents(Set<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.averageGrade() >= 3) {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

}
