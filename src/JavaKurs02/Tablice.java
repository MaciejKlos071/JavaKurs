package JavaKurs02;

public class Tablice {

    public static void main(String[] args) {
        String[] imiona = new String[3];
        imiona[0] = "Tomasz";
        imiona[1] = "Grzesiek";
        imiona[2] = "Kasia";
        System.out.println(imiona[0]);
        System.out.println(imiona[1]);
        System.out.println(imiona[2]);

        int[] lottNumbers = new int[] {1,2,3,4,5,6};
        System.out.println(lottNumbers[0]);
        System.out.println(lottNumbers[1]);
        System.out.println(lottNumbers[2]);
        System.out.println(lottNumbers[3]);
        System.out.println(lottNumbers[4]);
        System.out.println(lottNumbers[5]);
        System.out.println(lottNumbers.length);

        for (int i = 0; i < imiona.length ; i++) {
            System.out.println(imiona[i]);
        }
    }
}
