package JavaKurs02;

import java.util.ArrayList;
import java.util.Scanner;

public class InstrukcjeSwitch {


    ArrayList SwitchDania(String danie){
        ArrayList<String> Order = new ArrayList<String>();
        String informacja = "Wybrales danie: " + danie;
//        while (!Order.equals("KONIEC")) {
            switch (danie) {
                case "PIZZA":
                    System.out.println(informacja);
                    Order.add(danie);
                    break;
                case "MAKARON":
                    System.out.println(informacja);
                    Order.add(danie);
                    break;
                case "SUSHI":
                    System.out.println(informacja);
                    Order.add(danie);
                    break;
                case "ZAPIEKANKA":
                    System.out.println(informacja);
                    Order.add(danie);
                    break;
                case "ZUPA":
                    System.out.println(informacja);
                    Order.add(danie);
                    break;
                default:
                    System.out.println(informacja);
                    Order.add(danie);
                    break;
            }

//        }
    return Order;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InstrukcjeSwitch instrukcja = new InstrukcjeSwitch();
        ArrayList orderList = instrukcja.SwitchDania("PIZZA");
        if(!orderList.isEmpty()) System.out.println(orderList.get(0));;

    }
}
