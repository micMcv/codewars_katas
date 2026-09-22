public class Kata {
    public static Object[] mean(char[] lst) {
        double mean = 0d;
        StringBuilder sB = new StringBuilder();

        for (char c : lst) {
            if (Character.isDigit(c)) mean += c - '0';
            else sB.append(c);
        }

        return new Object[]{mean / 10, sB.toString()};
    }
}
