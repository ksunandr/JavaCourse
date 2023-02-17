package collection;

import java.util.*;

public class SetTest {


    public static void main(String[] args) {




        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        System.out.println(list);

        Set<String> set = new HashSet<>(list);
        System.out.println(set);


        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student(1,"M"));
        studentSet.add(new Student(2,"j"));
        studentSet.add(new Student(3,"m"));
        studentSet.add(new Student(3,"m"));

        System.out.println(studentSet);

    }


}
class Student {
    Integer id;
    String name;

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}