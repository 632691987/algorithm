package algorithm.leecode.p202102;

import org.junit.Test;

public class TreeNodeExample {


    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {

        if (original.val == target.val) {
            return cloned;
        } else {
            if (original.left != null) {
                TreeNode node = getTargetCopy(original.left, cloned.left, target);
                if (node != null) {
                    return node;
                }
            }

            if (original.right != null) {
                TreeNode node = getTargetCopy(original.right, cloned.right, target);
                if (node != null) {
                    return node;
                }
            }
        }

        return null;
    }

    @Test
    public void test1() {
        TreeNode at1 = new TreeNode(1);
        TreeNode bt1 = new TreeNode(1);

        TreeNode at2 = new TreeNode(2);
        TreeNode bt2 = new TreeNode(2);

        TreeNode at3 = new TreeNode(3);
        TreeNode bt3 = new TreeNode(3);

        TreeNode at4 = new TreeNode(4);
        TreeNode bt4 = new TreeNode(4);

        TreeNode at5 = new TreeNode(5);
        TreeNode bt5 = new TreeNode(5);

        TreeNode at6 = new TreeNode(6);
        TreeNode bt6 = new TreeNode(6);

        TreeNode at7 = new TreeNode(7);
        TreeNode bt7 = new TreeNode(7);

        TreeNode at8 = new TreeNode(8);
        TreeNode bt8 = new TreeNode(8);

        TreeNode at9 = new TreeNode(9);
        TreeNode bt9 = new TreeNode(9);

        TreeNode at10= new TreeNode(10);
        TreeNode bt10= new TreeNode(10);

        at1.left = at2;
        at1.right = at3;
        at2.left = at4;
        at2.right = at5;
        at4.left = at8;
        at4.right = at9;
        at5.left = at10;
        at3.left = at6;
        at3.right = at7;

        bt1.left = bt2;
        bt1.right = bt3;
        bt2.left = bt4;
        bt2.right = bt5;
        bt4.left = bt8;
        bt4.right = bt9;
        bt5.left = bt10;
        bt3.left = bt6;
        bt3.right = bt7;

        TreeNode destination = getTargetCopy(at1, bt1, at5);
        System.out.println(destination.val);
    }
}
