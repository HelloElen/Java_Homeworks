package HW_Collections.Task4;

import HW_Collections.FileReader;
import HW_Collections.TextModifier;

import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;

public class MainTask4 {
    public static void main(String[] args) throws IOException {
        String text = TextModifier.TextModify(FileReader.fileRead());

        ArrayList<String> lines = ArrayListWriter.arrayListWrite(text);

        ListIterator linesIterator = lines.listIterator(lines.size());

        while (linesIterator.hasPrevious()) {
            System.out.println(linesIterator.previous());
        }
    }
}
