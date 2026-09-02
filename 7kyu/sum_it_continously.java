import java.util.*;
class Solution {
  static List<Integer> add(List<Integer> l) {
    int S = 0;
    List<Integer> r = new ArrayList<>();
    for (int i : l) r.add(S+=i);
    return r;
  }
}