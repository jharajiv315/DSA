class Solution {
    public void wiggleSort(int[] arr) {
        Arrays.sort(arr);
       int n = arr.length;
       int[] ans = new int[n];
        int i = 1;
        int j = n-1;
        while(i<n){
           

            ans[i] = arr[j];
            j--;
            i+=2;
            
         
            }
            i =0 ;
        while(i<n){
           

            ans[i] = arr[j];
            j--;
            i+=2;
            
         
            }
            for(int k =0;k<n;k++){
                arr[k] = ans[k];
            }
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna