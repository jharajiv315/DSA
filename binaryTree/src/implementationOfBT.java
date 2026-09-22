import static java.lang.Integer.sum;

class  Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class implementationOfBT {
    static void main(String[] args) {

Node a = new Node(3);
Node b = new Node(5);
Node c = new Node(4);
Node d = new Node(6);
Node e = new Node(1);
Node f = new Node(8);
Node g = new Node(7);
a.left = b;
a.right = c;
b.left = d;
b.right = e;
c.left = f;
d.left = g;

        display(a);
        System.out.println();
        System.out.println(sum(a));
        System.out.println(size(a));
        System.out.println(height(a));
        System.out.println(product(a));


 }

    private static void display(Node a) {
        if (a == null) return;
        System.out.print(a.val + " ");;
        display(a.left);
        display(a.right);

    }

    private static int product(Node a) {
        if (a == null) return 1;
        return a.val * product(a.left) *  product(a.right);
    }

    private static int size(Node a) {
        if (a == null) return 0;
        return 1 + size(a.left) + size(a.right);
    }
    private static int height(Node a) {
        if (a == null) return 0;
        return  size(a.left) + size(a.right);
    }

    private static int sum(Node root) {
        if (root == null) return 0;
        return root.val +sum(root.left) + sum(root.right) ;
    }
    private static void dfs(Node root) {
        if (root == null) return;
        
        dfs(root.left);
        dfs(root.right);
    }
    private static void bfs(Node root) {
        if (root == null) return;
        dfs(root.left);
        dfs(root.right);


    }

}
