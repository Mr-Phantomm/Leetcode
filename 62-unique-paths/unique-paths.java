class Solution {

    public int dp(int m,int n,Integer[][] dp){
        if(m<0||n<0)return 0;
        if(m==1&&n==1)return 1;
        if(dp[m][n]!=null)return dp[m][n];
        int goingUp = dp(m-1,n,dp);
        int goingleft = dp(m,n-1,dp);
        return dp[m][n]=goingUp+goingleft;

    }

    public int uniquePaths(int m, int n) {
        return dp(m,n,new Integer[m+1][n+1]);
    }
}