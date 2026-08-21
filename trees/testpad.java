package zcourse.trees;
import java.util.*;

import zcourse.trees.trees2.BinaryTree.Pair;

public class testpad {
    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    //print specific level of binary tree left to right
    public static void printLevel(Node root, int level,StringBuilder sb) {
        if (root == null) {
            return;
        }
        if (level == 1) {
            sb.append(root.data + " ");
            return;
        }
        printLevel(root.left, level - 1, sb);
        printLevel(root.right, level - 1, sb);
    }
    //height of binary tree according to no of levels.
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    //PRINT binary tree from level order traversal .
    public void printLevelOrder(Node root) {
        int h = height(root);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= h; i++) {
            printLevel(root, i, sb);
            System.out.println(sb.toString().trim());
        }
        
    }


    //print nodes at odd levels of binary tree
    public void printOddLevels(Node root, int level) {
        if (root == null) {
            return;
        }
        if (level % 2 != 0) {
            System.out.print(root.data + " ");
        }
        printOddLevels(root.left, level + 1);
        printOddLevels(root.right, level + 1);
    }



    //count no of nodes in binary tree
    public int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);
        return leftCount + rightCount + 1;
    }

    //count no of leaf nodes and non-leaf nodes in binary tree
    static int countLeafs(Node root) {
        if (root == null) {
            return 0;
        }   
        if (root.left == null && root.right == null) {
            return 1;
        }
        int leftLeafs = countLeafs(root.left);
        int rightLeafs = countLeafs(root.right);
        return leftLeafs + rightLeafs;

  }

  static int countNonLeafs(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 0;
        }
        int leftNonLeafs = countNonLeafs(root.left);
        int rightNonLeafs = countNonLeafs(root.right);
        return leftNonLeafs + rightNonLeafs + 1;
    }



    //mirror of binary tree

    public Node mirror(Node root) {
        if (root == null) {
            return null;
        }
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.left);
        mirror(root.right);
        return root;
    }



    //given 2 tress are they mirror of each other
    public boolean areMirrors(Node root1, Node root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.data != root2.data) {
            return false;
        }
        return areMirrors(root1.left, root2.right) && areMirrors(root1.right, root2.left);
    }



    //print nodes in top view of binary tree
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


    public static void main(String[] args) {
        testpad tree = new testpad();
        Node root = tree.new Node(1);
        root.left = tree.new Node(2);
        root.right = tree.new Node(3);
        root.left.left = tree.new Node(4);
        root.left.right = tree.new Node(5);
        root.right.left = tree.new Node(6);
        root.right.right = tree.new Node(7);
        // Print the binary tree in level order
        tree.printLevelOrder(root);


        // Print nodes at odd levels
        System.out.println("Nodes at odd levels:");
        tree.printOddLevels(root, 1);
        tree.printOddLevels(root, 3);


        // Count the number of nodes in the binary tree
        int nodeCount = tree.countNodes(root);
        System.out.println("Number of nodes in the binary tree: " + nodeCount);


        // Count the number of leaf nodes and non-leaf nodes in the binary tree
        int leafCount = countLeafs(root);
        int nonLeafCount = countNonLeafs(root);
        System.out.println("Number of leaf nodes: " + leafCount);
        System.out.println("Number of non-leaf nodes: " + nonLeafCount);


        // Mirror the binary tree
        tree.mirror(root);
        System.out.println("Mirrored binary tree in level order:");
        tree.printLevelOrder(root);



    }
    
}
