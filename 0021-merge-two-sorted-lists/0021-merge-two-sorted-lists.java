/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(45);
        ListNode temp = dummy;
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        if(list1 == null) return list2;
        else if(list2 == null) return list1;
        while(temp1 != null && temp2 != null){
            if(temp1.val <= temp2.val){
                temp.next = temp1;
                temp = temp.next;
                temp1 = temp1.next;
            }
            else{
                temp.next = temp2;
                temp = temp.next;
                temp2 = temp2.next;
            }
        if(temp1 == null) {
            temp.next = temp2;
            break;
        }
        else if(temp2 == null){
            temp.next = temp1;
            break;
        }
            
        }
        
        return dummy.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna