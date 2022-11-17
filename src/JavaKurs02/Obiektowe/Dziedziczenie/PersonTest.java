package JavaKurs02.Obiektowe.Dziedziczenie;

public class PersonTest {
    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher("Tom", 30, "WSB");
        teacher.walk();
        teacher.eat();
        teacher.teachingMath();
        teacher.sayHello();
        System.out.println();
        Footballer footballer = new Footballer("FCB", 22, "FCB");
        footballer.walk();
        footballer.eat();
        footballer.playFootball();
    }
}
