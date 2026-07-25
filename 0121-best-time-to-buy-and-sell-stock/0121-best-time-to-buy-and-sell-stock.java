class Solution {
    public int maxProfit(int[] arr) {
        int  n = arr.length;
        // int buyPrice = arr[0];
        int profit = 0;
        int maxProfit = 0;
        int mini = arr[0];
       for(int i = 1; i< n ;i++){
        profit = arr[i] - mini;
        maxProfit = Math.max(profit,maxProfit);
        mini = Math.min(arr[i],mini);
       }
       
        return maxProfit;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna