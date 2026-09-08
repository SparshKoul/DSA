//path sum  1,2,3.

public class pw5 {
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

        //path sum 1 - check if there is a path from root to leaf with given sum
        public static boolean hasPathSum(Node root, int targetSum) {
            if (root == null) {
                return false;
            }
    
            // Check if we are at a leaf node and the target sum is equal to the node's value
            if (root.left == null && root.right == null) {
                return targetSum == root.data;
            }
    
            // Recursively check the left and right subtrees with the updated target sum
            int newTargetSum = targetSum - root.data;
            return hasPathSum(root.left, newTargetSum) || hasPathSum(root.right, newTargetSum);

        }


    

    
}
