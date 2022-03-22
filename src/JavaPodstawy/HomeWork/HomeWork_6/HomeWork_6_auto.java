package JavaPodstawy.HomeWork.HomeWork_6;

public class HomeWork_6_auto {
    public String marka;
    public String  model;
    public Integer rok;
    public Integer przebieg;
    public String wlasciciel;

    public HomeWork_6_auto(String marka, String model, Integer rok, Integer przebieg, String wlasciciel){
        this.marka = marka;
        this.model = model;
        this.rok = rok;
        this.przebieg = przebieg;
        this.wlasciciel = wlasciciel;
    }



    public void jedz(){
        System.out.println("Jedz!");

    }
    public void hamuj(){
        System.out.println("chamuj");
    }
    public void info(){
        System.out.println("Marka: "+ marka);
        System.out.println("Model: "+ model);
        System.out.println("Rok: "+ rok);
        System.out.println("Przebieg: " + przebieg);
        System.out.println("Właściciel: " + wlasciciel);
    }
}
