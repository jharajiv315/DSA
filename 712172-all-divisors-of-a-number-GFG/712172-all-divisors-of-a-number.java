class Solution {
    public ArrayList<Integer> getDivisors(int n) {
          // code here
          int i = 1;
          ArrayList<Integer> ans = new ArrayList<>();
          while(i <= Math.sqrt(n)){
              if(n % i == 0){
                  ans.add(i);
                  if(i != n / i) {
                      ans.add(n / i);
                  }
              }
              i++;



          }
          
            Collections.sort(ans);
          return ans;
      }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna