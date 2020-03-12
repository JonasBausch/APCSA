package ca.teals.apcsa.algorithms.sorting;

import ca.teals.apcsa.algorithms.AlgorithmType;

public class QuickSort extends SortingAlgorithm {

    @Override
    public AlgorithmType getAlgorithmType() {
        return AlgorithmType.QUICK_SORT;
    }

    @Override
    public void sort(int[] elements) {
        quickSort(elements, 0, elements.length - 1);
    }

    private void quickSort(int[] elements, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(elements, begin, end);
            quickSort(elements, begin, partitionIndex - 1);
            quickSort(elements, partitionIndex + 1, end);
        }
    }

    private int partition(int[] elements, int begin, int end) {
        int pivot = elements[end];
        int i = (begin - 1);
        for (int j = begin; j < end; j++) {
            if (elements[j] <= pivot) {
                i++;
                int swapTemp = elements[i];
                elements[i] = elements[j];
                elements[j] = swapTemp;
            }
        }
        int swapTemp = elements[i + 1];
        elements[i + 1] = elements[end];
        elements[end] = swapTemp;
        return i + 1;
    }

}