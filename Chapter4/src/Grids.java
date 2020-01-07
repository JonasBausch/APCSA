public class Grids {

    public static void main(String[] args) {

    }

    private static double[] exercise1() {
        return new double[1028];
    }

    private static int[][] exercise2() {
        return new int[5][4];
    }

    private static String[][] exercise3() {
        return new String[6][5];
    }

    private static String[][] exercise5() {
        String[][] studentSeating = exercise3();
        studentSeating[0][1] = "Amber";
        // etc...
        return studentSeating;
    }

    private static void exercise6() {
        String[][] studentSeating = exercise5();
        System.out.println(studentSeating[1][4]);
    }

    private static void exercise7() {
        String[][] studentSeating = exercise5();
        String me = studentSeating[2][0];
        studentSeating[2][0] = "other student";
        studentSeating[4][2] = me;
    }

    private static double[][] exercise8() {
        return new double[10][2];
    }


}
