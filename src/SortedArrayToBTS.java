import helpers.TreeNode;

public class SortedArrayToBTS {

    public static void main(String[] args) {
        System.out.println(new SortedArrayToBTS().sortedArrayToBST(new int[]{0,1,2,3,4,5}));
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 1) {
            return new TreeNode(nums[0]);
        }
        int mid_index = (nums.length - 1) / 2;
        int i = 0;
        TreeNode prev = new TreeNode(nums[i++]);
        while (i < mid_index) {
            prev = new TreeNode(nums[i++], prev, null);
        }
        TreeNode root = new TreeNode(nums[i++], prev, null);
        prev = root;
        while (i < nums.length) {
            prev.right = new TreeNode(nums[i++], null, null);
            prev = prev.right;
        }

        return root;
    }
}
