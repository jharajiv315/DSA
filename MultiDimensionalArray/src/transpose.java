import static java.lang.IO.print;

public class transpose {
    static void main(String[] args) {
        int[][] arr = {{1,3,5},{5,7,8},{9,4,6}};
        print(arr);
        for (int i = 1; i <arr.length ; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        System.out.println("----------------");
        print(arr);
    }

    private static void print(int[][] arr) {
        for(int[] a :arr){
            for(int ele : a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
