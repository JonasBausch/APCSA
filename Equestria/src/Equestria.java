public class Equestria {

    public static void main(String[] args) {
        System.out.println(roadTrip(15));
        System.out.println(roadTrip(22));
        System.out.println(totalTrip(29, 16, 34, 8, 6, 19, 22, 7));
    }

    private static double roadTrip(double diameter) {
        return diameter * Math.PI;
    }

    private static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    private static double totalTrip(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        double totalDistance = 0;
        totalDistance += distance(x1, y1, x2, y2);
        totalDistance += distance(x2, y2, x3, y3);
        totalDistance += distance(x3, y3, x4, y4);
        totalDistance += distance(x4, y4, x1, y1);
        return totalDistance;
    }

}