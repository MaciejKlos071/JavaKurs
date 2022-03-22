package JavaPodstawy.HomeWork.HomeWork_5.podstawy.Sety;

import java.util.HashSet;
import java.util.Set;

public class SetyTest {
    public static void main(String[] args) {
        Set<String> fruit = new HashSet<>();
        fruit.add("Apple");
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Oragne");
        System.out.println(fruit.contains("Apple"));
        System.out.println(fruit.size());
        System.out.println(fruit.isEmpty());

        Set<String> vege = new HashSet<>();
        vege.add("potatoes");
        vege.add("onion");
        vege.addAll(fruit);
        System.out.println(vege.size());
        for (String fuit : fruit){
            System.out.println(fuit);
        }
    }
}
