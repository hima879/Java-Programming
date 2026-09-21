package Leetcode;
import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val,TreeNode left,TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class LevelOrderTraversal {
    
    // Returns list in level order
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        
        // Edge case: empty tree
        if (root == null) {
            return result;
        }
        
        // Queue stores nodes to process
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            // Number of nodes at current level
            int levelSize = queue.size();

            // List to store current level's values
            List<Integer> currentLevel = new ArrayList<>();
            
            //Process all nodes at current level list
            for(int i = 0;i<levelSize;i++){
                TreeNode node = queue.poll();

                //Add its value tto current level list
                currentLevel.add(node.val);
                // Add children for next level (if exist)
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            result.add(currentLevel);
        }
        
        return result;
    }
    
    // Demo
    public class BFS_Binary_Tree{
    public static void main(String[] args) {
        // Build tree:
        //      1
        //     / \
        //    2   3
        //   / \   \
        //  4   5   6
        //         /
        //        7
        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.right.left = new TreeNode(7);
        
        List<List<Integer>> result = levelOrder(root);
        System.out.println("Level Order: " + result);
        // Output: [[1], [2, 3], [4, 5, 6], [7]]
    }
}}