package HW_Collections.Task1;

import java.io.*;
import java.util.HashSet;
import HW_Collections.FileReader;
import HW_Collections.TextModifier;

public class MainTask1 {
    public static void main(String[] args) throws IOException {
        String text = TextModifier.TextModify(FileReader.fileRead());

        HashSet<String> words = HashSetWriter.hashSetWrite(text);

        for(String w: words){
            System.out.println(w);
        }

        System.out.println("*********");
        System.out.println("Количество различных слов в файле = " + words.size());


    }
}
