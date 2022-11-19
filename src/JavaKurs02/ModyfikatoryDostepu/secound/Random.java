package JavaKurs02.ModyfikatoryDostepu.secound;

import JavaKurs02.ModyfikatoryDostepu.first.Parent;

public class Random {

    // klasa potomna w tej samie paczce nie ma dostepu do pol/metod private
    public static void main(String[] args) {
        Parent parent = new Parent();

        System.out.println(parent.first);
//        System.out.println(parent.secound);defoult
//        System.out.println(parent.third);protected
        //       System.out.println(fourth); Brak dostępu do pola private
        parent.firstmetod();
//        parent.secoundmetod(); defoult
     //   parent.thirdmetod(); protected
//        fourthmetod();Brak dostępu do metody private
    }

}
