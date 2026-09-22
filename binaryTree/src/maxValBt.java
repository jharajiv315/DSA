public class maxValBt {
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

        System.out.println(maxVal(a));

    }

    private static int maxVal(Node root) {
        if (root == null) return Integer.MIN_VALUE;
        return Math.max( root.val,Math.max(maxVal(root.left),maxVal(root.right)));

    }
}
