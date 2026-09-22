public class array_10 {
    static void main(String[] args) {
        int[] arr = {0,0,1,1,0,1,0,0,1};
        int numberOFOnes = 0;
        int numberOFZeroes = 0;
        for(int ele : arr){
            if(ele==0) numberOFZeroes++;
            else numberOFOnes++;
        }
        for (int i = 0; i <numberOFZeroes; i++) {
            arr[i]= 0;
        }
        for (int i = numberOFZeroes; i < arr.length; i++) {
            arr[i]=1;
        }
        for(int ele : arr) System.out.print(ele + " ");
    }
}
