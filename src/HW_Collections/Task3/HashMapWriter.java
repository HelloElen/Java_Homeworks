package HW_Collections.Task3;

import java.util.HashMap;

public class HashMapWriter {
    public static HashMap<String, Integer> hashMapWrite (String text) {
        HashMap<String, Integer> mapedWords = new HashMap<>();

        String[] lines = text.split("\n");

        for (String line: lines){
            String[] lineWords = line.split(" ");
            for (String word: lineWords) {
                if (mapedWords.containsKey(word)) {
                    mapedWords.put(word, mapedWords.get(word) + 1);
                }
                else {
                    mapedWords.put(word, 1);
                }
            }
        }

        return mapedWords;
    }
}
