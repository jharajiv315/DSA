class Solution {
    static boolean isPrime(int n) {
        // code here
        int i =2;
        if(n==1) return false;
        while(i<=Math.sqrt(n)){
            if(n%i==0) return false;
            i++;
        }
        return true;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna