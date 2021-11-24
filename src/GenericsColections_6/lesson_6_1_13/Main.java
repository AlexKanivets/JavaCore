package GenericsColections_6.lesson_6_1_13;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DynamicArray<String> array = new DynamicArray<>();
        array.add("a");
        array.add("b");
        array.add("c");
        array.add("d");
        array.add("e");

        array.remove(2);
        array.remove(0);
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }

    public static class DynamicArray<T> {
        private int size = 0;
        private T[] arr = (T[]) new Object[50];

        public DynamicArray() {
        }

        public void add(T el) {
            if (size == arr.length) {
                arr = Arrays.copyOf(arr, arr.length * 2);
            }
            arr[size] = el;
            size++;
        }

        public void remove(int index) {
            System.arraycopy(arr, index + 1, arr, index, arr.length - 1 - index);
            size--;
        }

        public T get(int index) {
            return (T) arr[index];
        }

        public int size() {
            return size;
        }
    }
}

