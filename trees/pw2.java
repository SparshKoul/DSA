import java.util.*;
public class pw2 {


    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
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


    //inorder traversal
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }


    //postorder traversal
    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }   


    //level order traversal - breadth first traversal
    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new java.util.LinkedList<>();
        queue.add(root);
        queue.add(null); // marker for end of level

        while (!queue.isEmpty()) {
            Node curr = queue.remove();//poll is same as remove but it returns null if queue is empty, while remove throws exception if queue is empty.
            if (curr == null) {
                System.out.println(); // end of level
                if (!queue.isEmpty()) {// if there are still nodes to process, add marker for next level.
                    queue.add(null); // add marker for next level
                }
            } else {
                System.out.print(curr.data + " ");
                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
        }
    }


    //to print nth level of binary tree specific level of binary tree
    public static void nthLevel(Node root, int n) {
        if (root == null) {
            return;
        }
        if (n == 1) {
            System.out.print(root.data + " ");
            return;
        }
        nthLevel(root.left, n - 1);
        nthLevel(root.right, n - 1);

    }


    //by same logic we can print all the levels of binary tree by using level order traversal and just keeping track of the level and printing the nodes at each level.'
    
    public static void levelordermethod2 (Node root) {
        int levels = height(root) + 1; // number of levels is height + 1, because height is number of edges in longest path from root to leaf node, while number of levels is number of nodes in longest path from root to leaf node which is one more than number of edges in longest path from root to leaf node.
        for (int i = 1; i <= levels; i++) {  
            nthLevel(root, i);
            System.out.println();   


              }
    }

    //height of binary tree according to no of levels.
    public static int height2(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height2(root.left);
        int rightHeight = height2(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
        
    }


    //height of tree can or can not be equal to no of levels in treee.

    //if we consider leaf node as height 0, then height is number of edges in longest path from root to leaf node.

    //but if we consider leaf node as height 1 , ie height is by no of levels/nodes in longest path from root to leaf node, then height is same as number of levels in tree.

    
    public static int levels(Node root) {
        return height(root); // number of levels is same as height of binary tree only if we consider height in terms of number of nodes in longest path from root to leaf node, otherwise height is number of edges in longest path from root to leaf node which is one less than number of levels in tree.
    }




    //diameter of binary tree is the longest path between any two nodes in the tree, which may or may not pass through the root node.

    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int leftDiameter = diameter(root.left);
        int rightDiameter = diameter(root.right);
        int currDiameter = height(root.left) + height(root.right) ; 


        if(root.left != null) {
            currDiameter += 1; // add 1 for the edge between root and left child
        }

        if(root.right != null) {
            currDiameter += 1; // add 1 for the edge between root and right child
        }
        return Math.max(currDiameter, Math.max(leftDiameter, rightDiameter));
    }


    //height of tree acc to edges
    public static int height (Node root) {
        if (root == null) {
            return 0; // height of null node is 0

        }
        if(root.left == null && root.right == null) {
            return 0; // height of leaf node is 0
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1; // height of leaf node is 0
    }



    //leetcode q 543,110,257.

    




    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        //     1
        //    / \
        //   2   3
        //  / \  / \
        // 4  5 6  7




        // Preorder traversal
        System.out.println("Preorder traversal:");
        preorder(root);
        // Output: 1 2 4 5 3 6 7
        System.out.println();

        // Inorder traversal
        System.out.println("Inorder traversal:");
        inorder(root);
        System.out.println();
        // Output: 4 2 5 1 6 3 7

        // Postorder traversal
        System.out.println("Postorder traversal:");
        postorder(root);
        System.out.println();
        // Output: 4 5 2 6 7 3 1


        // Level order traversal
        System.out.println("Level order traversal:");
        levelOrder(root);
        // Output: 1
        //         2 3  
        //         4 5 6 7
        System.out.println();


        // Print nth level of binary tree
        System.out.println("Nth level of binary tree (n=2):");
        nthLevel(root, 2);
        // Output: 2 3
        System.out.println();




        // Print all levels of binary tree using nth level method
        System.out.println("All levels of binary tree using nthLevel method:");
        levelordermethod2(root);
        // Output: 1
        //         2 3
        //         4 5 6 7




        // Height of binary tree acc to levels.
        System.out.println("Height2 of binary tree:");
        System.out.println(height2(root));
        // Output: 3 (height of the tree, number of levels in longest path from root to leaf node)


        //height of tree acc to edges
        System.out.println("Height of tree according to edges:");
        System.out.println(height(root));
        // Output: 3 (height of the tree, number of edges in longest path from


    
}
}