package JavaKurs02.HomeWork.Dziedziczenie;
/*
* Stwórz klase bazowa app - zawiera pole name i metode appInfo, dodaj kontruktor do ktorego przekazesz wartosci name
*
* stworz klase potomne AndroidApp i IphoneApp - zawiera metode runAndroidApp / run runn IphoneApp
* */
public class App {
    public String name;

    public App(String name){
        this.name = name;
    }

    public void appInfo(){
        System.out.println("Aplikacja nazywa się "+ name);
    }

}
