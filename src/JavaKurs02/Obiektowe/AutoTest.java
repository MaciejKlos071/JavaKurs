package JavaKurs02.Obiektowe;

public class AutoTest {


    public static void main(String[] args) {
        Auto mercedes = new Auto();
        mercedes.marka = "Mercedes";
        mercedes.model = "Klasa S";
        mercedes.rok = 2022;
        mercedes.przebieg = 1200;
        mercedes.owner = "Maciej";

        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

    }
}
