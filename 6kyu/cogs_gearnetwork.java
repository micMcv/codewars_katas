import java.util.ArrayList;
import java.util.HashMap;

public class Cogsebi {

    public static void rec(HashMap<Integer, ArrayList<Integer>> hm, int gear, double rpm, double[] res, int[] gears, boolean[] visited) {

        visited[gear] = true;
        if (hm.containsKey(gear)) {
            for (int g : hm.get(gear)) {
                if (!visited[g]) {
                    double calcRPM = -rpm * gears[gear] / gears[g];
                    res[g] = calcRPM;
                    rec(hm, g, calcRPM, res, gears, visited);
                }
            }
        }

    }

    public static double[] calculateRpms(int[] gears, int[][] connections, int driverId, double driverRpm) {
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        boolean[] visited = new boolean[gears.length];
        double[] res = new double[gears.length];

        res[driverId] = driverRpm;

        for (int[] conn : connections) {
            hm.putIfAbsent(conn[0], new ArrayList<>());
            hm.putIfAbsent(conn[1], new ArrayList<>());
            hm.get(conn[0]).add(conn[1]);
            hm.get(conn[1]).add(conn[0]);

        }

        rec(hm, driverId, driverRpm, res, gears, visited);

        return res;
    }
}
