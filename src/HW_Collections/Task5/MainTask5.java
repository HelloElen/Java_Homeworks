package HW_Collections.Task5;

import HW_Collections.FileReader;
import HW_Collections.Task4.ArrayListWriter;
import HW_Collections.TextModifier;

import java.io.IOException;
import java.util.ArrayList;

public class MainTask5 {
    public static void main(String[] args) throws IOException {
        String text = TextModifier.TextModify(FileReader.fileRead());

        ArrayList<String> lines = ArrayListWriter.arrayListWrite(text);

        ArrayListIterator linesIterator = new ArrayListIterator(lines);

        while (linesIterator.hasPrevious()) {
            System.out.println(linesIterator.previous());
        }
    }
}
