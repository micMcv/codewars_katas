public class HumanReadableTime {
    public static String makeReadable(int s) {
        return String.format("%02d:%02d:%02d", s/60/60,s/60%60, s%60);
    }
}
