package study_group.model.user;

import java.time.LocalDate;

public abstract class User {
    private String firstName;
    private String secondName;
    private LocalDate birthDay;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
