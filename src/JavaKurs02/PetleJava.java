package JavaKurs02;

public class PetleJava {

    public static void main(String[] args) {
    // PETLA FOR
        int number = 100;
/*        for (int i = 0; i < number; i++) {
            System.out.println(i);
        }
        for (int o = 0; o < number; o++) {
            if (o%5 == 0) {
                System.out.println("Modulo 5 liczby: "+o);
            }
        }*/

    // PĘTLA WHILE
/*        number = 0;
        while (number < 20){
            System.out.println("Moja wartosc to: " + number +" i jest mniejsze od 20");
            number++;
        }*/
    // PĘTLA DO-WHILE
        number = 0;
            do {
                System.out.println("Moja wartosc to: " + number +" i jest mniejsze od 20");
                number++;
            }while (number < 20);

    }
}
