package ca.teals.apcsa.algorithms;

import ca.teals.apcsa.algorithms.sorting.*;

public class AlgorithmFactory {

    public static Algorithm getAlgorithm(AlgorithmType algorithmType) {
        switch (algorithmType) {
            case MERGE_SORT:
                return new MergeSort();
            case BUBBLE_SORT:
                return new BubbleSort();
            case INSERTION_SORT:
                return new InsertionSort();
            case SELECTION_SORT:
                return new SelectionSort();
            case QUICK_SORT:
                return new QuickSort();
            default:
                throw new IllegalArgumentException("AlgorithmType " + " not supported!");
        }
    }

}