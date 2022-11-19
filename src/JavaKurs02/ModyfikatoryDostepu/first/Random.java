package JavaKurs02.ModyfikatoryDostepu.first;

public class Random {

    // klasa potomna w tej samie paczce nie ma dostepu do pol/metod private
    public static void main(String[] args) {
        Parent parent = new Parent();

        System.out.println(parent.first);
        System.out.println(parent.secound);
        System.out.println(parent.third);
        //       System.out.println(fourth); Brak dostępu do pola private
        parent.firstmetod();
        parent.secoundmetod();
        parent.thirdmetod();
//        fourthmetod();Brak dostępu do metody private
    }

}
