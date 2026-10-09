class Solution {
    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(-1);
        ListNode c = dummy;
        ListNode a = head;

        while (a != null && a.next != null) {

            ListNode b = a.next;

            // Swap a and b
            c.next = b;
            a.next = b.next;
            b.next = a;

            // Move c to the end of swapped pair
            c = a;

            // Move a to next pair
            a = a.next;
        }

        return dummy.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna