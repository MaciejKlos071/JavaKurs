package JavaKurs02.Obiektowe;

public class MetodyTest {

    public static void main(String[] args) {
        Metody metoda = new Metody();

        metoda.policzWynik();

        int wynik = metoda.pobierzWynik();
        System.out.println(wynik);

        int wynik2 = wynik *wynik;
        System.out.println(wynik2);

        metoda.policzWynikparam(100);
        metoda.add(2,4);
    }

}
