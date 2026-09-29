class Solution {
    public List<String> validStrings(int n) {
        List<String>list = new ArrayList<>();
        helper(n, "", list);
        return list;
    }

    public void helper(int n, String ans, List<String>list){
        if(ans.length()==n){
            list.add(ans);
            return;
        }

        if(ans.length()!=0 && ans.charAt(ans.length()-1)=='0'){
            helper(n, ans+"1", list);
        }
        else{
            helper(n, ans+"0", list);
            helper(n, ans+"1", list);
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna