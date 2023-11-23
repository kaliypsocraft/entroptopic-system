package MathHelpers.StringUtils;

public class StringHelper {
    public static String removePunctuationAndSpaces(String input) {
        return input.replace(" ", "").replaceAll("\\p{Punct}", "");
    }
}
