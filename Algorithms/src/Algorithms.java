import java.util.Arrays;
import java.util.Random;

public class Algorithms {

    public static void main(String[] args) {
        int[] input = getTestNumbers(20);
        Arrays.stream(AlgorithmType.values())
                .forEach(algorithmType -> benchmark(algorithmType, input));
    }

    private static void benchmark(AlgorithmType algorithmType, int[] input) {
        SortingAlgorithmResult sortingAlgorithmResult = AlgorithmFactory.getAlgorithm(algorithmType).execute(input);
        System.out.println(sortingAlgorithmResult);
    }

    private static int[] getTestNumbers(int size) {
        int[] elements = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            elements[i] = random.nextInt();
        }
        return elements;
    }

}