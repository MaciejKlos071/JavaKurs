package JavaKurs02;

public class TypyObiektowe {

    public static void main(String[] args) {

        //liczby stałoprzecinkowe
        Byte byteNumber = 127; // 1 bajt (-128) do 127
        Short shortNumber = 32689; // 2 bajty (-32768) do 32767
        Integer intNumber = 32768999; // 4 bajty (-2 147 483 648) do 2 147 483 647
        Long longNumber = 2148000L; // 8 bajtów  (-2^63) do (2^63) -1

        //liczby zmienni przecinkowe
        Float floatNumber = 4.99934F; // 4 bajty - max ok 6-7 liczb po przecinku
        Double doubleNumber = 3.999999999999999D; // 8 bajtów - max ok 14 cyfr po przecinku

        //Wartośći logiczne
        Boolean prawda = true;
        Boolean falsz = false;

        //Pojedyńczy znak
        Character letter = 'A';

        // Ciąg znaków
        String hello = "Hello Maciek";

        System.out.println(hello.contains("hello"));
        System.out.println(hello.charAt(0));

    }
}
