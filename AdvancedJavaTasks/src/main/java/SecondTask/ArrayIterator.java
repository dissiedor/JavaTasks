package SecondTask;

import java.util.Iterator;

// Задание (II)
public class ArrayIterator<T> implements Iterator<T> {
    private final T[] array;
    private int index;
    static int k = 0;

    public ArrayIterator(T[] array) {
        this.array = array;
        this.index = 0;
    }

    public boolean hasNext() {
        return index < array.length;
    }

    public T next() {
        if (hasNext()) {
            return array[index++];
        } else {
            throw new java.util.NoSuchElementException();
        }
    }

    public static void main(String[] args) {
        Integer[] integerArray = {1, 2, 3, 4, 5};
        ArrayIterator<Integer> iterator = new ArrayIterator<>(integerArray);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}