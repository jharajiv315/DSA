class Solution {
    public int fib(int n) {
        return fibo(n);
    }
    public int fibo(int n ){
       if(n==0 || n==1) return n;
        return fibo(n-1) + fibo(n-2);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna