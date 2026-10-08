class Solution {
    public static void removeLoop(Node head) {

        if (head == null || head.next == null) {
            return;
        }

        Node slow = head;
        Node fast = head;

        // Detect the loop
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }

        // No loop
        if (fast == null || fast.next == null) {
            return;
        }

        // Find starting node of the loop
        slow = head;

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        // Find the last node of the loop
        fast = slow;

        while (fast.next != slow) {
            fast = fast.next;
        }

        // Remove the loop
        fast.next = null;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna