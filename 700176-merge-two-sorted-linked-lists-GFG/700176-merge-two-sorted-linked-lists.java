/*  Structure of Linked List Node
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
} */

class Solution {
    Node sortedMerge(Node list1, Node list2) {
        // code here
        Node dummy = new Node(45);
        Node temp = dummy;
        Node temp1 = list1;
        Node temp2 = list2;
               if(list1 == null) return list2;
               else if(list2 == null) return list1;
               while(temp1 != null && temp2 != null){
                   if(temp1.data <= temp2.data){
                       temp.next = temp1;
                       temp = temp.next;
                       temp1 = temp1.next;
                   }
                   else{
                       temp.next = temp2;
                       temp = temp.next;
                       temp2 = temp2.next;
                   }
               if(temp1 == null) {
                   temp.next = temp2;
                   break;
               }
               else if(temp2 == null){
                   temp.next = temp1;
                   break;
               }

               }

               return dummy.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna