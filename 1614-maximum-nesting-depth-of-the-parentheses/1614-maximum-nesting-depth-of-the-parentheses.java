class Solution {
    public int maxDepth(String s) {
        int depth = 0;
        int maxDepth = Integer.MIN_VALUE;
        int n = s.length();
        for(int i =0;i<n;i++){
            if(s.charAt(i)=='(') depth+=1;
            else if(s.charAt(i)==')') depth-=1;
            maxDepth = Math.max(depth,maxDepth);
        }
        return maxDepth;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna