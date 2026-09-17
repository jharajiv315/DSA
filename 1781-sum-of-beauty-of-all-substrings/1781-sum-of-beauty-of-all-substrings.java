class Solution {
    public int beautySum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] count = new int[26];
            for (int j = i; j < s.length(); j++) {
                count[s.charAt(j) - 'a']++;
                int maxCount = 0;
                int minCount = Integer.MAX_VALUE;
                for (int k = 0; k < 26; k++) {
                    if (count[k] > 0) {
                        maxCount = Math.max(maxCount, count[k]);
                        minCount = Math.min(minCount, count[k]);
                    }
                }
                sum += (maxCount - minCount);
            }
        }
        return sum;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna