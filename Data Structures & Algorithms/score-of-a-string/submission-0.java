class Solution {
    public int scoreOfString(String s) {
        return sol(s,0,0,1);
    }
    public static int sol(String s,int ans,int i,int j){
        if(j==s.length()){
            return ans;
        }
        ans+=Math.abs(s.charAt(j)-s.charAt(i));
        return sol(s,ans,i+1,j+1);
    }
}