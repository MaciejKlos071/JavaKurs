package JavaKurs02.Obiektowe.Dziedziczenie;

public class MathTeacher extends Person{

    public String school;

    public MathTeacher(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    public void teachingMath(){
        walk();
        eat();
        System.out.println("I'm teaching math");
    }
    public void sayHello(){
        System.out.println("Hello my name is "+ name);
        System.out.println("I am " + age + " year's old");

    }

    public void walk() {
        System.out.println("I walk very fast");
    }
}

