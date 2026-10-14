
class Solution {
    Node divide(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node even = new Node(45);
        Node odd = new Node(18);

        Node t = head;
        Node t1 = even;
        Node t2 = odd;

        while (t != null) {

            // Save the next node
            Node next = t.next;

            // Disconnect current node
            t.next = null;

            if (t.data % 2 == 0) {
                t1.next = t;
                t1 = t1.next;
            }
            else {
                t2.next = t;
                t2 = t2.next;
            }

            // Move to original next node
            t = next;
        }

        // Connect even list with odd list
        t1.next = odd.next;

        return even.next;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna