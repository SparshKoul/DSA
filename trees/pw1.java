public class pw1 {
    public  static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
    
        
    }
    }
    //working of printing a tree just to understand the concept of tree and how it works.
   public static void display(Node root) {

    if (root == null) {
        return;
    }

    System.out.print(root.data + " ");

    if (root.left != null)
        System.out.print(root.left.data + " ");
    else
        System.out.print("null ");

    if (root.right != null)
        System.out.print(root.right.data + " ");
    else
        System.out.print("null ");

    System.out.println();

    display(root.left);
    display(root.right);
            // this will print the root and its left and right child and then it will print the left subtree and then the right subtree.

}


    //preorder traversal
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }

    //size of binary tree - number of nodes in the tree
    public static int size(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + size(root.left) + size(root.right);
    }

    //sum of binary tree
    public static int sum(Node root) {
        if (root == null) {
            return 0;
        }
        return root.data + sum(root.left) + sum(root.right);
    }


    // for above two the onky diff in size each node contributes 1 to the size and in sum each node contributes its value to the sum.


    //node with maximum value in binary tree
    public static int maximumvalue(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data, Math.max(maximumvalue(root.left), maximumvalue(root.right)));
    }

    //minimum value in binary tree
    public static int minimumvalue(Node root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        return Math.min(root.data, Math.min(minimumvalue(root.left), minimumvalue(root.right)));
    }


    //product of all nodes in binary tree
    public static int product(Node root) {
        if (root == null) {
            return 1; // Multiplicative identity
        }
        return root.data * product(root.left) * product(root.right);
    }


    //height of binary tree by considering height of leaf node as 0, so height of null node is -1, height of leaf node is 0.
    //therfore height in terms of number of edges
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        if(root.left==null && root.right==null){
            return 0; // height of leaf node is considered as 0
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }



    //height in terms of number of nodes in longest path , ie levels in tree]
    public static int height2(Node root) {
        if (root == null) {
            return 0;
        }
        
        int leftHeight = height2(root.left);
        int rightHeight = height2(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }


    

    

    
    public static void main(String[] args) {
        //basic way to create a tree and its working via display function.
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(root.data);
        System.out.println(root.left.data);
        System.out.println(root.right.data);



        display(root);



        /// travelling 
        /// preorder traversal - root left right
        System.out.println("Preorder traversal:");
        preorder(root);
        System.out.println();

        //size of binary tree
        System.out.println("Size of binary tree:");
        System.out.println(size(root));//output: 7 (1,2,3,4,5,6,7)


        //sum of binary tree
        System.out.println("Sum of all nodes in binary tree:");
        System.out.println(sum(root));//output: 28 (1+2+4+5+3+6+7)


        //node with maximum value in binary tree
        System.out.println("Node with maximum value in binary tree:");
        System.out.println(maximumvalue(root));//output: 7 (maximum value in the tree)


        //height of binary tree
        System.out.println("Height of binary tree:");
        System.out.println(height(root));//output: 3 (height of the tree)


        //height of tree in terms of levels in tree/ nodes in longest path from root to leaf node
        System.out.println("Height of binary tree in terms of levels:");
        System.out.println(height2(root));//output: 4 (height of the tree in terms
        


        //product of all nodes in binary tree
        System.out.println("Product of all nodes in binary tree:");
        System.out.println(product(root));//output: 5040 (1*2*4*5*3*6*7)

        //minimum value in binary tree
        System.out.println("Minimum value in binary tree:");
        System.out.println(minimumvalue(root));//output: 1 (minimum value in the tree)
        
    }
    
}
