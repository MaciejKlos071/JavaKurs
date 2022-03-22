package JavaPodstawy.HomeWork.HomeWork_5.podstawy.files;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        FileWriter write = new FileWriter("test.txt");
        write.write("some text");
        write.close();
    }
}
