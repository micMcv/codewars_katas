public class Kata{
  public static String flyBy(String lamps, String drone){
    int i = drone.indexOf('T'), l = lamps.length();
    if(i >= l) return "o".repeat(l);
    return "o".repeat(i + 1) + "x".repeat(l - i - 1);
  }
}
