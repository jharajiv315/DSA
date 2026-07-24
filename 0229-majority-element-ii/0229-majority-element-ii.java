class Solution {
   public List<Integer> majorityElement(int[] nums) {
            // HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            List<Integer> ans = new ArrayList<>();
            // for (int i = 0; i < nums.length; i++) {
            //     map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);


            // }
            // for (int i = 0; i < nums.length; i++) {
            //     if (map.containsKey(nums[i]) && map.get(nums[i]) > nums.length/3) {
            //         if(!ans.contains(nums[i])) ans.add(nums[i]);
            //     }
            // }
            // return ans;
        int n = nums.length;
        int cnt1 =0 ;
        int cnt2=0;
        int ele1 = Integer.MAX_VALUE ;
         int ele2 = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++){
            if( cnt1 == 0 && nums[i] != ele2){
                cnt1=1;
             ele1 = nums[i];
            } 
           else if( cnt2 == 0 && nums[i] != ele1){
                cnt2=1;
             ele2 = nums[i];
            } 
            else if(nums[i]==ele1) cnt1++;
            else if(nums[i]==ele2) cnt2++;
            else{
                cnt1--;
                cnt2--;
            } 
        }
        cnt1=0 ;
        cnt2=0 ;
        for(int i = 0;i<n;i++){
            if(ele1==nums[i]) cnt1++;
            if(ele2==nums[i]) cnt2++;
        }
        int maj = (int)n/3 + 1;
        if(cnt1 >= maj) ans.add(ele1);
        if(cnt2 >= maj) ans.add(ele2);
        return ans;
        
        
        }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna