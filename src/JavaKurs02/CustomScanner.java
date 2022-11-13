package JavaKurs02;

import java.util.Scanner;

public class CustomScanner {
    Scanner scanner = new Scanner(System.in);
    String odczytImienia(){
        System.out.println("Podaj swoje imię");
        String name = scanner.nextLine();

        System.out.println("Cześć "+ name + "!");
        return name;
    }
    public void KwadratLiczby(){
        System.out.println("Podaj liczbę któa zostanie podniesiona do kwadratu");
        int liczba = scanner.nextInt();
        double liczbaDoKwadratu =  Math.pow(liczba,2);
        System.out.println(liczbaDoKwadratu);
    }


    public static void main(String[] args) {
        CustomScanner scanner = new CustomScanner();
        scanner.odczytImienia();
        System.out.println("------");
        scanner.KwadratLiczby();


    }
}
