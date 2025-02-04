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

        System.out.println("Practice 1");
        System.out.println(ingeniverseArray.get(0)); //prints 3
        System.out.println("Practice 2");
        try{
//            System.out.println(ingeniverseArray.get(-1));// Prints invalid index
//            System.out.println(ingeniverseArray.get(5));// Prints invalid index
            System.out.println(ingeniverseArray.get(3));//Prints invalid index
        }catch (Exception exception){
            System.out.println("NOOO mi compa se pasó");
            System.out.println(exception.getMessage());
        }
        System.out.println("Practice 3");
        System.out.println(ingeniverseArray.contains(5)); //true
        System.out.println(ingeniverseArray.contains(10));//false
        System.out.println("Practice 4");
        var ingeniverseArray2 = new Array<String>();
        System.out.println(ingeniverseArray2.isEmpty());//Prints true
        ingeniverseArray2.add("Hello");
        System.out.println(ingeniverseArray2.isEmpty());//Prints false
        System.out.println("Practice 5");
        var ingeniverseArray3 = new Array<String>();
        System.out.println(ingeniverseArray3.isEmpty());// Prints true
        ingeniverseArray3.add("HELLO");
        System.out.println(ingeniverseArray3.isEmpty());// Prints false
        ingeniverseArray3.clear();
        System.out.println(ingeniverseArray3.isEmpty());// Prints true
        System.out.println("Practice 6");
        System.out.println(ingeniverseArray2.toString());
        System.out.println(ingeniverseArray3.toString());

    }
}
