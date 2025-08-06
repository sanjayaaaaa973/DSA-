class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int i=0;int e=0;
        int o=1;        
        for(i=0;i<n;i++){
            if(nums[i]%2==0){
                ans[e]=nums[i];
                e+=2;
            }
        }
        for(i=0;i<n;i++){
        if(nums[i]%2!=0)
{
    ans[o]=nums[i];
    o+=2;
}        }

return ans;
    }
}