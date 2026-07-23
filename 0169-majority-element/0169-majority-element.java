class Solution {
       public int majorityElement(int[] nums) {
        // HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        // for (int i = 0; i < nums.length; i++) {
        //     map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);


        // }
        // for (int i = 0; i < nums.length; i++) {
        //     if (map.containsKey(nums[i]) && map.get(nums[i]) > nums.length/2) {
        //         return nums[i];
        //     }
        // }
        // return -1;
        int n = nums.length;
        int cnt =0;
        int ele =nums[0];
        for(int i = 0;i<n;i++){
            if( cnt == 0) ele = nums[i];
            if(nums[i]==ele) cnt++;
            else cnt--;
        }
        return ele;
    }
    
}



// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna