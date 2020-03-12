package ca.teals.apcsa.algorithms.sorting;

import ca.teals.apcsa.algorithms.AlgorithmType;

public class BubbleSort extends SortingAlgorithm {

    @Override
    public AlgorithmType getAlgorithmType() {
        return AlgorithmType.BUBBLE_SORT;
    }

    @Override
    public void sort(int[] elements) {
        bubbleSort(elements, true);
    }

    private static void bubbleSort(int[] elements, boolean isAscending) {
        int length = elements.length;
        int temp;
        boolean isSorted;
        for (int i = 0; i < length; i++) {
            isSorted = true;
            for (int j = 1; j < (length - i); j++) {
                if (isAscending) {
                    if (elements[j - 1] > elements[j]) {
                        temp = elements[j - 1];
                        elements[j - 1] = elements[j];
                        elements[j] = temp;
                        isSorted = false;
                    }
                } else {
                    if (elements[j - 1] < elements[j]) {
                        temp = elements[j - 1];
                        elements[j - 1] = elements[j];
                        elements[j] = temp;
                        isSorted = false;
                    }
                }
            }
            if (isSorted) {
                break;
            }
        }
    }

}