package JavaPodstawy.HomeWork.HomeWork_5.podstawy;

public class InstrukcjaWarunkowaIf {
    public static void main(String[] args) {
        float a = 4.0F;
        float b = 2.0F;
        if(a != 0 && b != 0 ) {
            System.out.println(a / b);
        }else {
            System.out.println("podaj inna liczbe");
        }
    int number = 0;
        if(number == 0){
            System.out.println("liczba = " + number);
        }else if (number > 0){
            System.out.println("liczba = " + number);

        }else if(number > 10){
            System.out.println("liczba wieksza od 10= " + number);

        }


        else if (number < -2){
            System.out.println("liczba = " + number);

        }else {
            System.out.println("Żaden warunek nie został spełniony liczba = "+ number);
        }

    }
}
