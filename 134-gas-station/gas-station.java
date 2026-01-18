class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tc=0;
        int tg=0;

        for(int i=0;i<gas.length;i++){
            tc+=gas[i];
            tg+=cost[i];
        }

        if(tc<tg){
            return -1;
        }

        int ci=0,si=0;

        for(int i=0;i<gas.length;i++){
            ci+=gas[i]-cost[i];

            if(ci<0){
                si=i+1;
                ci=0;
            }            

        }
        return si;

    
    }
}