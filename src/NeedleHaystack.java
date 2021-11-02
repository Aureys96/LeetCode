public class NeedleHaystack {

    public static void main(String[] args) {
        System.out.println(new NeedleHaystack().strStr("hello", "ll")); //2
        System.out.println(new NeedleHaystack().strStr("aaaaa", "bba")); //-1
        System.out.println(new NeedleHaystack().strStr("aaa", "aaaa")); //-1
        System.out.println(new NeedleHaystack().strStr("mississippi", "issip")); //4
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
}
