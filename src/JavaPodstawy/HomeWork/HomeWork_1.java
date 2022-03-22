package JavaPodstawy.HomeWork;

import java.util.Scanner;

public class HomeWork_1 {
    //. Napisz Program który prosi użytkownika o 2 liczbym a następnie wykona na nich podstawowe operacje matematyczne
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double wynik;
        System.out.println("Podaj pierwszą liczbę");
        double firstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        double secoundNumber = scanner.nextInt();
        System.out.println("Pierwsza liczba: "+ firstNumber + "\nDruga liczba: "+ secoundNumber);

        wynik = firstNumber + secoundNumber;
        System.out.println("Suma: " + firstNumber + " + "+ secoundNumber +" = " + wynik);

        wynik = firstNumber - secoundNumber;
        System.out.println("Różnica: "+ firstNumber + " - "+ secoundNumber +" = " + wynik);
        wynik = firstNumber / secoundNumber;
        System.out.println("Iloczyn: "+ firstNumber + " / "+ secoundNumber +" = " + wynik);
        wynik = firstNumber * secoundNumber;
        System.out.println("iloraz: "+ firstNumber + " * "+ secoundNumber +" = " + wynik);
        wynik = firstNumber % secoundNumber;
        System.out.println("Modulo: "+ firstNumber + " % "+ secoundNumber +" = " + wynik);


    }
}
