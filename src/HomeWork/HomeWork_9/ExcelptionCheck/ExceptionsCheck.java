package HomeWork.HomeWork_9.ExcelptionCheck;

import java.util.Scanner;

public class ExceptionsCheck {
    /*
    Pobierz wiek od uzytkownika, jezeli bedzie mniejszy od zera to wyrzuc wyjatek InvalidAgeException
    Jeżeli wiek 18>= to mozemy wypisac ze jest pelnoletni
     */

    public static void main(String[] args) throws InvalidAgeException {
        Scanner respond = new Scanner(System.in);
        System.out.println("Ile masz lat?");
        Integer wiek = respond.nextInt();
        if (wiek >= 18){
            System.out.println("Jesteś pełnoletni");
        }else {
            throw new InvalidAgeException("Nie masz 18 lat.");
        }
    }
}
