import static java.util.Arrays.asList;

public class MaximumSubarray {

    public static void main(String[] args) {
        System.out.println(new MaximumSubarray().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println(new MaximumSubarray().maxSubArray(new int[]{1}));
        System.out.println(new MaximumSubarray().maxSubArray(new int[]{5,4,-1,7,8}));
        System.out.println(new MaximumSubarray().maxSubArray(new int[]{-2, -1}));

        System.out.println(asList(1,2,3).equals( asList(1,2,3)));
    }

    public int maxSubArray(int[] nums) {
        if (nums.length == 0)
            return 0;
        int def = nums[0];
        int max = nums[0];
        int cur = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > def)
                def = nums[i];
            cur += nums[i];
            if (cur < 0) {
                cur = 0;
            } else {
                if (cur > max)
                    max = cur;
            }
        }

        return max > def ? max : def;
    }
}
