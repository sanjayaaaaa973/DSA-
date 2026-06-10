class Solution {
    public double myPow(double x, int n) {

        double p=Math.abs((long)n);
        double res=1;
        
        while(p>0){
            if(p%2==0){
                x=x*x;
                p=p/2;
            }

            else{
                res=res*x;
                p=p-1;
            }
        }

        if(n<0){
            return 1.0/res;
        }

        return res;

        

    }
}