package JavaKurs02.Obiektowe;

public class Auto {
    public String marka;
    public String model;
    public int rok;
    public int przebieg;
    public String owner;

    public void jedz() {
        System.out.println("Jedź!");
    }

    public void hamuj() {
        System.out.println("hamuj!");
    }
    public void info(){
        System.out.println("Marka: "+ marka);
        System.out.println("Model: "+ model);
        System.out.println("Rok: "+ rok);
        System.out.println("Przebieg: " + przebieg);
        System.out.println("Właściciel: " + owner);
    }
}

