package HW_Collections.Task3;

import HW_Collections.FileReader;
import HW_Collections.TextModifier;

import java.io.IOException;
import java.util.HashMap;

public class MainTask3 {
    public static void main(String[] args) throws IOException {
        String text = TextModifier.TextModify(FileReader.fileRead());

        HashMap<String, Integer> mapedWords = HashMapWriter.hashMapWrite(text);

        System.out.println(mapedWords);
    }
}
