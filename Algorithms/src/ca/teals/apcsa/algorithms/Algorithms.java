package ca.teals.apcsa.algorithms;

import ca.teals.apcsa.algorithms.sorting.SortingAlgorithmResult;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Algorithms {

    public static void main(String[] args) {
        benchmark(20);
        benchmark(1000);
        benchmark(10000);
    }

    private static void benchmark(int size) {
        System.out.println("Benchmark Test Sorting Algorithms with " + size + " elements...");
        int[] input = getTestNumbers(size);
        Arrays.stream(AlgorithmType.values())
                .map(algorithmType -> AlgorithmFactory.getAlgorithm(algorithmType).execute(input))
                .sorted(Comparator.comparing(SortingAlgorithmResult::getDuration))
                .forEach(System.out::println);
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