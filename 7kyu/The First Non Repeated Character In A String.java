public class FirstNonRepeated {
    public static Character firstNonRepeated(String source) {
        for (char c : source.toCharArray()){
            if(source.indexOf(c) == source.lastIndexOf(c)) return c;
        }
        return null;
    }
