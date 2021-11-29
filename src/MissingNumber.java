public class MissingNumber {

    public static void main(String[] args) {
        System.out.println(new MissingNumber().missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }

    public int missingNumber(int[] nums) {
        int res = nums.length;
        for(int i=0; i<nums.length; i++){
            res = res ^ i ^ nums[i]; // a^b^b = a
        }
        return res;
    }
}
