public class NeedleHaystack {

    public static void main(String[] args) {
        //System.out.println(new NeedleHaystack().strStrKMP("hello", "ll")); //2
        //System.out.println(new NeedleHaystack().strStr("aaaaa", "bba")); //-1
        //System.out.println(new NeedleHaystack().strStr("aaa", "aaaa")); //-1
        //System.out.println(new NeedleHaystack().strStrKMP("mississippi", "issip")); //4
        System.out.println(new NeedleHaystack().strStrKMP("abcadcabcabdabcabc", "abcabc")); //4
    }

    public int strStr(String haystack, String needle) {
        if (haystack.length() == 0 && needle.length() == 0)
            return 0;
        if (needle.length() == 0)
            return 0;
        char[] needleChar = needle.toCharArray();
        char[] haystackChar = haystack.toCharArray();

        for (int i = 0; i < haystack.length(); i++) {
            int check = check(haystackChar, needleChar, i);

            if (check != -1) {
                return check;
            }
        }

        return -1;
    }

    private int check(char[] haystackChar, char[] needleChar, int p) {
        int j = 0;
        int i = p;

        while (i < haystackChar.length && j < needleChar.length) {
            if (haystackChar[i] != needleChar[j])
                return -1;
            j++;
            i++;
        }

        return j != needleChar.length ? -1 : p;
    }

    public int strStrKMP(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        if (needle.length() > haystack.length()) return -1;
        char[] ndl = needle.toCharArray();
        char[] hay = haystack.toCharArray();
        int[] pai = new int[ndl.length];
        pai[0] = -1;
        for (int i = 1, k = -1; i < ndl.length; i++) {
            while (k > -1 && ndl[k + 1] != ndl[i]) k = pai[k];
            pai[i] = ndl[k + 1] == ndl[i] ? ++k : k;
        }
        for (int i = 0, k = -1; i < hay.length; i++) {
            while (k > -1 && ndl[k + 1] != hay[i]) k = pai[k];
            if (ndl[k + 1] == hay[i] && ++k == ndl.length - 1) return i - k;
        }
        return -1;
    }
}
