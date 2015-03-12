package lili.tree;

import apple.laf.JRSUIUtils;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 反转二叉树，即交换所有节点的左右子树，但不能使用递归方法
 * 这题就是“遍历所有节点”这一类型：不管是用栈还是用堆
 *
 * Created by lili on 15/3/10.
 */
public class ReverseTree {
    public static void reverseTreeNode2(TreeNode root) {
        if (root == null ) {
            return;
        }
        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.peek();
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            queue.poll();//Retrieves and removes the head of this queue
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null ){
                queue.offer(node.right);
            }
        }

    }

}


class TreeNode {
    TreeNode left, right; //左右子树
    String data; //数据
}