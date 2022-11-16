package JavaKurs02.HomeWork;

import JavaKurs02.Obiektowe.Auto;

public class AutoTestHomeWork {


    public static void main(String[] args) {
        AutoHomeWork mercedes = new AutoHomeWork("Mercedes","Klasa S", 2022, 1200 , "Maciej");

        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

        AutoHomeWork audi = new AutoHomeWork("audi","A4", 2022, 1200 , "Kasia");

        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

        AutoHomeWork noName = new AutoHomeWork(null,null, 0, 0 , null);

        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();
    }
}
