package JavaKurs02.ModyfikatoryDostepu.first;

public class Child extends Parent{

// klasa potomna w tej samie paczce nie ma dostepu do pol/metod private

    public void testIdentifier(){

        System.out.println(first);
        System.out.println(secound);
        System.out.println(third);
 //       System.out.println(fourth); Brak dostępu do pola private
        firstmetod();
        secoundmetod();
        thirdmetod();
//        fourthmetod();Brak dostępu do metody private

    }

}
