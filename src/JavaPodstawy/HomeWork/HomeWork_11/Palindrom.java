package JavaPodstawy.HomeWork.HomeWork_11;

public class Palindrom {
    //kajak
    public static void main(String[] args) {
        String word = "kobyła ma mały bok";
        System.out.println(isPalidrom(word));
    }
    public static boolean isPalidrom(String inputword){
        String word = inputword.toLowerCase().replace(" ", "");
        for (int i = 0; i < (word.length()/2) ; i++) {
            if(word.charAt(i) != word.charAt(word.length()-i-1)){
                return  false;
            }
        }
        return true;
    }
}
