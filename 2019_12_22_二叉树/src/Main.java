import java.util.*;
class TreeNode{
    char value;
    TreeNode left;
    TreeNode right;
    public TreeNode(char value) {
        this.value = value;
    }
}
public class Main{
    public static int i = 0;
    public static TreeNode buildTree(String s){
        TreeNode root = null;
        if(s.charAt(i) != '#'){
            root = new TreeNode(s.charAt(i));
            i++;
            root.left = buildTree(s);
            root.right = buildTree(s);
        }else {
            ++i;
        }
        return root;
    }
    public static void binaryTreeInOrder(TreeNode root){
        if(root == null) {
            return;
        }
        binaryTreeInOrder(root.left);
        System.out.print(root.value+" ");
        binaryTreeInOrder(root.right);
    }
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while(sca.hasNext()){
            String s = sca.nextLine();
            TreeNode root =  buildTree(s);
            binaryTreeInOrder(root);
        }
    }
}
