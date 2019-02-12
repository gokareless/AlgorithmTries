package org.gokareless.stu.alg;

public class BinarySearch {
    int binarySearch(int array[], int left, int right, int searchElement) {
        if (right >= left) {
            int middle = left + (right - left) / 2;

            if (array[middle] == searchElement)
                return middle;

            if (array[middle] > searchElement)
                return binarySearch(array, left, middle - 1, searchElement);

            return binarySearch(array, middle + 1, right, searchElement);
        }

        return -1;
    }

    // Driver method to test above
    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 40;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}

