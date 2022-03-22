package JavaPodstawy.HomeWork.HomeWork_5;

public class HomeWork_5 {
    /*
    napisz program który prosi użytkownika o 2 liczby, a następnie wykonana na nich podstawowe operacje matematyczne
     */
    public static void main(String[] args) {
        HomeWork_5_Calculator calc = new HomeWork_5_Calculator();
        calc.setLp1(calc.podajLiczbe());
        calc.setLp2(calc.podajLiczbe());
        System.out.println(calc.add());
        System.out.println(calc.sub());
        System.out.println(calc.div());
        System.out.println(calc.mult());


    }

}
