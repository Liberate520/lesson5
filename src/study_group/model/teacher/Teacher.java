package study_group.model.teacher;

import study_group.model.group.GroupItem;
import study_group.model.user.User;
import java.time.LocalDate;

public class Teacher extends User implements Comparable<Teacher> {
    private final int teacherId;

    public Teacher(int teacherId, String firstName, String secondName, LocalDate birthDay, int age) {
        this.teacherId = teacherId;
        this.setFirstName(firstName);
        this.setSecondName(secondName);
        this.setBirthDay(birthDay);
        this.setAge(age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id = " + teacherId +
                ", Имя = '" + this.getFirstName() +
                ", Фамилия = '" + this.getSecondName() + '\'' +
                ", Возраст = " + this.getAge() +
                '}';
    }
    @Override
    public int compareTo(Teacher o) {
        return getFirstName().compareTo(o.getFirstName());
    }
}
