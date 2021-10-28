public class SortColorsInPlace {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 0, 1};
        sortColors(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    public static void sortColors(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }

    private static void quickSort(int[] nums, int l, int r) {
        if (l < r) {
            int p = partition(nums, l, r);
            quickSort(nums, l, p);
            quickSort(nums, p + 1, r);
        }
    }

    private static int partition(int[] nums, int l, int r) {
        int pivot = (nums[r] + nums[l]) / 2;

        while (true) {
            while (nums[l] < pivot) {
                l++;
            }
            while (nums[r] > pivot) {
                r--;
            }
            if (l >= r) {
                return r;
            }
            swap(r--, l++, nums);
        }

    }

    private static void swap(int r, int l, int[] nums) {
        int temp = nums[r];
        nums[r] = nums[l];
        nums[l] = temp;
    }
}
