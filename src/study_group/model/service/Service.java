package study_group.model.service;

import study_group.model.group.StudyGroup;
import study_group.model.student.Student;
import study_group.model.teacher.Teacher;


public class Service {
    private int idStudent;
    private int idTeacher;
    private final StudyGroup<Student, Teacher> group;

    public Service() {
        group = new StudyGroup<>();
    }

    public void addStudent(String name, int age){
        Student student = new Student(idStudent++, name, null, null, age);
        group.addStudent(student);
    }

    public void addTeacher(String name, int age){
        Teacher teacher = new Teacher(idTeacher++, name, null, null, age);
        group.addTeacher(teacher);
    }

    public String getTeacherInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Информация о преподавателе:\n");
        stringBuilder.append(group.getTeacher().toString());
        return stringBuilder.toString();
    }

    public String getStudentsInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список студентов:\n");

//        Iterator<Student> iterator = group.iterator();
//        while (iterator.hasNext()){
//            Student student = iterator.next();
//            stringBuilder.append(student);
//            stringBuilder.append("\n");
//        }
        for (Student student: group){
            stringBuilder.append(student);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void sortByName(){
        group.sortByName();
    }

    public void sortByAge(){
        group.sortByAge();
    }
}
