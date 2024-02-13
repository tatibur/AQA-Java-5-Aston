/* Создай класс со следующим содержимым: (СМ. СКРИНШОТ)
1. Необходимо узнать средний возраст студентов мужского пола;
2. Кому из студентов грозит получение повестки в этом году при условии, что призывной возраст установлен в диапазоне от 18 до 27 лет. */
package by.aston.aqa;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

public class Task_4 {
    private enum Gender {
        MAN,
        WOMAN
    }

    private static class Student {
        private final String name;
        private final Integer age;
        private final Gender gender;

        public Student(String name, Integer age, Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Gender getGender() {
            return gender;
        }

        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    "}";
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student)) return false;
            Student student = (Student) o;
            return Objects.equals(name, student.name) &&
                    Objects.equals(age, student.age) &&
                    Objects.equals(gender, student.gender);
        }

        public int HashCode() {
            return Objects.hash(name, age, gender);
        }
    }

    public static void main(String[] args) {
        Collection<Student> students = Arrays.asList(
                new Student("Дмитрий", 17, Gender.MAN),
                new Student("Максим", 17, Gender.MAN),
                new Student("Екатерина", 17, Gender.WOMAN),
                new Student("Михаил", 28, Gender.MAN)
        );
        // вычисление среднего возраста студентов мужского пола
        students.stream().filter(s -> s.getGender() == Gender.MAN).mapToInt(s -> s.getAge()).average().ifPresent(avg -> System.out.println("Средний возраст студентов мужского пола: " + avg));
        // рассматриваем призывников обоих полов (в задании не указан пол призывника)
        students.stream().filter(s -> s.getAge() >= 18 && s.getAge() <= 28).forEach(s -> System.out.println("В этом году получит повестку: " + s.getName()));
    }
}
