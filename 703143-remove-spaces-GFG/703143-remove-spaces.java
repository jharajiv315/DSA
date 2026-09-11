class Solution {
    public String removeSpaces(String s) {
           // code here
           StringBuilder sb = new StringBuilder(s);
           for(int i = 0; i < sb.length(); i++){
               if(sb.charAt(i) == ' '){
                   sb.deleteCharAt(i);
                   i--; // Adjust index after deletion
               }
           }
             String ans =sb.toString();
       return ans;
       }
     
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna