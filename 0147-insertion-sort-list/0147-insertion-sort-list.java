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
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(45);
        if(head == null || head.next == null) return head;
        while(head!=null){
            ListNode next = head.next;
            ListNode temp = dummy;
            while(temp.next != null && temp.next.val < head.val){
                
                temp = temp.next;
            }
          head.next = temp.next;
            temp.next= head;
            head = next;

        }
        return dummy.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna