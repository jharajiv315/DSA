
class Solution {

    public Node deepcopy(Node head) {
        Node temp1 = head;
        Node head2 = new Node(-1);
        Node temp2 = head2;

        while (temp1 != null) {
            Node t = new Node(temp1.val);

            temp2.next = t;
            temp2 = temp2.next;  // FIX 1

            temp1 = temp1.next;
        }

        return head2.next;
    }

    public void merge(Node head, Node head2) {
        Node temp1 = head;
        Node temp2 = head2;

        while (temp2 != null) {

            Node next1 = temp1.next;
            Node next2 = temp2.next;

            temp1.next = temp2;
            temp2.next = next1;

            temp1 = next1;
            temp2 = next2;
        }
    }

    public void random(Node head, Node head2) {
        Node temp1 = head;
        Node temp2 = head2;

        while (temp2 != null) {

            if (temp1.random == null) {
                temp2.random = null;
            } else {
                temp2.random = temp1.random.next;
            }

            temp1 = temp1.next.next;

            if (temp2.next != null) {
                temp2 = temp2.next.next;
            } else {
                temp2 = null;  // FIX 2
            }
        }
    }

    public void split(Node head) {

        Node temp = head;

        while (temp != null) {

            Node copy = temp.next;

            // Restore original list
            temp.next = copy.next;

            // Connect copied nodes
            if (copy.next != null) {
                copy.next = copy.next.next;
            } else {
                copy.next = null;
            }

            temp = temp.next;
        }
    }

    public Node copyRandomList(Node head) {

        if (head == null) return null;

        // Step 1: Create copied nodes
        Node head2 = deepcopy(head);

        // Step 2: Interleave the two lists
        merge(head, head2);

        // Step 3: Assign random pointers
        random(head, head2);

        // Step 4: Separate the lists
        split(head);

        return head2;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna