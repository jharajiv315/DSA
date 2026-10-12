/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
    
class Solution {
    // public Node reverse(Node head){
    //      Node prev = null;
    //     Node next = null;
    //     Node curr = head;
    //     while(curr!=null){
    //         next = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = next;
    //     }
    //     return prev;
    // }
    public int helper(Node temp){
     if(temp == null) return 1;
    int carry =helper(temp.next);
     temp.data += carry;
     if(temp.data < 10){
         return 0;
     }
        temp.data = 0;
        return 1;
    }
    // public Node addOne(Node head) {
    //   head = reverse(head);
    //   Node temp = head;
    //   int  carry = 1;
    //   while(temp!=null){
    //       temp.data += carry;
    //       if(temp.data < 10){
    //           carry = 0;
    //           break;
    //       }
    //       else{
    //           temp.data = 0;
    //           carry = 1;
    //       }
    //       temp = temp.next;
    //   }
    //   if(carry== 1){
    //       Node dummy = new Node(1);
    //      head =  reverse(head);
    //       dummy.next = head;
    //       return dummy;
    //   }
    //  head = reverse(head);
    //  return head;
      
     
    
    public Node addOne(Node head) {
     int carry = helper(head);
      if(carry== 1){
          Node dummy = new Node(1);
        
          dummy.next = head;
          return dummy;
      }
    
     return head;
      
     
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna