package practice08;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> students;

    public Klass(int number){
        this.number = number;
        students = new ArrayList<Student>();
    }

    public int getNumber() {
        return number;
    }

    public Student getLeader() {
        return leader;
    }

    public String getDisplayName(){
        return "Class " + number;
    }

    public void assignLeader(Student student){
        if(students.contains(student)){
            this.leader = student;
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student){
        students.add(student);
    }

}
