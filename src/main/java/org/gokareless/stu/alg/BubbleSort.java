package org.gokareless.stu.alg;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {7, 2, 14, 11, 22, 43, 1, 14, 60, 1, 43, 42, 34, 6, 5, 4};
        sort(array);
        print(array);
    }

    private static void sort(int[] array) {
        int j = 0;
        while (j < array.length - 1) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }
            j++;
        }
    }

    private static void swap(int[] array, int first, int second) {
        int temp = array[second];
        array[second] = array[first];
        array[first] = temp;
    }

    private static void print(int[] array) {
        StringBuilder builder = new StringBuilder("[ ");
        for (int element : array) {
            builder.append(element).append(", ");
        }
        builder.deleteCharAt(builder.length() - 2);
        builder.append("]");
        System.out.println(builder.toString());
    }
}
