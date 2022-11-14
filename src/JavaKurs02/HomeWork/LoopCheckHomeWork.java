package JavaKurs02.HomeWork;

public class LoopCheckHomeWork {


    public static void main(String[] args) {
/*
        for (int i = 1; i <= 100; i++) {
            if(i%3 == 0){
                System.out.println(i);
            }
        }*/
        int[] tablica = new int[] {1,3,5,6,7,8,9,10,11};
        System.out.println();

        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i]+ ", ");
        }

        for (int i = 0; i < tablica.length/2; i++) {
            int sth = tablica[i];
            tablica[i] = tablica[tablica.length-1-i];
            tablica[tablica.length-1-i] = sth;
        }
        System.out.println();
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i]+", ");
        }
    }
}
