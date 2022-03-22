package JavaPodstawy.HomeWork.HomeWork_5.podstawy.listy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListyTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Paweł");
        names.add("Kasia");
        names.add("Ola");
        names.add("Paweł");
        System.out.println(names.get(0));
        System.out.println(names.indexOf("Paweł"));
        System.out.println(names.lastIndexOf("Paweł"));
        System.out.println(names.contains("Krysia"));
        System.out.println(names.contains("Paweł"));
        System.out.println(names.size());
        System.out.println(names.isEmpty());
        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println(numbers.get(0));
        System.out.println(numbers.indexOf(2));
        System.out.println(numbers.lastIndexOf(3));
        System.out.println(numbers.contains(2));
        System.out.println(numbers.contains(4));
        System.out.println(numbers.size());
        System.out.println(numbers.isEmpty());
        List<String> diffNames = new ArrayList();
        diffNames.addAll(names);
        for (String name : diffNames){
            System.out.print(name + " -- ");
        }
    }
}
