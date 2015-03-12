package lili.tree;

import java.util.Stack;

/**
 * http://www.nowcoder.com/questionTerminal/bcffd7e8a0d4402c99773bed98690bb7?orderByHotValue=0&pos=1&mutiTagIds=578_579_580_581_582_583_584_585_586_587_588_589_590_591_592_593_594_595_596_597_598_615_630_631_632_633_634_635
 * 使用非递归算法反转二叉树
 * 不用递归，使用栈来模拟递归过程
 * Created by lili on 15/3/10.
 */
public class MirrorTreeWithoutRecurrence {
    private Stack<TreeNode> stack = new Stack<TreeNode>();

    private void reverse(TreeNode ele) {
        if(ele!=null){
            TreeNode l = ele.left;
            ele.left = ele.right;
            ele.right = l;
        }

    }

    public void mirror(TreeNode root) {
        TreeNode tmp = root;
        while(!stack.isEmpty() || tmp!=null){
            while (tmp != null) {
                stack.push(tmp);
                tmp = tmp.left;
            }

            TreeNode t = stack.pop();
            tmp = t.right;
            reverse(t);
        }
    }

}