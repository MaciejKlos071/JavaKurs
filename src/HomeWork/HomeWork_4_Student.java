package HomeWork;

public class HomeWork_4_Student {
    public String imie;
    public String nazwisko;
    public String nick;
    public String eMail;
    public int indeks;

    public void przedstawSie() {
        System.out.println("Nazywam się: " + imie + " " + nazwisko);
    }

    public void zalogujSie() {
        System.out.println("loguje sie za pomoca loginu: " + nick);
    }

    public void podajNumerIndeksu() {
        System.out.println("Mój numer indeksu: " + indeks);
    }

    public void podajEmail() {
        System.out.println("Mój emial to: " + eMail);
    }
}
