class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int[][] temp = new int[n + m][2];
        int index = 0;

        for (int i = 0; i < n; i++) {
            temp[index][0] = nums1[i][0]; // id
            temp[index][1] = nums1[i][1]; // value
            index++;
        }

        for (int i = 0; i < m; i++) {
            boolean found = false;
            for (int j = 0; j < index; j++) {
                if (temp[j][0] == nums2[i][0]) {
                    temp[j][1] += nums2[i][1];   
                    found = true;
                    break;
                }
            }
            if (!found) {
                temp[index][0] = nums2[i][0];
                temp[index][1] = nums2[i][1];
                index++;
            }
        }

        int[][] result = new int[index][2];
        for (int i = 0; i < index; i++) {
            result[i][0] = temp[i][0];
            result[i][1] = temp[i][1];
        }
        java.util.Arrays.sort(result, (a, b) -> Integer.compare(a[0], b[0]));

        return result;
    }
}
