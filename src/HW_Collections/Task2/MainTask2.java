package HW_Collections.Task2;

import HW_Collections.FileReader;
import HW_Collections.TextModifier;

import java.io.IOException;
import java.util.TreeSet;

public class MainTask2 {
    public static void main(String[] args) throws IOException {
        String text = TextModifier.TextModify(FileReader.fileRead());

        TreeSet<String> sortedWords = TreeSetWriter.treeSetWrite(text);

        for(String w: sortedWords){
            System.out.println(w);
        }
    }
}
