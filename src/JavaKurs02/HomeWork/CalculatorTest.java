package JavaKurs02.HomeWork;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int numberOne = scanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int numberTwo = scanner.nextInt();

        Calculator calculator = new Calculator();
        System.out.println("Wynik dodawania" + calculator.add(numberOne, numberTwo));
        System.out.println("Wynik odejmowania" + calculator.sub(numberOne, numberTwo));
        System.out.println("Wynik mnożenia" + calculator.mult(numberOne, numberTwo));
        System.out.println("Wynik dzielenia" + calculator.div(numberOne, numberTwo));
        System.out.println("Wynik modulo" + calculator.mod(numberOne, numberTwo));

    }

}
