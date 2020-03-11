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
        int[] left = new int[middle];
        int[] right = new int[size - middle];
        System.arraycopy(elements, 0, left, 0, middle);
        System.arraycopy(elements, middle, right, 0, size - middle);
        mergeSort(left, middle);
        mergeSort(right, size - middle);
        merge(elements, left, right, middle, size - middle);
    }

    private static void merge(int[] elements, int[] left, int[] right, int leftSize, int rightSize) {
        int leftCounter = 0;
        int rightCounter = 0;
        int elementsCounter = 0;
        while (leftCounter < leftSize && rightCounter < rightSize) {
            if (left[leftCounter] <= right[rightCounter]) {
                elements[elementsCounter++] = left[leftCounter++];
            } else {
                elements[elementsCounter++] = right[rightCounter++];
            }
        }
        while (leftCounter < leftSize) {
            elements[elementsCounter++] = left[leftCounter++];
        }
        while (rightCounter < rightSize) {
            elements[elementsCounter++] = right[rightCounter++];
        }
    }

}