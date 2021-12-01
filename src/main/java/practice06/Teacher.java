package practice06;

public class Teacher extends Person{
    private Klass klass;

    public Teacher(String name, int age){
        super(name, age);
    }

    public Teacher(String name, int age, Klass klass){
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        if(getKlass()!=null){
            return super.introduce() + String.format(" I am a Teacher. I teach %s.", klass.getDisplayName());
        } else{
            return super.introduce() + String.format(" I am a Teacher. I teach No Class.");
        }
    }
    public String introduceWith(Student student){
        if(klass.getNumber() == student.getKlass().getNumber()){
            return "My name is "+ getName() + ". I am " + getAge() +" years old. I am a Teacher. I teach " + student.getName() + ".";
        } else {
            return "My name is "+ getName() + ". I am " + getAge() +" years old. I am a Teacher. I don't teach " + student.getName() + ".";
        }
    }
}