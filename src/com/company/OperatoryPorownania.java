package com.company;

import java.util.Scanner;

public class OperatoryPorownania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę A:");
        int firtstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę B:");

        int secoundNumber = scanner.nextInt();

        System.out.println("A == B: " + (firtstNumber == secoundNumber));
        System.out.println("A != B: " + (firtstNumber != secoundNumber));
        System.out.println("A >= B: " + (firtstNumber >= secoundNumber));
        System.out.println("A <= B: " + (firtstNumber <= secoundNumber));
        System.out.println("A  > B: " + (firtstNumber > secoundNumber));
        System.out.println("A <  B: " + (firtstNumber < secoundNumber));
        // zadanie dodać funkcje wpisywania wartości przez użytkownika i wypisać je na ekran.
    }
}
