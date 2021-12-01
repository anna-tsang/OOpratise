package practice09;

public class Person {
    private int id;
    private String name;
    private int age;
    public Person(int id, String name, int age) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean equals(Object obj){
        return this.id == ((Person)obj).getId();
    }

    public String introduce() {
        return String.format("My name is " + name + ". I am " + age + " years old.");
    }
}