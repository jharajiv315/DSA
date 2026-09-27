class Solution {
    int factorial(int n) {
        // code here
        return fact(n);
    }
    int fact(int n ){
        if(n==0 || n==1) return 1;
        return n * fact(n-1);
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna