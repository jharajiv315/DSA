class Solution {
    public void rev(int[] arr,int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }
    }
    public void nextPermutation(int[] arr) {
        int idx =-1;
        int n = arr.length;
        for(int i = n-2;i>=0;i--){
            if(arr[i] < arr[i+1]){
                idx =i;
                break;
            }
        }
        if(idx==-1) {
            rev(arr,idx+1,n-1);
            return;
        } 
        
        for(int i = n-1;i>=0;i--){
            if(arr[i]>arr[idx]){
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
            break;
            }
        }
        rev(arr,idx+1,n-1);

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna