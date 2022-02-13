public class Square {

    public static boolean isSquare(int n) {
        if (n < 0) {
            return false;
        }
        for (int i = 0; i <= n / 2; i++) {
            if (Math.sqrt(i) == n) {
                return true;
            }
        }
        return false;
    }
}