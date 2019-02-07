package HW_Collections.Task5;

import java.util.ArrayList;

public class ArrayListIterator {
    private ArrayList<String> arrayList;
    int index;

    public ArrayListIterator (ArrayList<String> arrayList){
        this.arrayList = arrayList;
        this.index = arrayList.size();
    }

    public boolean hasPrevious(){
        if (index - 1 >= 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public String previous() {
        if (this.hasPrevious()) {
            index -= 1;
            return arrayList.get(index);
        }
        else {
            index = arrayList.size();
            return null;
        }
    }
}
