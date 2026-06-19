class Solution {
    public int longestConsecutive(int[] nums) {

        int llength=0;

        HashMap<Integer,Boolean> emap =new HashMap<>();

        for(int num:nums){
            emap.put(num,false);
        }

        for(int num:nums){


        int clength=1;
        int nextnum=num+1;

        while(emap.containsKey(nextnum) && emap.get(nextnum)==false){
            clength++;
            emap.put(nextnum,true);
            nextnum++;
        }

        
        int prevnum=num-1;
        while(emap.containsKey(prevnum) && emap.get(prevnum)==false){
            clength++;
            emap.put(prevnum,true);
            prevnum--;
        }

         llength=Math.max(llength,clength);


        }

        return llength;
       

        
    }
}