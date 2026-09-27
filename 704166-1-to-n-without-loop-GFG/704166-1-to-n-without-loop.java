class Solution {
    public void printTillN(int n) {
        // code here
        print(n);
    }
     public void print(int n){
        if(n==0) return;
        print(n-1);
        System.out.print(n+" ");
     }
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna