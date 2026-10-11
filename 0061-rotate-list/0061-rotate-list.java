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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head;
        int cnt =0;
        if(head==null|| head.next == null) return head;
        while(temp!=null){
            temp = temp.next;
            cnt++;
        }
        if(k > cnt) {
            k = k % cnt;
            
        }
        if(k == cnt) return head;
        if(k == 0) return head;
        int idx = cnt-1;
        temp = head;
        while(idx!=k){
            temp = temp.next;
            idx--;
        }
        ListNode head2 = temp.next;
        temp.next = null;
        ListNode temp2 = head2;
        while(temp2.next!=null){
            temp2 = temp2.next;
        }
        temp2.next = head;
        return head2;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna