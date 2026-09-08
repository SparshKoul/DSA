package bst;
//binary search tree - BST

public class pw1 {

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
    //search in BST
    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    //leetcode 700 - search in a binary search tree return sub tree.
    public static Node searchBST(Node root, int val) {
        if (root == null || root.data == val) {
            return root;
        }
        if (val < root.data) {
            return searchBST(root.left, val);
        } else {
            return searchBST(root.right, val);
        }
    }

    //insert in BST
    public static Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        }
        return root;
    }

    //height of BST according to 
    public static int height(Node root) {
        if (root == null) {
            return 0; // height of an empty tree is 0
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
   


    //construct BST from sorted array
    public static Node constructBSTFromSortedArray(int[] arr, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        Node node = new Node(arr[mid]);
        node.left = constructBSTFromSortedArray(arr, start, mid - 1);
        node.right = constructBSTFromSortedArray(arr, mid + 1, end);
        return node;
    }

    
    





    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(8);

        int key = 4;
        if (search(root, key)) {
            System.out.println("Key " + key + " found in the BST.");
        } else {
            System.out.println("Key " + key + " not found in the BST.");
        }


        //leetcode 700 - search in a binary search tree
        Node root2 = new Node(5);
        root2.left = new Node(3);
        root2.right = new Node(7);
        root2.left.left = new Node(2);
        root2.left.right = new Node(4);
        root2.right.left = new Node(6);
        root2.right.right = new Node(8);
        int val = 4;
        Node result = searchBST(root2, val);
        //output according to leetcode 700 - search in a binary search tree
        //input-[4,2,7,1,3] val = 2
        //output - [2,1,3]
        if (result != null) {
            System.out.println("Node with value " + val + " found in the BST.");
        } else {
            System.out.println("Node with value " + val + " not found in the BST.");
        }



        //insert in BST
        Node root3 = new Node(5);
        insert(root3, 3);
        insert(root3, 7);
        insert(root3, 2);
        insert(root3, 4);
        insert(root3, 6);
        insert(root3, 8);
        //output of insert in BST
        //input - [5,3,7,2,4,6,8]
        //output - 5 3 7 2 4 6 8


        //construct BST from sorted array
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7};
        constructBSTFromSortedArray(sortedArray, 0, sortedArray.length - 1);
        //output of construct BST from sorted array
        //input - [1,2,3,4,5,6,7]
        //output - 4 2 6 1 3 5 7

    

        
        
    }



    
}