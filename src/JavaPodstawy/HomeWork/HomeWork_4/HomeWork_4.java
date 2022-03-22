package JavaPodstawy.HomeWork.HomeWork_4;
/*
Stwórz 3 obiekty JavaPodstawy.klasy student. przypisz wartosci do pol. stwórz tablice i dodaj studentow do tablicy.
przejdz przez stuidentow w tablicy i wywolaj wszystkie 4 metody.
 */


public class HomeWork_4 {
    public static void main(String[] args) {
        HomeWork_4_Student student_0 = new HomeWork_4_Student();
        HomeWork_4_Student student_1 = new HomeWork_4_Student();
        HomeWork_4_Student student_2 = new HomeWork_4_Student();
        HomeWork_4_Student student_3 = new HomeWork_4_Student();
        //------------------------ student 1
        student_0.imie = "Maciej";
        student_0.nazwisko = "Klos";
        student_0.eMail = "maciej.klos@gmail.com";
        student_0.nick = "Maciej71";
        student_0.indeks = 0102030405;
        //------------------------ student 2
        student_1.imie = "Anna";
        student_1.nazwisko = "Wesoła";
        student_1.eMail = "annawesola@vp.pl";
        student_1.nick = "annawesola";
        student_1.indeks = 2030405123;
        //------------------------ student 3
        student_2.imie = "magdalena";
        student_2.nazwisko = "grzyb";
        student_2.eMail = "magdalena.grzyb@o2.pl";
        student_2.nick = "grzybek0076";
        student_2.indeks = 2030405122;

        //------------------------ student 4
        student_3.imie = "Tomasz";
        student_3.nazwisko = "Krokosz";
        student_3.eMail = "tomasz.kroko@wp.pl";
        student_3.nick = "tomciopaluch";
        student_3.indeks = 2030405121;
        //------------------------- inicjalizacja studentow do tablicy
        HomeWork_4_Student[] studenci = new HomeWork_4_Student[4];
        studenci[0] = student_0;
        studenci[1] = student_1;
        studenci[2] = student_2;
        studenci[3] = student_3;
        int nrStud = 0;
        for(HomeWork_4_Student student : studenci){

            System.out.println("---------------student - "+nrStud+"----------------");
            student.przedstawSie();
            student.podajEmail();
            student.podajNumerIndeksu();
            student.zalogujSie();
            nrStud++;
        }

    }
}
