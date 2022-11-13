package JavaKurs02;

public class OperatoryLogiczne {
    public static void main(String[] args) {
        boolean firstvalue = true;
        boolean secoundtvalue = false;
        boolean thirdvalue = false;
        boolean fourthvalue = true;
        // && -> true wtedy gdy wyrazenie skladowe są równe true
        System.out.println(firstvalue && secoundtvalue); // false
        System.out.println(firstvalue && fourthvalue); // true
        System.out.println(secoundtvalue && thirdvalue); // false

        // || lub -> true gdy jedno wyrazenie skladowe jest rowne true
        System.out.println(firstvalue || secoundtvalue); // true
        System.out.println(firstvalue || fourthvalue); // true
        System.out.println(secoundtvalue || thirdvalue); // false

        //! negacja -  zwraca wartosc przeciwna do wyrazenia przed ktorym się znajduje
        System.out.println(!firstvalue); // false
        System.out.println(!thirdvalue); // true
        System.out.println(!(secoundtvalue && secoundtvalue)); // true
    }
}
