package HW_Collections.Task4;

import java.util.ArrayList;

public class ArrayListWriter {
    public static ArrayList arrayListWrite(String text){
        ArrayList<String> linesList = new ArrayList<>();

        String [] lines = text.split("\n");

        for (String line: lines){
            linesList.add(line);
        }

        return linesList;
    }
}
