package HW_Collections;

// класс для удаления из текста символов 13
public class TextModifier {
    public static String TextModify(String text){
        StringBuilder text0 = new StringBuilder(text);

        for (int i = 0; i < text0.length(); i++) {
            if ((int) text0.charAt(i) == 13){
                text0.deleteCharAt(i);
            }
        }
        return text0.toString();
    }
}
