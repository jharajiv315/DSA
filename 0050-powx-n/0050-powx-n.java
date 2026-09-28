class Solution {
    public double myPow(double x, int n) {
        if(n < 0){
            n = -n;
            return (1/pow(x,n));
        }
       return pow(x,n);
    }
    public double pow(double a, int b) {
        if(b==0) return 1;
        double call = pow(a,b/2);
        if(b%2 == 0) return call*call;
        else return a*call*call;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna