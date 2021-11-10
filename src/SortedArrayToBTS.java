import helpers.TreeNode;

public class SortedArrayToBTS {

    public static void main(String[] args) {
        System.out.println(new SortedArrayToBTS().sortedArrayToBST(new int[]{-10,-3,0,5,9}));
    }

    /**
     * Technically it is a correct implementation if described by task, but in gist it just builds linkedList.
     */
    public TreeNode sortedArrayToBST2(int[] nums) {
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

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 1) {
            return new TreeNode(nums[0]);
        }
        return buildTree(nums, 0, nums.length - 1);
    }

    private TreeNode buildTree(int[] nums, int l, int r) {
        if (l > r)
            return null;

        int mid = l + (r - l) / 2;

        TreeNode node = new TreeNode(nums[mid]);
        node.right = buildTree(nums, mid + 1, r);
        node.left = buildTree(nums, l, mid - 1);

        return node;
    }

}
