public class RemoveDuplicatedInPlace {

    public static void main(String[] args) {
        //int[] nums = new int[]{1,1,2};
        //int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        int[] nums = new int[]{1,2,6,6,3,4,5,6,6,6,6,6};
        System.out.println(new RemoveDuplicatedInPlace().removeDuplicates(nums));
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    public int removeDuplicates(int[] nums) {
        int lastChangedIndex = nums.length;
        for (int i = 0; i < lastChangedIndex; i++) {
            int cur = nums[i];
            int j = lastChangedIndex - 1;
            while (i != j) {
                if (cur == nums[j]) {
                    int temp = nums[j];
                    for (int jj = j + 1; jj < lastChangedIndex; jj++) {
                        nums[jj - 1] = nums[jj];
                    }
                    lastChangedIndex--;
                    nums[lastChangedIndex] = temp;
                }
                j--;
            }
        }
        return lastChangedIndex;
    }
}
