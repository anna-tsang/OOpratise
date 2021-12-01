package practice05;

public class Teacher extends Student{

    public Teacher(String name, int age, int klass) {
        super(name, age, klass);
    }
    public String introduce(){
        return super.introduce() + "I am a Teacher. I teach Class "+getKlass()+".";
    }
}
