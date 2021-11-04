public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[n + m];

        if (n == 0)
            return;
        if (m == 0) {
            for (int k = 0; k < n; k++) {
                nums1[k] = nums2[k];
            }
            return;
        }

        int i = 0;
        int j = 0;

        for (int ii = 0; ii < nums1.length; ii++) {
            if (nums1[i] > nums2[j]) {
                result[ii] = nums2[j];
                j++;
            } else {
                result[ii] = nums1[i];
                i++;
            }
            if (i == m) {
                ii++;
                while (j < n) {
                    result[ii] = nums2[j];
                    j++;
                    ii++;
                }
                break;
            }
            if (j == n) {
                ii++;
                while (i < m) {
                    result[ii] = nums1[i];
                    i++;
                    ii++;
                }
                break;
            }
        }

        for (int k = 0; k < n + m; k++) {
            nums1[k] = result[k];
        }
    }

}
