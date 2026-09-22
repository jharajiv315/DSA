class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class Linkedlist{
    Node head;
    Node tail;
    int size;

    void insertAtBeg(int val){
        Node temp = new Node(val);
        if(head==null){head = tail=temp;}
        else{

        temp.next = head;
        head = temp;
        }
        size++;
    }
    void insertAtEnd(int val){
        Node temp = new Node(val);
        if(head==null){head = tail=temp;}
        else{
         temp.next = tail;
        tail = temp;
        }
        size++;
    }
    void display(){
        if(head==null){return;}
        while(head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }
    }
    void delete(){
        if(head==null){return;}
        head=head.next;
        size--;
    }
}
public class nodeofLinkedList {
    static void main(String[] args) {
    Linkedlist ll = new Linkedlist();
    ll.insertAtBeg(45);
    ll.insertAtBeg(18);
    ll.display();
    ll.insertAtEnd(264);
    ll.insertAtEnd(183);
    ll.display();



    }
}
