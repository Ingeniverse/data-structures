package arrays.onedimension;

import arrays.onedimension.utils.Array;

import java.util.ArrayList;

public class OneDimensionArrayMain {
    public static void main(String[] args) {
//        var array = new ArrayList<Integer>();
//        array.add(2);
//        array.add(3);
//        System.out.println(array.toString());
//        Object object = "3";
//        System.out.println((String) object + "3");

        var ingeniverseArray = new Array<Integer>();
        ingeniverseArray.add(3);
        System.out.println(ingeniverseArray.getSize());
        ingeniverseArray.add(4);
        System.out.println(ingeniverseArray.getSize());
        ingeniverseArray.add(5);
        System.out.println(ingeniverseArray.getSize());

        System.out.println(ingeniverseArray.get(0)); //prints 3

    }
}
