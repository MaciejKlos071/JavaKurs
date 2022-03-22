package JavaPodstawy.HomeWork.HomeWork_5.podstawy;

public class Switch {
    public static void main(String[] args) {
        String danie = "Burger";
        switch (danie){
            case "Pizza":
                System.out.println("33zl");
                break;
            case "Burger":
                System.out.println("20zl");
                break;
            case "Frytki":
                System.out.println("5zl");
                break;
            default:
                System.out.println("brak dania w karcie");


        }


    }
}
