
public class LongestCommonPrefix {

    public static void main(String[] args) {
        final String lcp = longestCommonPrefix(new String[]{"flower","flower","flower","flower"});
        System.out.println(lcp.length() == 0 ? "\"\"" : lcp);
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        StringBuilder sb = new StringBuilder();
        int minLength = 201;
        int i = 0;
        for (int j = 0; j < minLength; j++) {
            if (strs[0].length() == 0)
                return "";
            char ch = strs[0].charAt(i);
            for (String s : strs) {
                if (s.length() == 0)
                    return "";
                if (i == 0) {
                    if (s.length() < minLength)
                        minLength = s.length();
                }
                if (s.charAt(i) != ch) {
                    return sb.toString();
                }
            }
            sb.append(ch);
            i++;
            if (minLength == i) {
                return sb.toString();
            }
        }
        return sb.toString();
    }
}
