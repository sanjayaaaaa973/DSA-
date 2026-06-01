class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans= new ArrayList<>();

        for(int i=0;i<numRows;i++){
            List<Integer> t = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    t.add(1);
                }
                else{
                    List<Integer> p = ans.get(i-1);
                    t.add(p.get(j)+p.get(j-1));
                }
            }
           ans.add(t);
        }
         return ans;

    }
}