import java.util.HashMap;

public class twoSumlc {
    public int[] twoSum(int[] arr, int target) {
        int n = arr.length;

        int[] ans = new int[2];

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0; i<n;i++){
            if(map.containsKey(target-arr[i])){
                ans[0] = i;
                ans[1] = map.get(target-arr[i]);

            }
            map.put(arr[i],i);
        }
        return ans;



    }

}
