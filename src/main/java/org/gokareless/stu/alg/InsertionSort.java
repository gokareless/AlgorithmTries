package org.gokareless.stu.alg;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {7, 2, 14, 11, 22, 43, 1, 14, 60, 1, 43, 42, 34, 6, 5, 4};
        sort(array);
        print(array);
    }

    private static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int j = i;
            while (j >= 0 && array[j + 1] < array[j]) {
                swap(array, j, j + 1);
                j--;
            }

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
