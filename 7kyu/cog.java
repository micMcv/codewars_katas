class Dinglemouse {
    static double cogRpm(final int[] cogs) {
        double rpm = -1 d;
        int prevCog = cogs[0];
        for (int currCog: cogs) {
            rpm *= prevCog * -1 d / currCog;
            prevCog = currCog;
        }
        return rpm;
    }
}