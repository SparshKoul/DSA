package zcourse.trees;
import java.util.*;

public class trees1 {
    //node class
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

    //binary tree class
    public static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            //BUILDING TREE FROM PREORDER TRAVERSAL. NLR (NODE LEFT RIGHT).
            idx++;
            //initialize index to -1, so that when we call buildTree for the first time, it will increment to 0 and start from the first element of the array.
            if (nodes[idx] == -1) {// if element is -1, it means that there is no node, so we return null.
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;//ROOT.
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



        //level order traversal
        public static void levelOrder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> queue = new LinkedList<>();
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



        // testpad way
        static void printLevelWise(Node root) {

    if (root == null) {
        return;
    }

    Queue<Node> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {

        int size = queue.size();

        for (int i = 0; i < size; i++) {

            Node curr = queue.poll();

            // Print space only between nodes
            if (i > 0) {
                System.out.print(" ");
            }

            System.out.print(curr.data);

            if (curr.left != null) {
                queue.add(curr.left);
            }

            if (curr.right != null) {
                queue.add(curr.right);
            }
        }

        System.out.println();
    }
}



        //height of binary tree
        public static int height(Node root) {
            if (root == null) {
                return 0;
            }
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }


        //count number of nodes in binary tree
        public static int countNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int leftCount = countNodes(root.left);
            int rightCount = countNodes(root.right);
            return leftCount + rightCount + 1; // +1 for current node
        }


        //sum of all nodes in binary tree
        public static int sumNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int leftSum = sumNodes(root.left);
            int rightSum = sumNodes(root.right);
            return leftSum + rightSum + root.data; // +root.data for current node
        }

        //size of binary tree is same as count of nodes in binary tree, so we can use countNodes method to get the size of binary tree.

        //size of binary tree
        public static int size(Node root) {
            return countNodes(root);
        }


    }
    

    public static void main(String[] args) {
        int tree[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        //vales in array is in preorder traversal of the binary tree, -1 is used to indicate that there is no node at that position.
        //therefore, build tree method will use this array to construct the binary tree according to preorder.

        // we can gues what type of array is this by looking at the values, we can see that it is a binary tree because it has a root node (1) , so lok at 1 and try to form combunation if nlr  or lrn, we can see that it is nlr because 1 is the root node, 2 is the left child of 1 and 3 is the right child of 1, so it is a binary tree.


        //if array is not in preorder, then we cannot use buildTree method to construct the binary tree, because this buildTree method is designed to construct binary tree from preorder traversal.
        

        //if array is post:then start from the end of the array and try to form combination of lrn, we can see that it is lrn because 6 is the right child of 3, 3 is the right child of 1, 5 is the right child of 2, 4 is the left child of 2, so it is a binary tree.
        //start frim end ...build right child first then left child and then root node.


        BinaryTree tree1 = new BinaryTree();
        Node root = tree1.buildTree(tree);
        System.out.println(root.data);//PRINTS THE ROOT NODE OF THE BINARY TREE, WHICH IS 1. THIS IS TO CHECK IF THE TREE IS BUILT CORRECTLY OR NOT, IF WE GET 1 THEN IT MEANS THAT THE TREE IS BUILT CORRECTLY, OTHERWISE THERE IS SOME ISSUE IN BUILDING THE TREE.

        System.out.println("Preorder traversal:");
        tree1.preorder(root);//output: 1 2 4 5 3 6

        System.out.println("Inorder traversal:");
        tree1.inorder(root);//output: 4 2 5 1 3 6

        System.out.println("Postorder traversal:");
        tree1.postorder(root);//output: 4 5 2 6 3 1

        System.out.println("Level order traversal:");

        tree1.levelOrder(root);//output: 1 
                            //          / \
                            //         2   3
                            //        / \   \
                            //       4   5   6
            // / used are just to show the structure of the tree, actual output will be:
                            // 1 
                            // 2 3 
                            // 4 5 6


        System.out.println("Height of binary tree:");
        System.out.println(tree1.height(root));//output: 3


        System.out.println("Count of nodes in binary tree:");
        System.out.println(tree1.countNodes(root));//output: 6


        System.out.println("Sum of all nodes in binary tree:");
        System.out.println(tree1.sumNodes(root));//output: 21 (1+2+4+5+3+6)



        System.out.println("Size of binary tree:");
        System.out.println(tree1.size(root));//output: 6 (same as count of nodes in binary tree)

    }
    

}


// we have used 2 classes here, one is Node class which represents a node in the binary tree and the other is BinaryTree class which contains methods to build the tree and perform preorder traversal.. makinf it organized and modular..
// we can use 1 class asawell like linked list.

//class BinaryTree {
//
//    static class Node {
//        int data;
//        Node left, right;
//
//        Node(int data) {
//            this.data = data;
//        }
//    }

//    static int idx = -1;

//    public static Node buildTree(int nodes[]) {
//        idx++;
//        if (nodes[idx] == -1) return null;
//
//        Node newNode = new Node(nodes[idx]);
//        newNode.left = buildTree(nodes);
//        newNode.right = buildTree(nodes);
//
//        return newNode;
//    }
//
//    public static void preorder(Node root) {
//        if (root == null) return;
//
//        System.out.print(root.data + " ");
//        preorder(root.left);
//        preorder(root.right);
//    }

//    public static void main(String[] args) {
//        int tree[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
//        Node root = buildTree(tree);
//        System.out.println(root.data);
//
//        System.out.println("Preorder traversal:");
//        preorder(root);
//    }
//}

//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx