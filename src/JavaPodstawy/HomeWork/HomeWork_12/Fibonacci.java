package JavaPodstawy.HomeWork.HomeWork_12;

public class Fibonacci {
    public static void main(String[] args) {

    }

    public static int fibonacci(int n){
        int n1 = 1;
        int n2 = 1;
        for(int i = 3; i <= n; i++){
            int temp = n2 +n1;
            n1 = n2;
            n2 = temp;
        }
        return n2;
    }
}
