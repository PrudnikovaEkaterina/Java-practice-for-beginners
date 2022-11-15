package day18;

public class Node {
    private int value;
    private Node left;
    private Node right;

    public int getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public Node(int value) {
        this.value = value;
        left=null;
        right=null;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public static void buildTree (Node root, int value) {
        if(value>root.getValue()){
            if (root.getRight()==null)
                root.setRight(new Node(value));
            else
            {root=root.getRight();
                buildTree(root, value);
            }}
        if (value<root.getValue()){
            if (root.getLeft()==null)
                root.setLeft(new Node(value));
            else {
                root=root.getLeft();
                buildTree(root, value);
            }
        }
    }

    public static void print (Node root){
        if (root.getLeft() != null)
            print(root.getLeft());
        System.out.print(root.getValue()+" ");
        if (root.getRight() != null)
            print(root.getRight());

        }
}



