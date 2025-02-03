package arrays.onedimension.utils;

import java.util.Arrays;

public class Array<T>{

     private Object[] array;
     private final int INITIAL_SIZE = 1;
     private int length = 0;
     private int size = INITIAL_SIZE;

     public Array(){
         this.array = new Object[INITIAL_SIZE];
     }

     public Array(int initialSize){
         this.array = new Object[initialSize];
     }

     public void add(T element){
         if(this.size == this.length){
             expandCapacity();
         }
         this.array[length++] = element;
     }

     //TODO Implement this method
     public void addAt(int index){

     }

    //TODO Implement this method
     public void remove(int index){

     }


    //TODO Implement this method
     private void expandCapacity(){
         this.size = this.size * 2;
         this.array = Arrays.copyOf(this.array, this.size);
     }

    public int getLength() {
        return length;
    }

    public int getSize() {
        return size;
    }

    //TODO Implement this method
    public T[] toArray() {
        return (T[]) array;
    }

    //TODO Implement this method
    public T get(int index){
         return (T) this.array[index];
    }

    //TODO Implement this method
    public boolean contains(T element){
         return false;
    }

    //TODO Implement this method
    public boolean isEmpty(){
         return false;
    }

    //TODO Implement this method
    public void clear(){

    }

    //TODO Implement this method
    public String toString(){
         return null;
    }

}
