package zcourse.trees;

import java.util.*;

public class trees3 {
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


    //binary tree class not used here.
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



        //kth level of binary tree
        public static void kthLevel(Node root, int k,int level) {
            if (root == null) {
                return;
            }
            if (level == k) {
                System.out.print(root.data + " ");
                return;
            }
            kthLevel(root.left, k, level + 1);
            kthLevel(root.right, k, level + 1);

        }


        //lowest common ancestor of binary tree
        public static Node lca(Node root, int n1, int n2) {
            
            if ( root ==null || root.data == n1 || root.data == n2) {
                return root;
            }
            Node leftLca = lca(root.left, n1, n2);
            Node rightLca = lca(root.right, n1, n2);
            
            if (leftLca == null ) {
                return rightLca;
            }
            if (rightLca == null) {
                 return leftLca;
            }
            return root;
        }










        //minimum distance between two nodes in binary tree
        public static int minDistance(Node root, int n1, int n2) {
            Node lcaNode = lca(root, n1, n2);
            int d1 = findDistance(lcaNode, n1 );
            int d2 = findDistance(lcaNode, n2 );
            return d1 + d2;
        }

        //find distance between two nodes in binary tree
        public static int findDistance(Node root, int n) {
            if (root == null) {
                return -1;
            }
            if (root.data == n) {
                return 0;
            }
            int leftDistance = findDistance(root.left, n);
            int rightDistance = findDistance(root.right, n);
            if (leftDistance == -1 && rightDistance == -1) {
                return -1; // Node not found in either subtree
            }
            else if (leftDistance == -1) {
                return rightDistance + 1; // Node found in right subtree, add 1 for current node
            } else { 
            return leftDistance + 1; // Node found in left subtree, add 1 for current node
            } 
        }






        //kth ancestor of a node in binary tree
        public static int kthAncestor(Node root, int n, int k) {
            if (root == null) {
                return -1;
            }
            if (root.data == n) {
                return 0;
            }
            int leftDistance = kthAncestor(root.left, n, k);
            int rightDistance = kthAncestor(root.right, n, k);
            if (leftDistance == -1 && rightDistance == -1) {
                return -1; // Node not found in either subtree
            }
            int maxDistance = Math.max(leftDistance, rightDistance);
            if (maxDistance + 1 == k) {
                System.out.println(root.data);
            }
            return maxDistance + 1; // Add 1 for current node
        }









        public static void main(String[] args) {
            int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, -1 };
            Node root = buildTree(nodes);
            //tree - 1
            //      / \
            //     2   3
            //    / \ 
            //   4  5 


            System.out.println("Preorder traversal:");
            preorder(root);

            System.out.println("\nInorder traversal:");
            inorder(root);

            System.out.println("\nPostorder traversal:");
            postorder(root);

            System.out.println("\nKth level of binary tree (k=2):");
            kthLevel(root, 2, 1);

            System.out.println("\nLowest Common Ancestor of 4 and 5:");


            Node lcaNode = lca(root, 4, 5);
            System.out.println(lcaNode.data);
            // or simply
            System.out.println(lca(root, 4, 3).data);


            System.out.println("\nMinimum distance between 4 and 5:");
            System.out.println(minDistance(root, 4, 5));

            System.out.println("\nKth ancestor of 4 (k=1):");
            kthAncestor(root, 4, 1);
            System.out.println("\nKth ancestor of 4 (k=2):");
            kthAncestor(root, 4, 2);
            System.out.println("\nKth ancestor of 4 (k=3):");
            kthAncestor(root, 4, 3);

        }


}
