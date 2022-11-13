package JavaKurs02;

import java.util.Scanner;

public class InstrukcjaWarunkowaIfElse {

    public void WarunkiIfElse(){
        float dzielna = 4.0F;
        float dzielnik = 2.0F;

        if(dzielnik != 0){
            System.out.println("Wynik dzielenia to: " + dzielna/dzielnik);
        }else {
            System.out.println("Podaj inną liczbę");
        }
    }

    public void blokIfElse(){
        int number = 12;
        if (number == 0){
            System.out.println();
        }else if (number > 10){
            System.out.println("Wieksza od 10");
        } else if (number > 0 ) {
            System.out.println("Liczba dodatnia");
        } else if (number < -5) {
            System.out.println("Liczba mniejsza od -5");
        }else {
            System.out.println("Warunki nie zostały spełnione");
        }
    }
    public void SprawdzWiek(){
/*Zapytaj uzytkowniika o wiek
* w przypadku gdy mniej niz 19 wpisz na erkanie informacje ze nie mozesz kupic alkocholu.
* gwy wiek wiecej niz 18 lat to podziekuj za zakupy*/
        Scanner scaner = new Scanner(System.in);
        System.out.println("Podaj wiek");
        int wiek = scaner.nextInt();
        if (wiek >= 18){
            System.out.println("Wiek prawidłowy");
        } else if ((0 <= wiek) && (wiek < 18)) {
            System.out.println("Jesteś zbyt młody");
        } else if (wiek <0) {
            System.out.println("Wiek nie może być ujemny");
        }
    }


    public static void main(String[] args) {
        InstrukcjaWarunkowaIfElse intrukcje = new InstrukcjaWarunkowaIfElse();
        intrukcje.WarunkiIfElse();
        intrukcje.blokIfElse();
    }
}
