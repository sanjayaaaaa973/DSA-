class Solution {
    public int maximumUnits(int[][] boxTypes, int trucksize) {

        Arrays.sort(boxTypes,(a,b)-> b[1]-a[1]);
        int tp=0;

        for(int[] boxes:boxTypes){
            int pob=Math.min(boxes[0],trucksize);

        tp+=pob*boxes[1];
        trucksize -= pob;

        if(trucksize==0)
        break;

    
        }
return tp;


        
        
    }
}