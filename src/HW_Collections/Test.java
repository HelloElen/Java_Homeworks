package HW_Collections;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        String text = FileReader.fileRead();

        for (int i = 0; i < text.length(); i++){
            System.out.println(text.charAt(i));
        }
    }
}
