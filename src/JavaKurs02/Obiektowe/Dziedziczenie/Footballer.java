package JavaKurs02.Obiektowe.Dziedziczenie;

public class Footballer extends Person{
    public String footballClub;
    public Footballer(String name, int age, String footballClub){
        super(name, age);
        this.footballClub = footballClub;

    }
    public void playFootball(){
        walk();
        eat();
        System.out.println("I'm playing football" + footballClub);
    }
    public void eat(){
        System.out.println("Lubie zdrowe jedzenie");
    }

}
