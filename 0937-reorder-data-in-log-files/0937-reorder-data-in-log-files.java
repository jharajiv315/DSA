import java.util.*;

class Solution {
    public String[] reorderLogFiles(String[] logs) {

        List<String> letters = new ArrayList<>();
        List<String> digits = new ArrayList<>();

        // Separate letter logs and digit logs
        for (int i = 0; i < logs.length; i++) {

            String log = logs[i];
            int space = log.indexOf(' ');

            if (Character.isDigit(log.charAt(space + 1))) {
                digits.add(log);
            } else {
                letters.add(log);
            }
        }

        // Sort letter logs
        Collections.sort(letters, (a, b) -> {

            int spaceA = a.indexOf(' ');
            int spaceB = b.indexOf(' ');

            String contentA = a.substring(spaceA + 1);
            String contentB = b.substring(spaceB + 1);

            // Compare content first
            int result = contentA.compareTo(contentB);

            // If content is same, compare identifier
            if (result == 0) {

                String idA = a.substring(0, spaceA);
                String idB = b.substring(0, spaceB);

                return idA.compareTo(idB);
            }

            return result;
        });

        // Create final answer
        String[] ans = new String[logs.length];
        int index = 0;

        // Add letter logs
        for (int i = 0; i < letters.size(); i++) {
            ans[index++] = letters.get(i);
        }

        // Add digit logs in original order
        for (int i = 0; i < digits.size(); i++) {
            ans[index++] = digits.get(i);
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna