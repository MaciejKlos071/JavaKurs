package JavaPodstawy.HomeWork.HomeWork_5;

import java.util.Scanner;

public class HomeWork_5_Calculator {
    public double lp1;
    public double lp2;
    public Scanner scanner = new Scanner(System.in);

    public double podajLiczbe(){
        System.out.println("Podaj liczbę: ");
        return scanner.nextDouble();
    }

    public void setLp1(double liczba){
        this.lp1 = liczba;
    }
    public void setLp2(double liczba){
        this.lp2 = liczba;
    }
    public double add(){
        return lp1+lp2;
    }

    public double sub(){
        return lp1-lp2;
    }
    public double mult(){
        return lp1*lp2;
    }
    public double div(){
        return lp1/lp2;
    }
    public double mod(){
        return lp1%lp2;
    }
}
