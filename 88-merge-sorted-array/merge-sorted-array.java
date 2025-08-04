class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int[] ans=new int[m+n];
       int i=0;int j=0;int k=0;

       for(;i<m && j<n;){
        if(nums1[i]<nums2[j]){
            ans[k++]=nums1[i++];
        }
        else{
            ans[k++]=nums2[j++];
        }
       }

       for(;i<m;i++){
        ans[k++]=nums1[i];
       }
       for(;j<n;j++){
        ans[k++]=nums2[j];
       }

       for(int x=0;x<m+n;x++){
        nums1[x]=ans[x];
       }
    }
}