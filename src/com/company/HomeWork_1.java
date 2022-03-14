package com.company;

import java.util.Scanner;

public class HomeWork_1 {
    //. Napisz Program który prosi użytkownika o 2 liczbym a następnie wykona na nich podstawowe operacje matematyczne
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int secoundNumber = scanner.nextInt();
        System.out.println("Pierwsza liczba: "+ firstNumber + "\nDruga liczba: "+ secoundNumber);


    }
}
