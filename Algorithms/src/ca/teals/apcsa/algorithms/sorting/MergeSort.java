package ca.teals.apcsa.algorithms.sorting;

import ca.teals.apcsa.algorithms.AlgorithmType;

public class MergeSort extends SortingAlgorithm {

    @Override
    public AlgorithmType getAlgorithmType() {
        return AlgorithmType.MERGE_SORT;
    }

    @Override
    public void sort(int[] elements) {
        mergeSort(elements, elements.length);
    }

    private void mergeSort(int[] elements, int size) {
        if (size < 2) {
            return;
        }
        int middle = size / 2;
        int[] leftElements = new int[middle];
        int[] rightElements = new int[size - middle];
        System.arraycopy(elements, 0, leftElements, 0, middle);
        System.arraycopy(elements, middle, rightElements, 0, size - middle);
        mergeSort(leftElements, middle);
        mergeSort(rightElements, size - middle);
        merge(elements, leftElements, rightElements, middle, size - middle);
    }

    private static void merge(int[] elements, int[] leftElements, int[] rightElements, int leftSize, int rightSize) {
        int leftCounter = 0;
        int rightCounter = 0;
        int elementsCounter = 0;
        while (leftCounter < leftSize && rightCounter < rightSize) {
            if (leftElements[leftCounter] <= rightElements[rightCounter]) {
                elements[elementsCounter++] = leftElements[leftCounter++];
            } else {
                elements[elementsCounter++] = rightElements[rightCounter++];
            }
        }
        while (leftCounter < leftSize) {
            elements[elementsCounter++] = leftElements[leftCounter++];
        }
        while (rightCounter < rightSize) {
            elements[elementsCounter++] = rightElements[rightCounter++];
        }
    }

}