package JavaPodstawy.HomeWork.HomeWork_10;

import java.util.HashMap;
import java.util.Map;

public class ZliczanieWystapien {
// int[] numbers = new int[] {1,2,3,2,5,3}
    public static void main(String[] args) {
        int[] numbers = new int[] {1,2,3,2,5,3};
        liczWystąpienia(numbers);
        System.out.println("...");
        countOccuriences(numbers);
    }

    public static void liczWystąpienia(int[] tablica){
        Map<Integer, Integer> occurences = new HashMap<>();
        for (int i : tablica){
            int occur = 0;
            if(occurences.containsKey(i)) continue;
            for (int j = occurences.size(); j < tablica.length ; j++) {
                if (i == tablica[j]) {
                    occur++;
                }
            }
            occurences.put(i, occur);
        }
        for (Integer key: occurences.keySet()){
            System.out.println(key +" = "+occurences.get(key));
        }
    }
    public static void countOccuriences(int[] tab){
        Map<Integer, Integer> occurences = new HashMap<>();
        for (int i = 0; i < tab.length ; i++) {
            if(occurences.containsKey(tab[i])){
                Integer value = occurences.get(tab[i]);
                occurences.put(tab[i], value+1);
            }else {
                occurences.put(tab[i], 1);
            }
        }
        for (Integer key: occurences.keySet()){
            System.out.println(key +" = "+occurences.get(key));
        }

    }
}
