package Leetcode;
import java.util.*;

// The function class contains the preorder traversal logic.
class PostorderSolution {
    // Public method to perform postorder traversal on the tree root.
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorder(root, result);
        return result;
    }

    // Recursive helper that visits left subtree, then right subtree, then current node.
    private void postorder(TreeNode node, List<Integer> result) {
        if (node == null) {
            return; // Base case: nothing to process for a null node.
        }

        postorder(node.left, result);  // Traverse the left subtree first.
        postorder(node.right, result); // Traverse the right subtree.
        result.add(node.val);          // Visit the current node.
    }
}

public class Binary_tree_postorder_traverse {
    public static void main(String[] args) {
        // Build a small sample tree:
        //     1
        //      \
        //       2
        //      /
        //     3
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        PostorderSolution sol = new PostorderSolution();
        List<Integer> result = sol.postorderTraversal(root);

        // Print the postorder traversal result: [3, 2, 1]
        System.out.println(result);
    }
}


