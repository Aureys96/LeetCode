public class PlusOne {
    public int[] plusOne(int[] digits) {
        int cur = digits[digits.length - 1] + 1;
        int i = digits.length - 1;
        if (cur / 10 == 1) {
            while (cur / 10 == 1) {
                digits[i] = 0;
                i--;
                if (i < 0) {
                    int[] answer = new int[digits.length + 1];
                    for (int j = 0; j < answer.length; j++) {
                        if (j == 0)
                            answer[j] = 1;
                        else
                            answer[j] = 0;
                    }
                    return answer;
                }
                cur = digits[i] + 1;
            }
            digits[i] = cur;
        } else {
            digits[digits.length - 1] = cur;
        }
        return digits;
    }
}
