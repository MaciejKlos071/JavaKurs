package JavaKurs02.HomeWork;

import JavaKurs02.Obiektowe.Student;

// Stwórz 3 obiekty klasy studnent. przypisz wartosci do pol. stworz tablice i dodaj studentów do tablicy.
public class StudentTest {

    public static void main(String[] args) {

        Student mklos = new Student();
        mklos.imie = "Maciej";
        mklos.nazwisko = "Klos";
        mklos.nick = "Mklos";
        mklos.eMail= "maciej.klos@email.com";
        mklos.indeks = 10901;

        Student wmaj = new Student();
        wmaj.imie = "Wojciech";
        wmaj.nazwisko = "Maj";
        wmaj.nick = "WMaj";
        wmaj.eMail= "Wojciech.maj@email.com";
        wmaj.indeks = 10902;

        Student kwojtar = new Student();
        kwojtar.imie = "Karol";
        kwojtar.nazwisko = "Wojtar";
        kwojtar.nick = "KWojtar";
        kwojtar.eMail= "Karol.wojtar@email.com";
        kwojtar.indeks = 10903;

        Student[] listaStudentów = new Student[] {mklos,wmaj,kwojtar};


        for (int i = 0; i < listaStudentów.length; i++) {
            listaStudentów[i].zalogujSie();
            listaStudentów[i].przedstawSie();
            listaStudentów[i].podajEmail();
            listaStudentów[i].podajNumerIndeksu();
            System.out.println();
        }
        String uczelnia = Student.nazwaUczelni;

        Student.infoUczelnia();

    }


}
