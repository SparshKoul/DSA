import java.util.*;


public class pw4 {
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

        


    //form a tree from pre and in order traversal
        public static Node buildTree(int[] preorder, int[] inorder) {
           int n = preorder.length;

        return helper(preorder, 0, n - 1,inorder, 0, n - 1);
        }
        public static Node helper(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
            if (preStart > preEnd || inStart > inEnd) {
                return null;
            }

            int rootValue = preorder[preStart];
            Node root = new Node(rootValue);

            // Find the index of the root in the inorder array
            int inRootIndex = inStart;
            while (inorder[inRootIndex] != rootValue) {
                inRootIndex++;
            }

            int leftTreeSize = inRootIndex - inStart;

            root.left = helper(preorder, preStart + 1, preStart + leftTreeSize, inorder, inStart, inRootIndex - 1);
            root.right = helper(preorder, preStart + leftTreeSize + 1, preEnd, inorder, inRootIndex + 1, inEnd);

            return root;
        }




        //print path from root to leaf
        public static void paths(Node root,String path,List<String> ans) {

        if(root == null) {
            return;
        }

        // leaf node k liye
        if(root.left == null &&root.right == null) {

            ans.add(path + root.data);

            return;
        }
        paths(root.left,path + root.data + "->",ans);

        paths(root.right,path + root.data + "->",ans);
    }

    public static List<String> binaryTreePaths(Node root) {

        List<String> ans = new ArrayList<>();

        paths(root, "", ans);

        return ans;
    }

    
    public static void main(String[] args) {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        Node root = buildTree(preorder, inorder);
        System.out.println(binaryTreePaths(root));
        // You can add code here to print the tree or verify its structure


        //print path from root to leaf
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);
        root2.left.right = new Node(5);
        List<String> paths = binaryTreePaths(root2);
        System.out.println(paths); // Output: ["1->2->4", "1->2->5", "1->3"]

        




        

    }
    
}
