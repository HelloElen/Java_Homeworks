package HW_Collections.Task2;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetWriter {
    public static TreeSet treeSetWrite (String text){
        Comparator<String> comparator = new WordLengthComparator().thenComparing(new WordComparator());
        TreeSet<String> sortedWords = new TreeSet<>(comparator);

        String[] lines = text.split("\n");

        for (String line: lines){
            String[] lineWords = line.split(" ");
            for (String word: lineWords) {
                sortedWords.add(word);
            }
        }

        return sortedWords;
    }
}
