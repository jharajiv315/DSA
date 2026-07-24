class Solution {
    public int subtractProductAndSum(int n) {
        int sum =0;
        int product =1;
        int digit = 0;
        while(n>0){
            digit = n%10;
            sum+= digit;
            product*=digit;
            n/=10;

        }
        return product - sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna