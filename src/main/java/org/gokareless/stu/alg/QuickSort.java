package org.gokareless.stu.alg;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = {7, 2, 14, 11, 22, 43, 1, 14, 60, 1, 43, 42, 34, 6, 5, 4};
        sort(array);
        print(array);
    }

    private static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    private static void sort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = array[(left + right) / 2];
        int index = partition(array, left, right, pivot);
        sort(array, left, index - 1);
        sort(array, index, right);
    }

    private static int partition(int[] array, int left, int right, int pivot) {
        while (left <= right) {
            while (array[left] < pivot)
                left++;
            while (array[right] > pivot)
                right--;
            if (left <= right) {
                swap(array, left, right);
                right--;
                left++;
            }

        }
        return left;
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
