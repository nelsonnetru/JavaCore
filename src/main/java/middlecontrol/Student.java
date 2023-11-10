/* Имеется список студентов. Каждый студент имеет имя, список оценок и специальность.
   Найдите первых 5 студентов специальности "Информатика" с средним баллом выше 4.5,
   отсортированных по убыванию среднего балла.
 */

package middlecontrol;
import java.util.List;

public class Student {

    private String name;
    private List<Double> grades;
    private String specialty;

    public Student(String name, List<Double> grades, String specialty) {
        this.name = name;
        this.grades = grades;
        this.specialty = specialty;
    }

    public double getAverageGrade() {
        return grades.stream()
                .mapToDouble(n -> n)
                .average()
                .orElse(0.0);
    }

    public String getSpecialty() {
        return this.specialty;
    }

    @Override
    public String toString() {
        return "\n" + name + ", средняя оценка = " + getAverageGrade() + ", (" + specialty + ")";
    }
}
