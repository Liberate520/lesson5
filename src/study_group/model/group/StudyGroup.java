package study_group.model.group;

import study_group.model.group.iterators.StudentIterator;
import study_group.model.student.comparators.StudentComparatorByAge;
import study_group.model.student.comparators.StudentComparatorByName;
import study_group.model.teacher.Teacher;
import study_group.model.user.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup<E1 extends User&GroupItem, E2 extends User> implements Iterable<E1> {
    private final List<E1> studentList;
    private E2 teacher;

    public StudyGroup() {
        studentList = new ArrayList<>();
    }

    public E2 getTeacher() {
        return teacher;
    }
    public void addStudent(E1 student){
        studentList.add(student);
    }

    public void addTeacher(E2 teacher) { this.teacher = teacher; }

    @Override
    public Iterator<E1> iterator() {
        return new StudentIterator<>(studentList);
    }

    public void sortByName(){
        studentList.sort(new StudentComparatorByName<>());
    }

    public void sortByAge(){
        studentList.sort(new StudentComparatorByAge<>());
    }
}
