package bst;
import java.util.*;

public class one {
    public static class  Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
     
    }

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

    public static void inorder(Node root) {
        if (root == null) {
            return ;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
        
    }


    //search in bst
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




    //delete in bst
    public static Node delete(Node root, int key) {
        if (root == null) {
            return null;
        }
        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {
            //node to be deleted

            //case 1: no child
            if (root.left == null && root.right == null) {
                return null;
            }
            //case 2: one child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            //case 3: node with two children
            Node  successor = findinorderSuccessor(root.right);//right bcoz left most in right sub tree is the successor.
            root.data = successor.data;
            root.right = delete(root.right, successor.data);
        }
        return root;
    }

    public static Node findinorderSuccessor(Node root) {
        while (root.left != null) {//left as right to uper kr he diya in fxn aab bas left most nikalne haia.
            root = root.left;
        }
        return root;
    }





    //print in range
    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        } else if (root.data < k1) {
            printInRange(root.right, k1, k2);
        } else {
            printInRange(root.left, k1, k2);
        }
    }


    //path root to leaf
    public static void printRootToLeaf(Node root, List<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
            System.out.println(path);
        } else {
            printRootToLeaf(root.left, path);
            printRootToLeaf(root.right, path);
        }
        path.remove(path.size() - 1);
    }




    //validate bst
    public static boolean isValidBST(Node root, int min, int max){
        if(root == null){
            return true;

        }
        if(root.data <= min || root.data >= max){
            return false;
        }
        return isValidBST(root.left, min, root.data) && isValidBST(root.right, root.data, max);
    }

    public static int isValidBST(Node root) {
        if (isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
            return 1;
        } else {
            return 0;
        }
    }

    //mirror of bst
    public static Node mirror(Node root) {
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


    //smalles and largest in bst
    public static int findMin(Node root) {
        if (root == null) {
            throw new IllegalArgumentException("Tree is empty");
        }
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    public static int findMax(Node root) {
        if (root == null) {
            throw new IllegalArgumentException("Tree is empty");
        }
        while (root.right != null) {
            root = root.right;
        }
        return root.data;
    }


    //kth smallest element in bst
    public static int kthSmallest(Node root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        inorderr(root, list);
        if(k <= 0 || k > list.size()) {
            //throw new IllegalArgumentException("k is out of bounds");
            return 0;
        }
        return list.get(k - 1);
    }
    //make sure to write in order code asawell.
    public static void inorderr(Node root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        inorderr(root.left, list);
        list.add(root.data);
        inorderr(root.right, list);
    }



    //kth largest element in bst
    public static int kthLargest(Node root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        inorderr(root, list);
        if(k <= 0 || k > list.size()) {
            //throw new IllegalArgumentException("k is out of bounds");
            return 0;
        }
        return list.get(list.size() - k);
    }





    //lca in bst
    public static Node lca(Node root, int n1, int n2) {
        if (root == null) {
            return null;
        }
        if (root.data > n1 && root.data > n2) {
            return lca(root.left, n1, n2);
        }
        if (root.data < n1 && root.data < n2) {
            return lca(root.right, n1, n2);
        }
        return root;
    }

    //lca in binary tree
    public static Node lcaBinaryTree(Node root, int n1, int n2) {
        if (root == null) {
            return null;
        }
        if (root.data == n1 || root.data == n2) {
            return root;
        }
        Node leftLCA = lcaBinaryTree(root.left, n1, n2);
        Node rightLCA = lcaBinaryTree(root.right, n1, n2);

        if (leftLCA != null && rightLCA != null) {
            return root;
        }
        return (leftLCA != null) ? leftLCA : rightLCA;
    }



    //floor and ceil in bst
    //floor is the largest value in the bst that is less than or equal to the given key. Floor = greatest value ≤ x
    //ceil is the smallest value in the bst that is greater than or equal to the given key. Ceil = smallest value ≥ x
    public static int floor(Node root, int key) {
        int floorValue = -1;
        while (root != null) {
            //equal case
            if (root.data == key) {
                return root.data;
            }
            //greater case move left
            if (root.data > key) {
                root = root.left;
            } else {//less case move right and update floor value
                floorValue = root.data;
                root = root.right;
            }
        }
        return floorValue;
    }

    public static int ceil(Node root, int key) {
        int ceilValue = -1;
        while (root != null) {
            //equal case
            if (root.data == key) {
                return root.data;
            }
            //less case move right
            if (root.data < key) {
                root = root.right;
            } else {//greater case move left and update ceil value
                ceilValue = root.data;
                root = root.left;
            }
        }
        return ceilValue;
    }









    public static void main(String[] args) {
        //build a bst
        int arr[] = {5, 1,3,4,2,7};
        Node root = null;
        for(int i=0; i<arr.length; i++) {
            root = insert(root, arr[i]);
        }
        
        inorder(root);
        System.out.println();



        //search in bst
        int key = 4;
        if (search(root, key)) {
            System.out.println("Found " + key);
        } else {
            System.out.println("Not Found " + key);
        }
    


    //delete in bst
    int keyToDelete = 3;
    Node  newRoot = delete(root, keyToDelete);
    System.out.println("After deletion of " + keyToDelete + ":");
    inorder(newRoot);




    //print in range
    int k1 = 2, k2 = 5;
    System.out.println("\nNodes in range [" + k1 + ", " + k2 + "]:");
    printInRange(root, k1, k2);


    //path root to leaf
    System.out.println("\nRoot to leaf paths:");
    printRootToLeaf(root, new ArrayList<>());




    //validate bst
    if (isValidBST(root) == 1) {
        System.out.println("The tree is a valid BST.");
    } else {
        System.out.println("The tree is not a valid BST.");
    }

    //mirror of bst
    Node mirroredRoot = mirror(root);
    System.out.println("Inorder of mirrored BST:");
    inorder(mirroredRoot);

    


    //smalles and largest in bst
    int minValue = findMin(root);
    int maxValue = findMax(root);
    System.out.println("\nMinimum value in BST: " + minValue);
    System.out.println("Maximum value in BST: " + maxValue);



    //kth smallest element in bst
    int k = 3;
    int kthSmallestElement = kthSmallest(root, k);
    System.out.println("\n" + k + "rd smallest element in BST: " + kthSmallestElement);

    //kth largest element in bst
    int kx = 2;
    int kthLargestElement = kthLargest(root, kx);
    System.out.println("\n" + kx + "nd largest element in BST: " + kthLargestElement);



    //lca in bst
    int n1 = 2, n2 = 4;
    Node lcaNode = lca(root, n1, n2);
    if (lcaNode != null) {
        System.out.println("\nLCA of " + n1 + " and " + n2 + ": " + lcaNode.data);
    } else {
        System.out.println("\nLCA does not exist.");
    }


    int n3 = 2, n4 = 8;
    Node lcaNode2 = lca(root, n3, n4);
    if (lcaNode2 != null) {
        System.out.println("\nLCA of " + n3 + " and " + n4 + ": " + lcaNode2.data);
    } else {
        System.out.println("\nLCA does not exist.");
    }
}
    
}
