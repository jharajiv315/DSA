public class LC_1131 {
    public int maxValue(int[] arr) {
        // code here
//        Given an array arr[] of positive integers. Find maximum value of |arr[i] – arr[j]| + |i – j|, (0 <= i, j <= n – 1)
        int i = 0;
        int j  = arr.length - 1;
        int max = Integer.MIN_VALUE;
        helper(i,j,arr,max);
        return max;
    }
    public int helper(int i , int j, int[] arr, int max){
        if(i>j){
            return Integer.MIN_VALUE;
        }
        max = Math.max(Math.abs(arr[i]-arr[j])+Math.abs(i-j),max);
        return helper(i+1,j-1,arr,max);
    }
}
