class Solution {
    String firstAlphabet(String s) {
          String[] words = s.trim().split("\\s+"); // Split by one or more spaces
          StringBuilder sb = new StringBuilder();
          for(int i = 0; i < words.length; i++){
              if(!words[i].isEmpty()){
                  sb.append(words[i].charAt(0)); // Append the first character of each word
              }
          }
          return sb.toString();
      }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna