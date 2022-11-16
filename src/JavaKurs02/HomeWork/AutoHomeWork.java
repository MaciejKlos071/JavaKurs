package JavaKurs02.HomeWork;

public class AutoHomeWork {
    public String marka;
    public String model;
    public int rok;
    public int przebieg;
    public String owner;

    public AutoHomeWork(String marka, String model, int rok, int przebieg, String owner){
        this.marka = marka;
        this.model = model;
        this.rok = rok;
        this.przebieg = przebieg;
        this.owner = owner;

    }


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

