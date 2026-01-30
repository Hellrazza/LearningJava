import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        SelectionSort.sort(numbers);
    }

    public static int smallest(int[] array) {
        int currentSmallest = array[0];
        for (int num : array) {
            if (num < currentSmallest) {
                currentSmallest = num;
            }
        }
        return currentSmallest;
    }

    public static int indexOfSmallest(int[] array) {
        int currentSmallest = array[0];
        int currentSmallestIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < currentSmallest) {
                currentSmallest = array[i];
                currentSmallestIndex = i;
            }
        }
        return currentSmallestIndex;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int currentSmallest = table[startIndex];
        int currentSmallestIndex = startIndex;
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < currentSmallest) {
                currentSmallest = table[i];
                currentSmallestIndex = i;
            }
        }
        return currentSmallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        int n = 0;
        while (n < array.length) {
            swap(array, indexOfSmallestFrom(array, n), n);
            System.out.println(Arrays.toString(array));
            n++;
        }

    }
}

