package HomeWork;

import java.util.Scanner;

public class HomeWork_2 {
    public static void main(String[] args) {
        /*
        Zapytaj użytkownika o wiek.
        W przypadku gdy ma mniej niż 18 lat wpisz na ekranie informacje ze nie mozesz kupic alkocholu.
        gdy ma wiecej niz 18 lat to dziekuje za zakup
         */
    Scanner scaner = new Scanner(System.in);
    System.out.println("Witaj! ile masz lat ?");
    int wiek = scaner.nextInt();
    if (wiek >= 18 && wiek >= 0){
        System.out.println("Dziękuję za zakup");
    }else if ( wiek < 18 && wiek >= 0){
        System.out.println("Musisz mieć skończone 18 lat !");
    }else {
        System.out.println("Wiek "+wiek+" jest nie prawidłowy ! " );
    }

    }
}
