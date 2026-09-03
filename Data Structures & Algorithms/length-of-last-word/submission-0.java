class Solution {
    public int lengthOfLastWord(String s) {
        return sol(s,0);
    }
    public static int sol(String s,int ans){
        for(int j=s.length()-1;j>=0;j--){
            
            if(s.charAt(j)==' '){
                if(ans>0){
                    return ans;
                }
            }
            else{
                ans+=1;
            }
        }
        return ans;
    }
}