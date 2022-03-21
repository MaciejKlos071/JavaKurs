package com.company.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        FileWriter write = new FileWriter("test.txt");
        write.write("some text");
        write.close();
    }
}
