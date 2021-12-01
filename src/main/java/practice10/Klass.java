package practice10;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> students;
    private Teacher teacher;

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
            if (teacher != null){
                System.out.print(String.format("I am %s. I know %s become Leader of Class %d.\n", teacher.getName(), student.getName(), number));
            }
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student){
        students.add(student);
        if (teacher != null){
            System.out.print(String.format("I am %s. I know %s has joined Class %d.\n", teacher.getName(), student.getName(), number));
        }
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public boolean isIn(Student student) {
        return number == student.getKlass().getNumber();
    }

}
