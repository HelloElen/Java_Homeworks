package HW_Collections;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReader {

    public static String fileRead() throws IOException {
        File file = new File("C:/Users/Lenock/IdeaProjects/Java_Homeworks/src/HW_Collections/File.txt");
        FileInputStream input = new FileInputStream(file);
        int length = input.available();
        byte[] data = new byte[length];
        input.read(data);
        String text = new String(data);

        return text;
    }
}
