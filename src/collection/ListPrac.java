package collection;

import java.util.ArrayList;
import java.util.List;

public class ListPrac {
    private List<String> students = new ArrayList<>();
    private List<Student> studentObjs = new ArrayList<>();

    Names names = new Names();
    public ListPrac() {

        names.getName(students);
        this.studentObjs = names.getStudentObjs();
    }

    // 멋사 2기 학생의 이름이 들어있는 list를 return 하는 method
    public List<String> getStudentList() {
        return this.students;
    }
}