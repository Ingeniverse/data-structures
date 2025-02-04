package arrays.onedimension.utils;

import java.util.Arrays;

public class Array<T> {

    private Object[] array;
    private final int INITIAL_SIZE = 1;
    private int length = 0;
    private int size = INITIAL_SIZE;

    public Array() {
        this.array = new Object[INITIAL_SIZE];
    }

    public Array(int initialSize) {
        this.array = new Object[initialSize];
    }

    public void add(T element) {
        if (this.size == this.length) {
            expandCapacity();
        }
        this.array[length++] = element;
    }

    //TODO Implement this method
    public void addAt(int index) {

    }

    //TODO Implement this method
    public void remove(int index) {

    }

    private void expandCapacity() {
        this.size = this.size * 2;
        this.array = Arrays.copyOf(this.array, this.size);
    }

    public int getLength() {
        return length;
    }

    public int getSize() {
        return size;
    }

    public T[] toArray() {
        return (T[]) array;
    }

    public T get(int index) {
        if (index < 0 || index > length || array[index] == null) {
            throw new ArrayIndexOutOfBoundsException("Invalid index");
        }
        return (T) this.array[index];
    }

    public boolean contains(T element) {
        //Ciclo for
        for (int i = 0; i < this.length; i++) {
            if (this.array[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public void clear() {
        this.array = new Object[this.INITIAL_SIZE];
        this.length = 0;
        this.size = this.INITIAL_SIZE;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.isEmpty()) {
            sb.append("Empty");
        } else {
            sb.append("[");
            for (Object element : this.array) {
                sb.append(element.toString());
                sb.append(" ");
            }
            sb.append("]");
        }
        return sb.toString();
    }

}
