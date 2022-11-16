package JavaKurs02.Obiektowe;

public class Student {
    public String imie;
    public String nazwisko;
    public String nick;
    public String eMail;
    public int indeks;
    public static String nazwaUczelni = "WSB";

    public void przedstawSie(){
        System.out.println("Nazywam się: "+ imie + " " + nazwisko );
    }
    public void zalogujSie(){
        System.out.println("loguje sie za pomoca: "+ nick);
    }
    public void podajNumerIndeksu(){
        System.out.println("Mój numer indeksu: "+ indeks);
    }
    public void podajEmail(){
        System.out.println("Mój emial to: "+ eMail);
    }
}
