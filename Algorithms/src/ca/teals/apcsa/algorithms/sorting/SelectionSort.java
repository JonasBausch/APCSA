package ca.teals.apcsa.algorithms.sorting;

import ca.teals.apcsa.algorithms.AlgorithmType;

public class SelectionSort extends SortingAlgorithm {

    @Override
    public AlgorithmType getAlgorithmType() {
        return AlgorithmType.SELECTION_SORT;
    }

    @Override
    public void sort(int[] elements) {
        selectionSort(elements);
    }

    public static void selectionSort(final int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minElementIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minElementIndex] > arr[j]) {
                    minElementIndex = j;
                }
            }
            if (minElementIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minElementIndex];
                arr[minElementIndex] = temp;
            }
        }
    }

}