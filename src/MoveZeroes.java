public class MoveZeroes {

    public static void main(String[] args) {
        final int[] nums = {0, 1, 0, 3, 12};

        new MoveZeroes().moveZeroes(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public void moveZeroes(int[] nums) {

        int nonNull = nums.length - 1;
        for (int k = nums.length - 1; k >= 0; k--) {
            if (nums[k] != 0) {
                nonNull = k;
                break;
            }
        }

        for (int i = 0; i < nonNull + 1; i++) {
            if (nums[i] == 0) {
                for (int j = i + 1; j < nonNull + 1; j++) {
                    swap(nums, j, j - 1);
                    nonNull--;
                }
                i--;
            }
        }

    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
