class Solution {

    public ListNode reverse(ListNode head) {

        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;

            prev = current;
            current = next;
        }

        return prev;
    }

    public boolean isPalindrome(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        // Find middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // slow is the beginning of second half
        ListNode head2 = slow;

        // Reverse second half
        head2 = reverse(head2);

        ListNode i = head;
        ListNode j = head2;

        // Compare
        while (j != null) {

            if (i.val != j.val) {
                return false;
            }

            i = i.next;
            j = j.next;
        }

        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna