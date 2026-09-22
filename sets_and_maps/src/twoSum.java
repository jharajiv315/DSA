import java.util.HashSet;

public class twoSum {
    static void main(String[] args) {
        int[] arr = {1,-2,6,7,5};
        int target = 5;
            HashSet<Integer> set = new HashSet<>();
            for(int i= 0; i< arr.length; i++){
                if(set.contains(target-arr[i])){
                    return;
                }
                else  set.add(arr[i]);

            }

    }
}
