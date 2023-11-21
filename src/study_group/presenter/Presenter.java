package study_group.presenter;

import study_group.model.service.Service;
import study_group.view.ConsoleUI;
import study_group.view.View;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }

    public void addStudent(String name, int age) {
        service.addStudent(name, age);
        //какой-то ответ
        getStudentsListInfo();
    }

    public void addTeacher(String name, int age) {
        service.addTeacher(name, age);
        //какой-то ответ
        getTeacherInfo();
    }

    public void getTeacherInfo() {
        String info = service.getTeacherInfo();
        view.printAnswer(info);
    }
    public void getStudentsListInfo() {
        String info = service.getStudentsInfo();
        view.printAnswer(info);
    }

    public void sortByAge() {
        service.sortByAge();
        getStudentsListInfo();
    }

    public void sortByName() {
        service.sortByName();
        getStudentsListInfo();
    }
}
