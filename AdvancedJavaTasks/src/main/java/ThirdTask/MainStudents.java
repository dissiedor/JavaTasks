package ThirdTask;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Задание (I)
public class MainStudents {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Вася", 16, Student.Sex.MAN),
                new Student("Петя", 23, Student.Sex.MAN),
                new Student("Елена", 42, Student.Sex.WOMAN),
                new Student("Иван Иванович", 69, Student.Sex.MAN)
        );

        List<Student> conscriptionList = students.stream()
                .filter(student -> student.getAge() >= 18 && student.getAge() <= 27)
                .collect(Collectors.toList());
        System.out.println("Те, кому придет повестка:");
        conscriptionList.forEach(System.out::println);

        long potentialWorkersCount = students.stream()
                .filter(student -> student.getAge() >= 18)
                .filter(student -> (student.getSex() == Student.Sex.WOMAN && student.getAge() <= 55) ||
                        (student.getSex() == Student.Sex.MAN && student.getAge() <= 60))
                .count();

        System.out.println("\nКоличество потенциальных работяг: " + potentialWorkersCount);
    }
}