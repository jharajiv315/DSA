public class maxSumOfRows {
    static void main(String[] args) {
        int[][] arr = {{24,52,5},{25,26,8},{63,37,1}};
        int n = arr.length;
        int m = arr[0].length;
        int maxSum = Integer.MIN_VALUE;
        int row = -1;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=0;j<m-1;j++){
               sum+=arr[i][j];

            }
           if(sum>maxSum){
               maxSum=sum;
               row =i;

           }

        }
        System.out.println(row+" " +maxSum);
    }

}
