import java.util.Arrays;
import java.util.List;

class EquestriaAdvanced {

    public static void main(String[] args) {
        System.out.println(roadTrip(15));
        System.out.println(roadTrip(22));
        System.out.println(distance(Destination.BALTIMARE, Destination.MANEHATTAN));
        System.out.println(totalTrip(Arrays.asList(Destination.values())));
        System.out.println(totalTrip(Arrays.asList(Destination.BALTIMARE, Destination.MANEHATTAN, Destination.LOS_PEGASUS, Destination.NEIGHAGRA_FALLS)));
        System.out.println(totalTrip(Destination.BALTIMARE, Destination.MANEHATTAN, Destination.LOS_PEGASUS, Destination.NEIGHAGRA_FALLS));
    }

    private static double roadTrip(double diameter) {
        return diameter * Math.PI;
    }

    private static double distance(Destination start, Destination end) {
        return distance(start.x, start.y, end.x, end.y);
    }

    private static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    private static double totalTrip(List<Destination> destinations) {
        double totalDistance = 0;
        for (int i = 0; i < destinations.size(); i++) {
            if (i < destinations.size() - 1) {
                totalDistance += distance(destinations.get(i), destinations.get(i + 1));
            } else {
                //Now add the distance from the last destination back to the start point
                totalDistance += distance(destinations.get(i), destinations.get(0));
            }
        }
        return totalDistance;
    }

    private static double totalTrip(Destination... destinations) {
        return totalTrip(Arrays.asList(destinations));
    }

    private enum Destination {
        BALTIMARE(29, 16),
        MANEHATTAN(34, 8),
        LOS_PEGASUS(6, 19),
        NEIGHAGRA_FALLS(22, 7),
        BADLANDS(25, 24),
        PONYVILLE(16, 14);

        private int x;
        private int y;

        Destination(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }

}