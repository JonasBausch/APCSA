import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        //Exercise 1
        int[] array1 = new int[8];
        printArray("array1", array1);

        //Exercise 2a
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        array1[3] = 4;
        array1[4] = 5;
        array1[5] = 6;
        array1[6] = 7;
        array1[7] = 8;
        printArray("array1", array1);

        //Exercise 2b
        int[] array2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        printArray("array2", array2);

        //Exercise 2c
        int[] array3 = new int[5];
        for (int i = 0; i < 5; i++) {
            array3[i] = i;
        }
        printArray("array3", array3);

        //Exercise 2d
        Scanner scanner = new Scanner(System.in);
        System.out.println("Size:");
        int size = scanner.nextInt();
        scanner.nextLine();
        int[] array4 = new int[size];
        int index = 0;
        while (index < size) {
            System.out.println("Element " + index + ":");
            array4[index] = scanner.nextInt();
            scanner.nextLine();
            index++;
        }
        printArray("array4", array4);

        //Exercise 2e
        int[] array5 = new int[]{-4, 19, 3, 20, 72, 58};
        printArray("array5", array5);

        //Exercise 3a
        System.out.println(array4[array4.length - 1]);

        //Exercise 3b
        System.out.println(array4[array4.length / 2]);

        //Exercise 3c
        for (int i = 0; i < array4.length; i++) {
            array4[i] = array4[i] + 1;
        }
        printArray("array4", array4);

        //Exercise 3d
        char[] data = new char[]{3, 0, '-', 2, 5};
        printArray("data", data);

        //Exercise 3e
        int[] even = new int[500];
        int element = 0;
        for (int i = 0; i < even.length; i++) {
            element += 2;
            even[i] = element;
        }
        printArray("even", even);

        //Exercise 3f
        System.out.println(even[100]);

        java.util.Arrays.equals(array1, array2);

        //Exercise 3g
        System.out.println(even[278]);
        System.out.println(even[456]);

        //Exercise 3h/i
        int[] odd = getOddNumbers(-9, 5);
        printArray("odd", odd);

        //2d array
        int[][] grid = new int[10][10];
        int value = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < 10; j++) {
                grid[i][j] = value++;
            }
        }
        printGrid(grid);
        int[][][][][][][][][] complmex = new int[1][1][1][1][1][1][1][1][1];
    }

    private static int[] getOddNumbers(int min, int max) {
        int size = (max % 2 != 0 || min % 2 != 0) ? (max - min) / 2 + 1 : (max - min) / 2;
        int[] array = new int[size];
        int counter = 0;
        for (int i = min; i <= max; i++) {
            if (i % 2 != 0) {
                array[counter] = i;
                counter++;
            }
        }
        return array;
    }

    private static void printArray(String name, char[] array) {
        System.out.print(array + "; name = " + name + "; size = " + array.length + "; elements = [");
        for (int i = 0; i < array.length; i++) {
            char element = array[i];
            if (i == array.length - 1) {
                System.out.print(element + "]");
            } else {
                System.out.print(element + ", ");
            }
        }
        System.out.println();
    }

    private static void printArray(String name, int[] array) {
        System.out.print(array + "; name = " + name + "; size = " + array.length + "; elements = [");
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            if (i == array.length - 1) {
                System.out.print(element + "]");
            } else {
                System.out.print(element + ", ");
            }
        }
        System.out.println();
    }

    private static void printGrid(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
