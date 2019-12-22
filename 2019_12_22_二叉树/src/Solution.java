import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Solution {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) return list;
        list.add(new ArrayList<Integer>());
        int size = 1;
        int level = 0;;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            size--;
            TreeNode node = queue.poll();
            list.get(level).add(node.val);
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
            if (size == 0) {
                size = queue.size();
                level++;
                if(!queue.isEmpty()) list.add(new ArrayList<Integer>());
            }
        }
        return list;
    }
}

