class Solution {
    public static char getMaxOccuringChar(String s) {
        // code here
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        int maxFreq = Integer.MIN_VALUE;
        char ans = arr[0];
        int i=0,j=0, n=arr.length;
        while(j<n){

            if(arr[i]==arr[j]){
               j++;
            }
            else{
                int freq = j-i;
                if(freq>maxFreq) ans = arr[i];
                maxFreq = Math.max(freq,maxFreq);
                i =j;
                
            
                }
        }
                int freq = j-i;
                if(freq>maxFreq) ans = arr[i];
                maxFreq = Math.max(freq,maxFreq);
                return ans;
                
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna