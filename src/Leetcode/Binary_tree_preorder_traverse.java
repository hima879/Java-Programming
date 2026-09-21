package Leetcode;
import java.util.*;

// The function class contains the preorder traversal logic.
class PreorderSolution {
    // Public method to perform preorder traversal on the tree root.
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorder(root, result);
        return result;
    }

    // Recursive helper that visits current node, then left subtree, then right subtree.
    private void preorder(TreeNode node, List<Integer> result) {
        if (node == null) {
            return; // Base case: nothing to process for a null node.
        }

        result.add(node.val);        // Visit the current node.
        preorder(node.left, result);  // Traverse the left subtree first.
        preorder(node.right, result); // Traverse the right subtree last.
    }
}

public class Binary_tree_preorder_traverse {
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

        PreorderSolution sol = new PreorderSolution();
        List<Integer> result = sol.preorderTraversal(root);

        // Print the preorder traversal result: [1, 2, 3]
        System.out.println(result);
    }
}

