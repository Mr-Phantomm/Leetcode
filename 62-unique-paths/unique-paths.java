class Solution {

    public int dp(int m,int n,Integer[][] dp){
        if(m<0||n<0)return 0;
        if(m==1&&n==1)return 1;
        if(dp[m][n]!=null)return dp[m][n];
        int goingUp = dp(m-1,n,dp);
        int goingleft = dp(m,n-1,dp);
        return dp[m][n]=goingUp+goingleft;

    }

    public int tabuLation(int m,int n){
        int[][] dp = new int[m+1][n+1];
        dp[1][1]=1;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                // System.out.println("Ran for"+i+" "+j);
                if(i!=m)dp[i+1][j]+=dp[i][j];
                if(j!=n)dp[i][j+1]+=dp[i][j];
            }
        }
        return dp[m][n];
    }

    public int uniquePaths(int m, int n) {
        // return dp(m,n,new Integer[m+1][n+1]);/
        return tabuLation(m,n);
    }
}