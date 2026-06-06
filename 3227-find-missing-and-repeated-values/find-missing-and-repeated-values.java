class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        
       int rep=-1;
       int miss=-1;

       int n=grid.length;

       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){

            int curr= Math.abs(grid[i][j]);
            int r=(curr-1)/n;
            int c=(curr-1)%n;

            if(grid[r][c]>0){
                grid[r][c]*=-1;
            }

            else{
                rep=curr;
            }
        }
       }

       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(grid[i][j]>0){
                miss=(i*n)+j+1;
            }
        }
       }

       return new int[]{rep,miss};}
}