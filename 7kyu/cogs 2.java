class Dinglemouse {
  static double[] cogRpm(final int[] cogs, final int n) {
    int lRight = cogs.length - n, lLeft = n;
    return new double[] {
        (lLeft % 2 == 0 ? 1d : -1d) * cogs[n] / cogs[0],
        (lRight % 2 != 0 ? 1d : - 1d) * cogs[n] / cogs[cogs.length - 1]
    };
  }
}