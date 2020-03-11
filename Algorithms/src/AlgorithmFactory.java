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
            default:
                throw new IllegalArgumentException("AlgorithmType " + " not supported!");
        }
    }

}