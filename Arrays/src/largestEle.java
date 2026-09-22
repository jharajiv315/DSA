import java.util.ArrayList;
import java.util.HashSet;

public class largestEle {
    static void main(String[] args) {
        int[] arr = {2,6,7,-2,5,4,7};
        int n  = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        
        int maxSum = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > maxSum) {
                maxSum = j;
            }
        }
        System.out.println(maxSum);
    }
}
