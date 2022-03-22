package JavaPodstawy.HomeWork.HomeWork_5.podstawy.files;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("test.txt");

        if(file.delete()){
            System.out.println("plik usuniety");
        } else {
            System.out.println("nie udało sie usunac pliku");
        }
    }
}
