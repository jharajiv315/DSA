
class Solution {
    public ListNode addTwoNumbers(ListNode num1, ListNode num2) {

        ListNode dummyHead = new ListNode(-1);
        ListNode curr = dummyHead;

        ListNode temp1 = num1;
        ListNode temp2 = num2;

        int carry = 0;

        while (temp1 != null || temp2 != null) {

            int sum = carry;

            if (temp1 != null) {
                sum += temp1.val;
            }

            if (temp2 != null) {
                sum += temp2.val;
            }

            ListNode newNode = new ListNode(sum % 10);
            carry = sum / 10;

            curr.next = newNode;
            curr = curr.next;

            if (temp1 != null) {
                temp1 = temp1.next;
            }

            if (temp2 != null) {
                temp2 = temp2.next;
            }
        }

        if (carry != 0) {
            ListNode newNode = new ListNode(carry);
            curr.next = newNode;
        }

        return dummyHead.next;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna