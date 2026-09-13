class Solution {
    public int romanToInt(String s) {
       int ans = 0;
       int n = s.length();
         for(int i = 0; i < n; i++){
              char ch = s.charAt(i);
              if(ch == 'I'){
                ans += 1;
              }else if(ch == 'V'){
                ans += 5;
              }else if(ch == 'X'){
                ans += 10;
              }else if(ch == 'L'){
                ans += 50;
              }else if(ch == 'C'){
                ans += 100;
              }else if(ch == 'D'){
                ans += 500;
              }else if(ch == 'M'){
                ans += 1000;
              }
         }
            for(int i = 0; i < n - 1; i++){
                
                char ch1 = s.charAt(i);
                char ch2 = s.charAt(i + 1);
                if(ch1 == 'I' && (ch2 == 'V' || ch2 == 'X')){
                    ans -= 2;
                }else if(ch1 == 'X' && (ch2 == 'L' || ch2 == 'C')){
                    ans -= 20;
                }else if(ch1 == 'C' && (ch2 == 'D' || ch2 == 'M')){
                    ans -= 200;
                }

            }
        return ans;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna