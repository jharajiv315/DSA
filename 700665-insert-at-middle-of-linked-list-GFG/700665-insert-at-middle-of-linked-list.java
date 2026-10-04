class Solution {
    public Node insertInMiddle(Node head, int x) {

        if (head == null) {
            return new Node(x);
        }

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node temp = slow.next;
        Node val = new Node(x);

        slow.next = val;
        val.next = temp;

        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna