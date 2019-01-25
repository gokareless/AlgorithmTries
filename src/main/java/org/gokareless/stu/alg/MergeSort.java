package org.gokareless.stu.alg;

public class MergeSort {

    public static void main(String[] args) {
        int[] array = {7, 2, 14, 11, 22, 43, 1, 14, 60, 1, 43, 42, 34, 6, 5, 4};
        sort(array);
        print(array);
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

    private static void sort(int[] array) {
        sort(0, array.length - 1, array);
    }

    private static void sort(int left, int right, int[] array) {
        if (left >= right) {
            // stop here
            return;
        }
        int middle = (left + right) / 2;
        // sorting begins with 2 elements(1 per each array) by merging it
        sort(left, middle, array);
        sort(middle + 1, right, array);
        // merge sorted array(or just two elements)
        merge(left, right, array);
    }

    private static void merge(int leftStart, int rightEnd, int[] array) {
        // left will end on the middle or almost on the middle of the array
        int leftEnd = (leftStart + rightEnd) / 2;
        // right starts just after left
        int rightStart = leftEnd + 1;

        // create halves of size which is required for this invocation
        int[] larr = new int[leftEnd - leftStart + 1];
        int[] rarr = new int[rightEnd - rightStart + 1];

        // initialize halves using array
        System.arraycopy(array, leftStart, larr, 0, larr.length);
        System.arraycopy(array, rightStart, rarr, 0, rarr.length);

        // index is the current array index which is always the start of left half
        int left = 0, right = 0, index = leftStart;
        while (left < larr.length && right < rarr.length)
            // choose bigger element (in case of many elements sub-arrays are already sorted)
            if (larr[left] <= rarr[right])
                array[index++] = larr[left++];
            else
                array[index++] = rarr[right++];
        // copy remaining elements of sub-arrays (if present) to array
        System.arraycopy(larr, left, array, index,larr.length - left);
        System.arraycopy(rarr, right, array, index, rarr.length - right);
    }
}
