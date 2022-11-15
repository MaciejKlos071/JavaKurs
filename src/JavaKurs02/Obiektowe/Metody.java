package JavaKurs02.Obiektowe;

public class Metody {

    public void policzWynik(){
        System.out.println("Zaraz policze wynik");
        int resoult = 0;
        for (int i = 0; i < 100; i++) {
            resoult = resoult + i;
        }
        System.out.println("rezultat to: "+ resoult);
    }

    public int pobierzWynik(){
        System.out.println("Zaraz policze wynik");
        int resoult = 0;
        for (int i = 0; i < 100; i++) {
            resoult = resoult + i;
        }
        return resoult;
    }
    public void policzWynikparam(int number){
        System.out.println("Number ma wartość: " + number);
        System.out.println("Zaraz policze wynik");
        int resoult = 0;
        for (int i = 0; i < number; i++) {
            resoult = resoult + i;
        }
        System.out.println("rezultat to: "+ resoult);
    }
    public void  add( int a, int b){
        System.out.println("Suma to: " +a+b);

    }
}
