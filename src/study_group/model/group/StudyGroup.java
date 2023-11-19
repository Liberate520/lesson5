package study_group.model.group;

import study_group.model.group.iterators.StudentIterator;
import study_group.model.student.comparators.StudentComparatorByAge;
import study_group.model.student.comparators.StudentComparatorByName;
import study_group.model.teacher.Teacher;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup<E1 extends GroupItem> implements Iterable<E1> {
    private List<E1> studentList;
    private Teacher teacher;

    public StudyGroup() {
        studentList = new ArrayList<>();
    }

    public void addStudent(E1 student){
        studentList.add(student);
    }

    public void addTeacher(Teacher teacher){
        this.teacher = teacher;
    }

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
