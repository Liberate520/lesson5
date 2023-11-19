package study_group.model.student;

import study_group.model.group.GroupItem;
import study_group.model.user.User;

import java.time.LocalDate;

public class Student extends User implements Comparable<Student> {
    private final int studentId;

    public Student(int studentId, String firstName, String secondName, LocalDate birthDate, int age) {
        this.studentId = studentId;
        this.setFirstName(firstName);
        this.setSecondName(secondName);
        this.setBirthDay(birthDate);
        this.setAge(age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + studentId +
                ", name='" + this.getFirstName() + '\'' +
                ", age=" + this.getAge() +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return getFirstName().compareTo(o.getFirstName());
    }
}
