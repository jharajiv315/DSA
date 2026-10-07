/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        if(headA == null || headB == null) return null;
        int length1 = 0;
       while(temp1!=null){
            temp1 = temp1.next;
            length1++;
       }
        int length2 = 0;
       while(temp2!=null){
            temp2 = temp2.next;
            length2++;
       }
       temp1 = headA;
       temp2 = headB;
       boolean flag1 = false;
       boolean flag2 = false;
       int length = 0;
       if(length1 > length2){
            length = length1 - length2;
            flag1 = true;
       }
       else {
        length = length2 - length1;
        flag2 = true;
       }
       for(int i=0;i<length;i++){
        if(flag1){
            temp1 = temp1.next;
        }
        if(flag2){
            temp2 = temp2.next;
        }
       }
       while(temp1 != null && temp2 !=null){
        if(temp1 == temp2) return temp1;
        temp1 = temp1.next;
        temp2 = temp2.next;
       }
       return null;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna