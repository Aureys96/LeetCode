public class isPalindrome {

    public static void main(String[] args) {
        System.out.println(new isPalindrome().isPalindrome("A man, a plan, a canal: Panama"));
    }

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("\\W|_", "");
        int i = 0;
        int j = s.length() - 1;
        char[] arr = s.toCharArray();

        while (i < j) {
            if (arr[i] != arr[j])
                return false;
            i++;
            j--;
        }
        return true;
    }
}
