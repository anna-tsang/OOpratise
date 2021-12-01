package practice05;

public class Teacher extends Person{
    private int klass;

    public Teacher(String name, int age){
        super(name, age);
    }

    public Teacher(String name, int age, int klass){
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    public String introduce() {
        if(getKlass() > 0){
            return super.introduce() + String.format(" I am a Teacher. I teach Class %d.",getKlass());
        } else{
            return super.introduce() + String.format(" I am a Teacher. I teach No Class.");
        }


    }
}