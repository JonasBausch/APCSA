package ca.teals.apcsa.algorithms;

public class BenfordsLaw {

    public static void main(String[] args) {
        int[] numbers = new int[9999999];
        for (int i = 0; i < 9999999; i++) {
            numbers[i] = (int) (10.0 * Math.random());
        }

        benford(numbers);
    }

    public static int firstDigit(int n) {
        while (n < -9 || 9 < n) {
            n /= 10;
        }
        return Math.abs(n);
    }

    public static void benford(int[] numbers) {
        int[] count = new int[10];
        int n = 0;

        for (int number : numbers) {
            int digit = firstDigit(number);
            count[digit]++;
            n++;
        }
        for (int i = 1; i < 10; i++) {
            System.out.println(String.format("%d: %6.1f%%\n", i, 100.0 * count[i] / n));
        }
    }

}
