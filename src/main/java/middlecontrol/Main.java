package middlecontrol;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("Василий", Arrays.asList(3.5, 4.2, 3.0, 4.0, 5.0), "Литература"));
        studentsList.add(new Student("Петр", Arrays.asList(3.5, 4.2, 5.0, 4.0, 5.0), "Математика"));

        studentsList.add(new Student("Иван", Arrays.asList(3.5, 4.2, 5.0, 4.0, 5.0), "Информатика"));
        studentsList.add(new Student("Дмитрий", Arrays.asList(5.0, 5.0, 5.0, 5.0, 5.0), "Информатика"));
        studentsList.add(new Student("Геннадий", Arrays.asList(4.5, 4.2, 5.0, 4.0, 5.0), "Информатика"));
        studentsList.add(new Student("Евгений", Arrays.asList(3.5, 4.2, 5.0, 4.0, 5.0), "Информатика"));
        studentsList.add(new Student("Анна", Arrays.asList(3.9, 4.2, 5.0, 4.8, 5.0), "Информатика"));
        studentsList.add(new Student("Ирина", Arrays.asList(4.5, 4.6, 4.6, 4.8, 5.0), "Информатика"));
        studentsList.add(new Student("Татьяна", Arrays.asList(4.5, 4.9, 5.0, 4.0, 5.0), "Информатика"));
        studentsList.add(new Student("Алексей", Arrays.asList(4.5, 4.2, 5.0, 4.6, 5.0), "Информатика"));

        List<Student> resultList = studentsList.stream()
                .filter(n -> n.getSpecialty().equals("Информатика"))
                .filter(n -> n.getAverageGrade() > 4.5)
                .sorted(Comparator.comparingDouble(Student::getAverageGrade).reversed())
                .limit(5)
                .collect(Collectors.toList());

        System.out.println(resultList);
    }
}
