import java.util.regex.*;

public class SearchEngine {
  static int find(String needle, String haystack) {
      StringBuilder re = new StringBuilder();
      for (char c : needle.toCharArray()) {
          re.append(c == '_' ? . : Pattern.quote(String.valueOf(c)));
      }

      Pattern pattern = Pattern.compile(re.toString());
      Matcher matcher = pattern.matcher(haystack);
      return matcher.find() ? matcher.start() : -1;
  }
}
