package arrays.onedimension;

import java.util.ArrayList;

public class OneDimensionArrayMain {
    public static void main(String[] args) {
        var array = new ArrayList<Integer>();
        array.add(2);
        array.add(3);
        System.out.println(array.toString());
        Object object = "3";
        System.out.println((String) object + "3");
    }
}
