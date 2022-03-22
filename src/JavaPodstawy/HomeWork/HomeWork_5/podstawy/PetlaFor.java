package JavaPodstawy.HomeWork.HomeWork_5.podstawy;

public class PetlaFor {
    public static void main(String[] args) {
        for (double i = 2; i <=10 ; i++) {
            System.out.println("normalna pętla" + i);
        }
        for (int i = 0; i < 100 ; i = i*2) {
            System.out.println(i);
        }
        for (int i = 0;  ; i++) {
            System.out.println("Nieskończona pętla" + i);
            if(i > 200){
                break;
            }
        }
        System.out.println("");
    }
}
