import java.util.Arrays;

public abstract class SortingAlgorithm implements Algorithm {

    public abstract AlgorithmType getAlgorithmType();

    public abstract void sort(int[] elements);

    @Override
    public SortingAlgorithmResult execute(Object object) {
        if (object instanceof int[]) {
            int[] input = (int[]) object;
            int[] output = Arrays.copyOf(input, input.length);
            long startTime = System.nanoTime();
            sort(output);
            long duration = System.nanoTime() - startTime;
            return new SortingAlgorithmResult(getAlgorithmType(), duration, input, output);
        } else {
            throw new IllegalArgumentException("Provided object must be of type int[] but was " + object.getClass());
        }
    }

}