//zigzag level order traversal of binary tree using nth level method 

public class pw3 {

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


    //height of binary tree according to no of levels.
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }


    //print specific level of binary tree left to right
    public static void printLevel(Node root, int level) {
        if (root == null) {
            return;
        }
        if (level == 1) {
            System.out.print(root.data + " ");
            return;
        }
        printLevel(root.left, level - 1);
        printLevel(root.right, level - 1);

    }

    //print specific level of binary tree right to left
    public static void printLevelRightToLeft(Node root, int level) {
        if (root == null) {
            return;
        }
        if (level == 1) {
            System.out.print(root.data + " ");
            return;
        }
        printLevelRightToLeft(root.right, level - 1);
        printLevelRightToLeft(root.left, level - 1);
    }


    //level order traversal of binary tree using nth level method
    public static void levelOrder(Node root) {
        int level = height(root) ; // as height of binary tree according to no of levels.
        for (int i = 1; i <= level; i++) {  
            printLevel(root, i);
            System.out.println();
        }
    }



    //zigzag level order traversal of binary tree using nth level method
    public static void zigzagLevelOrder(Node root) {
        int level = height(root) ; // as height of binary tree according to no of levels.
        for (int i = 1; i <= level; i++) {  
            if (i % 2 == 1) {
                printLevel(root, i);

            }
                else {
                    printLevelRightToLeft(root, i);
                }
                System.out.println();
            }
        }





        // summ of levels of binary tree
        public static int sumLevel(Node root, int level) {
             if (root == null) {
                 return 0;
                 }

            if (level == 1) {
                return root.data;
            }

             return sumLevel(root.left, level - 1)
                  + sumLevel(root.right, level - 1);
            }

            //sum of all levels of binary tree
        public static int sumAllLevels(Node root) {
                int level = height(root) ; // as height of binary tree according to no of levels.
                int sum = 0;
                for (int i = 1; i <= level; i++) {  
                    sum += sumLevel(root, i);
                }
                return sum;
            }




    




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
        



        //height of binary tree according to no of levels.
        System.out.println("Height of binary tree according to no of levels: " + height(root));

        //print specific level of binary tree left to right
        System.out.println("Print specific level of binary tree left to right (level 2):");
        printLevel(root, 2);
        System.out.println();


        //print specific level of binary tree right to left
        System.out.println("Print specific level of binary tree right to left (level 2):");
        printLevelRightToLeft(root, 2);
        System.out.println();


        //level order traversal of binary tree using nth level method
        System.out.println("Level order traversal of binary tree using nth level method:");
        levelOrder(root);

        //zigzag level order traversal of binary tree using nth level method
        System.out.println("Zigzag level order traversal of binary tree using nth level method:");
        zigzagLevelOrder(root);


        // summ of levels of binary tree
        System.out.println("Sum of levels of binary tree (level 2): " + sumLevel(root, 2));

        //sum of all levels of binary tree
        System.out.println("Sum of all levels of binary tree: " + sumAllLevels(root));
        



        
    }
    
}
