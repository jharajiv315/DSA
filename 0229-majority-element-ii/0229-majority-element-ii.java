class Solution {
   public List<Integer> majorityElement(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            List<Integer> ans = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);


            }
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(nums[i]) && map.get(nums[i]) > nums.length/3) {
                    if(!ans.contains(nums[i])) ans.add(nums[i]);
                }
            }
            return ans;
        }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna