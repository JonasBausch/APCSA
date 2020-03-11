public class InsertionSort extends SortingAlgorithm {

    @Override
    public AlgorithmType getAlgorithmType() {
        return AlgorithmType.INSERTION_SORT;
    }

    @Override
    public void sort(int[] elements) {
        insertionSort(elements, elements.length);
    }

    private static void insertionSort(int[] input, int i) {
        if (i <= 1) {
            return;
        }
        insertionSort(input, i - 1);
        int key = input[i - 1];
        int j = i - 2;
        while (j >= 0 && input[j] > key) {
            input[j + 1] = input[j];
            j = j - 1;
        }
        input[j + 1] = key;
    }

}