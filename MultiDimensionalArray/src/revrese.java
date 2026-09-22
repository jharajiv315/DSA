public class revrese {
    static void main(String[] args) {
        int[][] arr = {{25,25,38},{37,13,15},{83,22,28}};
        for(int i=0;i<arr.length;i++) {
            for(int j=arr[0].length-1;j>=0;j--) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
    }
}
