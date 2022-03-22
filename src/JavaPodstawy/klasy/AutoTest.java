package JavaPodstawy.klasy;

public class AutoTest {

    public static void main(String[] args) {
        Auto mercedes = new Auto();
        mercedes.marka = "Mercedes";
        mercedes.model = "F20";
        mercedes.rok = 2022;
        mercedes.przebieg = 1200;
        mercedes.wlasciciel = "Mercedes S.P Z.O.O";

        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();
        Auto audi = new Auto();
        audi.model = "Audi";
        audi.model = "A5";
        audi.rok = 2020;
        audi.przebieg = 0;
        audi.wlasciciel = "Maciej";
        audi.jedz();
        audi.hamuj();
        audi.info();
        Auto noName = new Auto();
        noName.jedz();
        noName.hamuj();
        noName.info();
    }
}
