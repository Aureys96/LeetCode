import java.util.HashSet;
import java.util.Set;

public class findNonDuplicate {

    public static void main(String[] args) {
        System.out.println(find(new int[]{1, 1, 5, 5, 6, 7, 6, 7, 3, 8, 8,3, 255, 235, 255}));
    }

    private static int find(int[] ints) {
        Set<Integer> set = new HashSet<>();
        int answer = 0;
        for (int i = 0; i < ints.length; i++) {
            final int cur = ints[i];
            if (set.contains(cur))
                answer-= cur;
            else {
                answer+=cur;
            }
            set.add(cur);
        }

        return answer;
    }
}
