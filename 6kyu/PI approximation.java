public class PiApprox {

    public static boolean isPI(double pi, double epsilon){
        return Math.abs(Math.PI - pi) < epsilon;
    }

	public static String iterPi2String(Double epsilon) {
    double pi = 1, cnt = 2;
    boolean isMinus = true;

    for(double i = 3; i < Double.MAX_VALUE; i += 2, isMinus = !isMinus, cnt++){
        if (isPI(4 * (pi += isMinus ? -1/i : 1/i), epsilon)) return String.format("[%.0f, %.10f]", cnt, 4 * pi);
    }

    return String.format("HELLO CODEWARS", cnt, 4 * pi);
	}
}
