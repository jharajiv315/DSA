class Solution {
    public boolean isPalindrome(int x) {
     if(x<0) return false;
     int rev = 0;
     int num = x;
     while (num != 0) {
    rev = rev * 10 + num % 10; // Add last digit
    num = num / 10;            // Remove last digit
}

      return (rev == x); 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna