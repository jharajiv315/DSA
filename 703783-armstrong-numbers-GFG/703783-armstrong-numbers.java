class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int digit = 0;
        int sum = 0;
        int a = n;
        while(n>0){
            digit = n%10;
            sum+= digit*digit*digit;
            n/=10;
        }
        return sum==a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna