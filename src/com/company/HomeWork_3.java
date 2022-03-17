package com.company;

public class HomeWork_3 {
    public static void main(String[] args) {
        /*
        Wypisz liczby z zakresu 1-100 podzielne przez 3
        odwocic elementy tablicy  [1, 3, 5, 7, 0] - [0, 7, 5, 3, 1]

        for (int i = 1; i < 101; i++) {
            if(i % 3 == 0) System.out.println(i);
        }*/
        int[] lista = new int[] {1, 3, 5, 7, 0};
        for (int j : lista) {
            System.out.print(j);
        }
        System.out.println();
        for (int i = 0, b; i < lista.length/2 ; i++) {
            b = lista[i];
            lista[i] = lista[(lista.length-i)-1];
            lista[(lista.length-i)-1] = b;

        }
        for (int j : lista) {
            System.out.print(j);
        }

    }
}
