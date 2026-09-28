class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int i = 0 ;
        int j = arr.length - 1;
        reverse(arr,i,j);
    }
    public void reverse(int arr[],int i,int j) {
        // code here
       if(i>j) return;
       int temp = arr[i];
       arr[i] = arr[j];
       arr[j] = temp;
        reverse(arr,i+1,j-1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna