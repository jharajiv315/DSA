class Solution {
    public String makeFancyString(String s) {

        StringBuilder sb = new StringBuilder();
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {

            if (i == 0 || s.charAt(i) != s.charAt(i - 1)) {
                cnt = 1;
            } else {
                cnt++;
            }

            if (cnt <= 2) {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna