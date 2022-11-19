package JavaKurs02.ModyfikatoryDostepu.secound;

import JavaKurs02.ModyfikatoryDostepu.first.Parent;

public class Child extends Parent {

    // klasa potomna w tej samie paczce nie ma dostepu do pol/metod private oraz defoult

    public void testIdentifier(){

        System.out.println(first);
        //       System.out.println(secound);Brak dostępu do pola defoult
        System.out.println(third);
        //       System.out.println(fourth); Brak dostępu do pola private
        firstmetod();
        //        secoundmetod();Brak dostępu do pola defoult
        thirdmetod();
        //        fourthmetod();Brak dostępu do metody private

    }
}
