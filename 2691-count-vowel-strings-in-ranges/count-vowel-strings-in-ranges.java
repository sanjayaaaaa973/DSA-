class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n =words.length;
        int m=queries.length;
        int[] ans=new int[m];
        int[] prefix=new int[n+1];

        for(int i=0;i<n;i++){
            char a=words[i].charAt(0);
            char b= words[i].charAt(words[i].length()-1);

if( vowel(a) && vowel(b))
{
    prefix[i+1]=1+prefix[i];
}        
else{
    prefix[i+1]=prefix[i];
}

}

for (int i = 0; i < m; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            ans[i] = prefix[r + 1] - prefix[l];
        }

        return ans;
    }
private boolean vowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}



       