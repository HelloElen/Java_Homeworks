package HW_Collections.Task1;

import java.util.HashSet;

public class HashSetWriter {
    public static HashSet hashSetWrite (String text) {
        HashSet<String> words = new HashSet<>();

        String[] lines = text.split("\n");

        for (String line: lines){
            String[] lineWords = line.split(" ");
            for (String word: lineWords) {
                words.add(word);
            }
        }

        return words;
    }
}
