class Solution {
    
    
    public int fib(int n) {
        int[] dp = new int[3];
        dp[0] = 0;
        if (n==1) return 1;
       if(n>=1) dp[1] =1;
        for(int i=2;i<=n;i++){
            dp[2] = dp[0] + dp[1] ;
            dp[0] = dp[1];
            dp[1] = dp[2];
        }
       return dp[2];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna