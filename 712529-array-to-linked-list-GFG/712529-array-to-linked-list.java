/* Linked List Node Structure
class Node {
    int data;
    Node next;
    Node (int d) {
       data = d;
       next = null;
    }
};
*/
class Solution {
 public Node arrayToList(int[] arr) {
         // code here
         Node head = null;
         for (int i = arr.length - 1 ; i >= 0; i--) {
         if (head == null) {
         head = new Node(arr[i]);
         } else {
             Node temp = new Node(arr[i]);
             temp.next = head;
             head = temp;

         }

         }
         return head;
     }
}



// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna