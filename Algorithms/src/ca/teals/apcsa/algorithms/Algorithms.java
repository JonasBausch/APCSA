package ca.teals.apcsa.algorithms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Algorithms {

    public static void main(String[] args) {
        solution(2, "1A 2F 1C");

    }

    public static int solution(int N, String S) {
        String[] occupiedSeats = S.split(" ");
        int[] columns = new int[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K'};
        boolean[][] seats = new boolean[N][columns.length];
        for (String occupiedSeat : occupiedSeats) {
            for (int i = 0; i < N; i++) {
                for (int j : columns) {
                    if (Integer.parseInt(String.valueOf(occupiedSeat.charAt(0))) == i && occupiedSeat.charAt(0) == j) {
                        seats[i][j] = true;
                    }
                }
            }
        }
        int familyCounter = 0;
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (!seats[i][j]) {

                }
            }
        }
        return familyCounter;
    }


    private static void benchmark(int size) {
        int[] input = new int[]{0, 1, 2, 4, 5};
        int[] input2 = new int[]{1, 3, 6, 4, 1, 2};
        int[] input3 = new int[]{1, 2, 3};
        int[] input4 = new int[]{-1, -3};
        System.out.println(foo(input));
        System.out.println(foo(input2));
        System.out.println(foo(input3));
        System.out.println(foo(input4));
        //        System.out.println("Benchmark Test Sorting Algorithms with " + size + " elements...");
        //        int[] input = getTestNumbers(size);
        //        Arrays.stream(AlgorithmType.values())
        //                .map(algorithmType -> AlgorithmFactory.getAlgorithm(algorithmType).execute(input))
        //                .sorted(Comparator.comparing(SortingAlgorithmResult::getDuration))
        //                .forEach(System.out::println);
    }

    private static int[] getTestNumbers(int size) {
        int[] elements = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            elements[i] = random.nextInt();
        }
        return elements;
    }


    private static int foo2(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (i != A[i] && i > 0) {
                return i;
            }
        }
        return A.length;
    }

    private static int foo(int[] A) {
        int N = A.length;
        Set<Integer> set = new HashSet<>();
        for (int a : A) {
            if (a > 0) {
                set.add(a);
            }
        }
        for (int i = 1; i <= N + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return N;
    }

}