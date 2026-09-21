package Leetcode;
import java.util.*;

// The function class contains the inorder traversal logic.
class InorderSolution {
    // Public method to perform inorder traversal on the tree root.
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> result = new ArrayList<>();
        inorder(root,result);
        return result;
    }
    
    // Recursive helper that visits left subtree, current node, then right subtree.
    private void inorder(TreeNode node,List<Integer> result){
        if (node== null){
            return;
        }
        inorder(node.left, result);
        result.add(node.val);
        inorder(node.right, result);
    }
}

public class Binary_tree_inorder_traverse {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        InorderSolution sol = new InorderSolution();
        List<Integer> result = sol.inorderTraversal(root);
        System.out.println(result);
    }
}
