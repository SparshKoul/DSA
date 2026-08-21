package zcourse.trees;
import java.util.*;

public class trees2 {

    // Node of Binary Tree
    static class Node {

        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Binary Tree Class
    public static class BinaryTree {

        static int idx = -1;

        // Build Tree using Preorder Traversal
      

        private static Node buildTree(int nodes[]) {

            idx++;

            // -1 means NULL node
            if (nodes[idx] == -1) {
                return null;
            }

            // Create new node
            Node newNode = new Node(nodes[idx]);

            // Build left subtree
            newNode.left = buildTree(nodes);

            // Build right subtree
            newNode.right = buildTree(nodes);

            return newNode;
        }

        // Height of Binary Tree according to no of nodes in longest path from root to leaf node.
        public static int height(Node root) {

            // Base case
            if (root == null) {
                return 0;
            }

            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            return Math.max(leftHeight, rightHeight) + 1;
        }

        // Diameter of Binary Tree
        // Approach 1 : O(n^2)

        public static int diameter(Node root) {

            // Base case
            if (root == null) {
                return 0;
            }

            // Diameter of left subtree
            int leftDiameter = diameter(root.left);

            // Diameter of right subtree
            int rightDiameter = diameter(root.right);

            // Diameter through current node
            int selfDiameter =
                    height(root.left) + height(root.right) + 1;

            return Math.max(selfDiameter,Math.max(leftDiameter, rightDiameter));
        }

        // Approach 2 : O(n)

        static class TreeInfo {

            int diameter;
            int height;

            public TreeInfo(int diameter, int height) {
                this.diameter = diameter;
                this.height = height;
            }
        }

        public static TreeInfo diameterOptimized(Node root) {

            // Base case
            if (root == null) {
                return new TreeInfo(0, 0);
            }

            // Left subtree info
            TreeInfo leftInfo =
                    diameterOptimized(root.left);

            // Right subtree info
            TreeInfo rightInfo =diameterOptimized(root.right);

            // Diameter through current node
            int selfDiameter =leftInfo.height +rightInfo.height + 1;

            // Final diameter
            int diameter = Math.max(selfDiameter,Math.max(leftInfo.diameter,rightInfo.diameter));

            // Height of current node
            int height =Math.max(leftInfo.height,rightInfo.height) + 1;

            return new TreeInfo(diameter, height);
        }




        //subtree of binary tree
        public static boolean isSubtree(Node mainRoot, Node subRoot) {
            if (subRoot == null) {
                return true; // An empty tree is a subtree of any tree
            }
            if (mainRoot == null) {
                return false; // Non-empty subtree cannot be found in an empty tree
            }
            if (mainRoot.data == subRoot.data) {
                if (areIdentical(mainRoot, subRoot)) {
                return true; // Found a match
            }
        }
            // Recur for left and right subtrees of mainRoot
            return isSubtree(mainRoot.left, subRoot) || isSubtree(mainRoot.right, subRoot);
        }

        //check if two binary trees are identical
        public static boolean areIdentical(Node node, Node  subRoot) {
            if (node == null && subRoot == null) {
                return true; // Both trees are empty
            }
            if (node == null || subRoot == null) {
                return false; // One tree is empty and the other is not
            }
            // Check if the data of current nodes is the same even if structure is same but data is different then also it is not identical.
            if (node.data != subRoot.data) {
                return false; // Data does not match
            }

            if( !areIdentical(node.left, subRoot.left) || !areIdentical(node.right, subRoot.right) ) {
                return false; // Left or right subtrees are not identical
            }
            return true; // Current nodes match and left and right subtrees are identical
        }





        //top view of binary tree


        public static class Pair {
            Node node;
            int hd;

            public Pair(Node node, int hd) {
                this.node = node;
                this.hd = hd;
            }
        }

        public static void topView(Node root) {
            if (root == null) {
                return;
            }
            Map<Integer, Integer> map = new TreeMap<>(); // TreeMap to maintain sorted order of horizontal distances
            Queue<Pair> queue = new LinkedList<>();
            queue.add(new Pair(root, 0)); // Pair of node and its horizontal distance

            while (!queue.isEmpty()) {
                Pair curr = queue.poll();
                Node node = curr.node;
                int hd = curr.hd;

                // If this is the first node at its horizontal distance, add it to the map
                if (!map.containsKey(hd)) {
                    map.put(hd, node.data);
                }

                // Add left and right children to the queue with their respective horizontal distances
                if (node.left != null) {
                    queue.add(new Pair(node.left, hd - 1));
                }
                if (node.right != null) {
                    queue.add(new Pair(node.right, hd + 1));
                }
            }

            // Print the top view from the map
            for (Integer value : map.values()) {
                System.out.print(value + " ");
            }
        }







    }

    public static void main(String[] args) {

        // Preorder representation of tree
            int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        

        // Build Tree
        Node root = BinaryTree.buildTree(nodes);

        // Height
        System.out.println("Height = " +BinaryTree.height(root));

        // Diameter O(n^2)
        System.out.println("Diameter = " +BinaryTree.diameter(root));

        // Diameter O(n)
        //System.out.println("Optimized Diameter = " +BinaryTree.diameterOptimized(root)    );
        //outputHeight = 3 Diameter = 5 Optimized Diameter = zcourse.trees.trees2$BinaryTree$TreeInfo@7e9e5f8a


        //if //System.out.println("Optimized Diameter = " +BinaryTree.diameterOptimized(root).diameter); gives correct.

        // Diameter O(n)
        BinaryTree.TreeInfo treeInfo = BinaryTree.diameterOptimized(root);
        System.out.println("Optimized Diameter = " + treeInfo.diameter);


        // Subtree

        int subNodes[] = {2, 4, -1, -1, 5, -1, -1};
        Node subRoot = BinaryTree.buildTree(subNodes);
        System.out.println("Is Subtree = " +BinaryTree.isSubtree(root, subRoot)); //output: true







    }
}