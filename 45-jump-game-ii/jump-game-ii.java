class Solution {
    public int jump(int[] nums) {
        int last = nums.length - 1;
        int jumps = 0;

        while (last > 0) {
            for (int i = 0; i < last; i++) {
                if (i + nums[i] >= last) {
                    last = i;
                    jumps++;
                    break;
                }
            }
        }
        return jumps;
    }
}
