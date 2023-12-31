package com.example.datastructureandalgorithm.datastructure;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class TraversalBinaryTree {

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
//        node4.left = new TreeNode(8);
//        node5.right = new TreeNode(8);
//        node5.left = new TreeNode(10);
        print(node1);
//        boolean cbt = isCBT(node1);
//        System.out.println(cbt ? "该树为完全二叉树" : "该树非完全二叉树");
//        boolean cbt2 = isCBT2(node1);
//        System.out.println(cbt2 ? "该树为完全二叉树" : "该树非完全二叉树");

        TreeNode lowestAncestor = lowestAncestor(node1, node5, node4);
        System.out.println("最低公共祖先为：" + lowestAncestor.value);
//
//        System.out.println("------最大距离-------");
//        int distance = maxDistance(node1);
//        System.out.println("最大距离为：" + distance);
//
//        System.out.println("------是否为满二叉树-------");
//        boolean fbt = isFBT(node1);
//        System.out.println("结果: " + fbt);

//        int maxWidth = maxWidth(node1);
//        System.out.println("最大宽度为: " + maxWidth);

//        System.out.println("-----先序遍历-----");
//        precedence(node1);
//        System.out.println();
//        preByNonRecur(node1);
//        System.out.println();

//        System.out.println("-----中序遍历-----");
//        inorder(node1);
//        System.out.println();
//        inorderByNonRecur(node1);
//        System.out.println();
//        inorderByNonRecur2(node1);
//        System.out.println();

//        System.out.println("-----后序遍历-----");
//        subsequent(node1);
//        System.out.println();
////        subByNonRecur(node1);
//        sub2(node1);
//        System.out.println();

//        System.out.println("-----判断两棵树是否相同-----");
//        TreeNode node11 = new TreeNode(1);
//        TreeNode node22 = new TreeNode(2);
//        TreeNode node33 = new TreeNode(3);
//        TreeNode node44 = new TreeNode(4);
//        TreeNode node55 = new TreeNode(5);
//        TreeNode node66 = new TreeNode(6);
//        TreeNode node77 = new TreeNode(7);
//        node11.left = node22;
//        node11.right = node33;
//        node22.left = node44;
//        node22.right = node55;
//        node33.left = node66;
//        node33.right = node77;
//        System.out.println("判断结果: " + isSameTree(node1, node11));

//        System.out.println();
//        System.out.println("-----判断两棵树是否为镜面树-----");
//        TreeNode node1 = new TreeNode(1);
//        TreeNode node5 = new TreeNode(5);
//        TreeNode node55 = new TreeNode(5);
//        TreeNode node4 = new TreeNode(4);
//        TreeNode node44 = new TreeNode(4);
//        TreeNode node8 = new TreeNode(8);
//        TreeNode node88 = new TreeNode(80);
//        node1.left = node5;
//        node1.right = node55;
//        node5.left = node8;
//        node5.right = node4;
//        node55.left = node44;
//        node55.right = node88;
//        System.out.println("判断结果: " + isSymmetricTree(node1));

//        System.out.println("-----求一棵树的深度-----");
//        TreeNode node1 = new TreeNode(1);
//        TreeNode node5 = new TreeNode(5);
//        TreeNode node55 = new TreeNode(5);
//        TreeNode node4 = new TreeNode(4);
//        TreeNode node44 = new TreeNode(4);
//        TreeNode node8 = new TreeNode(8);
//        TreeNode node88 = new TreeNode(8);
//        TreeNode node9 = new TreeNode(9);
//        node1.left = node5;
//        node1.right = node55;
//        node5.left = node8;
//        node5.right = node4;
//        node55.left = node44;
//        node55.right = node88;
//        node88.left = node9;
//        System.out.println("该树的深度为: " + maxDepth(node1));

//        System.out.println("-----根据先序数组和中序数组求出原树-----");
//        int[] pre = {1, 3, 2, 4, 5, 6, 8};
//        int[] in = {2, 3, 4, 1, 6, 5, 8};
//        TreeNode treeNode = buildTree(pre, in);
//        System.out.println("得到原树为:");
////        printTree(treeNode);
//        print(treeNode);
//        System.out.println("-------判断是否为平衡二叉树-------");
//        boolean balancedBinaryTree = isBalancedBinaryTree(treeNode);
//        System.out.println("结果：" + balancedBinaryTree);
//
//        TreeNode node1 = new TreeNode(1);
//        TreeNode node2 = new TreeNode(2);
//        TreeNode node3 = new TreeNode(3);
//        TreeNode node4 = new TreeNode(4);
//        TreeNode node5 = new TreeNode(5);
//        TreeNode node6 = new TreeNode(6);
//        TreeNode node7 = new TreeNode(7);
//        node1.left = node2;
//        node1.right = node3;
//        node2.left = node4;
//        node2.right = node5;
//        node4.left = node6;
//        node6.right = node7;
////        print(node1);
//        boolean isBa = isBalancedBinaryTree(node1);
//        System.out.println("结果：" + isBa);

//        System.out.println("-------判断是否为搜索二叉树-------");
//        TreeNode node8 = new TreeNode(8);
//        TreeNode node5 = new TreeNode(5);
//        TreeNode node3 = new TreeNode(3);
//        TreeNode node6 = new TreeNode(6);
//        TreeNode node1 = new TreeNode(1);
//        TreeNode node10 = new TreeNode(10);
//        TreeNode node9 = new TreeNode(9);
//        TreeNode node12 = new TreeNode(12);
//        node8.left = node5;
//        node8.right = node10;
//        node5.left = node3;
//        node5.right = node6;
//        node3.left = node1;
//        node10.left = node9;
//        node10.right = node12;
////        node12.right = new TreeNode(7);
//        print(node8);
//        boolean isBST = isBST(node8);
//        System.out.println("结果：" + isBST);
//
//        System.out.println("-------是否含有期望值的路径和-------");
//        boolean has = hasSum(node8, 10);
//        System.out.println("结果：" + has);
//
//        System.out.println("-------收集达标路径和-------");
//        List<List<Integer>> lists = pathSum(node8, 17);
//        for (List<Integer> l : lists) {
//            System.out.print("{ ");
//            for (int e : l) {
//                System.out.print(e + " ");
//            }
//            System.out.print("}");
//            System.out.println();
//        }


//        System.out.println();
//        precedence(treeNode);
//        System.out.println();
//        inorder(treeNode);
//        System.out.println();

//        System.out.println("-------多叉树转二叉树-------");
//        XNode xNode5 = new XNode(5);
//        XNode xNode6 = new XNode(6);
//        List<XNode> children = new ArrayList<>();
//        children.add(xNode5);
//        children.add(xNode6);
//        XNode xNode2 = new XNode(2, children);
//        List<XNode> children2 = new ArrayList<>();
//        children2.add(xNode2);
//        children2.add(new XNode(3));
//        children2.add(new XNode(4));
//        XNode xNode = new XNode(1, children2);
//        TreeNode treeNode = encode(xNode);
//        print(treeNode);
//        System.out.println("---反解码为多叉树---");
//        XNode decode = decode(treeNode);
//        System.out.println(decode.value + "子树为：");
//        for (XNode x : decode.children) {
//            if (x.children != null) {
//                System.out.print(x.value + "子树为：");
//                for (XNode c : x.children) {
//                    System.out.print(c.value + " ");
//                }
//            } else {
//                System.out.print(x.value + " ");
//            }
//            System.out.print("; ");
//        }
//        System.out.println();

//        System.out.println("-------折纸问题-------");
//        printPaperFold(3);

//        TreeNode node6 = new TreeNode(6);
//        TreeNode node8 = new TreeNode(8);
//        TreeNode node3 = new TreeNode(3);
//        TreeNode node4 = new TreeNode(4);
//        TreeNode node5 = new TreeNode(5);
//        TreeNode node9 = new TreeNode(9);
//        TreeNode node7 = new TreeNode(7);
//        node6.left = node4;
//        node4.left = node3;
//        node4.right = node5;
//        node6.right = node8;
//        node8.left = node7;
//        node8.right = node9;
//        print(node6);
//        int maxBSTSize = maxBSTSize(node6);
//        System.out.println("最大搜索树节点数为：" + maxBSTSize);
//
//        System.out.println("-----最大路径和-----");
//        int maxPathSum = maxPathSum(node6);
//        System.out.println("最大路径和为：" + maxPathSum);
//        int maxPathSum2 = maxPathSum2(node6);
//        System.out.println("最大路径和为：" + maxPathSum2);

        System.out.println("-----获取公司最大快乐值-----");
        List<Staff> empty = new ArrayList<>();
        Staff s1 = new Staff(8, empty);
        Staff s2 = new Staff(7, empty);
        Staff s3 = new Staff(6, empty);
        Staff s4 = new Staff(9, empty);
        Staff s5 = new Staff(4, empty);
        Staff s6 = new Staff(1, empty);
        Staff s7 = new Staff(7, empty);
        Staff s8 = new Staff(9, empty);

        List<Staff> staffList1 = new ArrayList<>();
        staffList1.add(s1);
        staffList1.add(s2);
        staffList1.add(s3);
        Staff s9 = new Staff(4, staffList1);

        List<Staff> staffList2 = new ArrayList<>();
        staffList2.add(s4);
        staffList2.add(s5);
        Staff s10 = new Staff(5, staffList2);

        List<Staff> staffList3 = new ArrayList<>();
        staffList3.add(s6);
        staffList3.add(s7);
        staffList3.add(s8);
        Staff s11 = new Staff(6, staffList3);

        List<Staff> staffList4 = new ArrayList<>();
        staffList4.add(s9);
        staffList4.add(s10);
        staffList4.add(s11);
        Staff boss = new Staff(3, staffList4);
        int maxHappy = maxHappy(boss);
        System.out.println("最大快乐值为：" + maxHappy);
    }

    public static class TreeNode {
        private final int value;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }
    }

    public static void printTree(TreeNode root) {
        if (root == null) return;
        System.out.println("         " + root.value + "          ");
        printSelfTree(root.left, root.right);
    }

    public static void printSelfTree(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return;
        }
        if (left == null) {
            System.out.print("      " + "null" + "     " + right.value);
            printSelfTree(right.left, right.right);
        } else if (right == null) {
            System.out.println("      " + left.value + "     " + "null");
            printSelfTree(left.left, left.right);
        } else {
            System.out.println("      " + left.value + "     " + right.value);
            printSelfTree(left.left, left.right);
            printSelfTree(right.left, right.right);
        }
    }

    //二叉树按层遍历节点
    public static void print(TreeNode head) {
        if (head == null) return;
        LinkedList<TreeNode> list = new LinkedList<>();
        list.add(head);
        int sep = maxDepth(head) * 4;
//        System.out.println("sep = " + sep);
        while (!list.isEmpty()) {
//            int cur = 1;
            int last = list.size();
//            System.out.println("last = " + last); //1, 2, 4

            for (int i = 0; i < last; i++) {
//                System.out.println("cur = " + cur);
                TreeNode node = list.poll();
                int ix = sep;
                while (ix > 0) {
                    System.out.print(" ");
                    ix--;
                }
                if (node != null) {
                    if (node.value == 0) {
                        System.out.print("null");
                    } else {
                        System.out.print(node.value);
                    }
                    if (node.left != null) {
                        list.add(node.left);
                    } else if (node.value != 0) {
                        list.add(new TreeNode(0));
                    }
                    if (node.right != null) {
                        list.add(node.right);
                    } else if (node.value != 0) {
                        list.add(new TreeNode(0));
                    }
                }
//                int jx = sep;
//                while (jx > 0) {
//                    System.out.print(" ");
//                    jx--;
//                }
            }

//            while (cur <= last) {
//                System.out.println("cur = " + cur);
//                TreeNode node = list.poll();
////                int i = sep;
////                while (i > 0) {
////                    System.out.print(" ");
////                    i--;
////                }
//                if (node != null) {
////                    System.out.println("value = " + node.value);
//                    if (node.left != null) list.add(node.left); //
//                    if (node.right != null) list.add(node.right);
//                }
////                else {
////                    System.out.print("null");
////                }
////                int j = sep;
////                while (j > 0) {
////                    System.out.print(" ");
////                    j--;
////                }
//                cur++;
//            }


            System.out.println();
            sep = sep - 4;
        }
    }

    //先序遍历: 先头，然后左右
    public static void precedence(TreeNode node) {
        if (node == null) return;
        System.out.print(node.value + "");
        precedence(node.left);
        precedence(node.right);
    }

    //非递归实现先序遍历
    public static void preByNonRecur(TreeNode head) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(head);
        while (!stack.isEmpty()) {
            head = stack.pop();
            System.out.print(head.value + "");
            if (head.right != null) {
                stack.push(head.right);
            }
            if (head.left != null) {
                stack.push(head.left);
            }
        }
    }

    //中序遍历：左，头，右
    public static void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.value + "");
        inorder(node.right);
    }

    //非递归实现中序遍历
    //有左压左, 无左弹出，然后再压右
    //先入主head，压左半边，然后弹出主head再压右半边
    public static void inorderByNonRecur(TreeNode head) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(head);
        TreeNode rootLeft = null;
        boolean isFirst = true;
        TreeNode last = null;
        while (!stack.isEmpty()) {
            TreeNode temp = stack.peek(); //先看看当前节点，不出栈
            if (temp.left != null && temp.left != last && temp.left != head && temp.left != rootLeft) {  //有左压左
                stack.push(temp.left);
            } else {
                if (isFirst) {
                    rootLeft = head.left != null ? head.left : null;  //这里还需要多保存一个根节点的左子树，保证回退出栈的时候根节点能正常弹出
                    isFirst = false;
                }
                TreeNode pop = stack.pop();
                System.out.print(pop.value);
                last = pop;
                if (pop.right != null) {
                    stack.push(pop.right);
                    head = pop; //TODO 一旦右树有节点，就把当前节点记录起来，不然下次弹出last会被该右树节点覆盖。这不就是算法的魅力！想了一天多！！
                }
            }
        }
    }

    //非递归实现中序遍历
    //优化版本
    public static void inorderByNonRecur2(TreeNode cur) {
        if (cur != null) {
            Stack<TreeNode> stack = new Stack<>();
            while (!stack.isEmpty() || cur != null) { //这里多加一个cur不为空的判别条件
                if (cur != null) {  //还是一样，左子树不为空就一直入栈
                    stack.push(cur);
                    cur = cur.left; //更新cur
                } else {  //直到左子树为空, 开始弹出
                    TreeNode pop = stack.pop();
                    System.out.print(pop.value);
                    cur = pop.right;  //这个时候cur就来到弹出节点的右子树
                }
            }
        }
    }

    //后序遍历：左，右，头
    public static void subsequent(TreeNode node) {
        if (node == null) return;
        subsequent(node.left);
        subsequent(node.right);
        System.out.print(node.value + "");
    }

    //非递归实现后序遍历
    //一种简单的方法就是，既然我们已经实现了先序遍历，压栈方式是头右左 =》 头左右，
    //那么我们先实现头右左，然后统一压到另一个栈里，等结束了再统一弹出来，不就是左右头的顺序
    public static void subByNonRecur(TreeNode head) {
        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> container = new Stack<>();
        stack.push(head);
        while (!stack.isEmpty()) {
            TreeNode pop = stack.pop();
            container.add(pop);
            if (pop.left != null) {
                stack.push(pop.left);
            }
            if (pop.right != null) {
                stack.push(pop.right);
            }
        }
        //结束之后统一弹出
        while (!container.isEmpty()) {
            TreeNode pop = container.pop();
            System.out.print(pop.value);
        }
    }

    //单个栈实现后序遍历
    //芜湖，感觉思路飞升
    public static void sub2(TreeNode head) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(head);
        while (!stack.isEmpty()) {
            TreeNode peek = stack.peek();
            //每次循环只做push或pop其中一个操作
            if (peek.left != null && peek.left != head && peek.right != head) { //有左加左
                stack.push(peek.left);
            } else if (peek.right != null && peek.right != head) { //有右加右
                stack.push(peek.right);
            } else { //弹出
                TreeNode pop = stack.pop();
                System.out.print(pop.value);
                head = pop; //关键点，把弹出的节点记录起来
            }
        }
    }

    //递归序
    public static void f(TreeNode node) {
        if (node == null) return;
        //1
        f(node.left);
        //2
        f(node.right);
        //3
    }

    //TODO 判断两棵树是否相同
    //这就是递归的魅力！！
    public static boolean isSameTree(TreeNode node1, TreeNode node2) {
        if (node1 == null ^ node2 == null) {
            //通过异或（不同为1）来判断其中一个为null另一个不为null的情况，更简洁
            return false;
        }
        if (node1 == null) {
            return true;
        }
        return node1.value == node2.value
                && isSameTree(node1.left, node2.left)
                && isSameTree(node1.right, node2.right);
    }

    //TODO 判断是否是镜面树
    public static boolean isSymmetricTree(TreeNode root) {
        return isMirror(root, root);
    }

    public static boolean isMirror(TreeNode head1, TreeNode head2) {
        if (head1 == null ^ head2 == null) {
            return false;
        }
        if (head1 == null) {
            return true;
        }
        return head1.value == head2.value
                && isMirror(head1.left, head2.right)
                && isMirror(head1.right, head2.left);
    }

    //TODO 求一棵树的最大深度
    //极致优雅！！
    public static int maxDepth(TreeNode head) {
        if (head == null) return 0; //始终要记得递归就需要设置结束条件
        return Math.max(maxDepth(head.left), maxDepth(head.right)) + 1;
    }

    //TODO 用先序数组和中序数组求出原树
    public static TreeNode buildTree(int[] pre, int[] inorder) {
        if (pre == null || inorder == null) {
            return null;
        }
        return buildSelfTree(pre, 0, pre.length - 1, inorder, 0, inorder.length - 1);
    }

    //每一次用先序数组pre的l1 - r1和中序数组inorder的l2 - r2来确定当前子树，并返回头节点
    public static TreeNode buildSelfTree(int[] pre, int l1, int r1, int[] inorder, int l2, int r2) {
        if (l1 > r1 || l2 > r2) return null; //递归结束条件
        TreeNode head = new TreeNode(pre[l1]); //头节点
        int inoHeadIndex = l2;
        //找到头节点在中序数组中的下标
        while (pre[l1] != inorder[inoHeadIndex]) {
            inoHeadIndex++;
        }
        int interval = inoHeadIndex - l2 - 1;
        int startL1 = l1 + 1;
        int startR1 = startL1 + interval;
        head.left = buildSelfTree(pre, startL1, startR1, inorder, l2, inoHeadIndex - 1);
        head.right = buildSelfTree(pre, startR1 + 1, r1, inorder, inoHeadIndex + 1, r2);
        return head;
    }

    //TODO 判断是否是平衡搜索二叉树
    //平衡二叉树：每一棵子树的左树和右树高度差不超过1
    public static boolean isBalancedBinaryTree(TreeNode node) {
        return process(node).isBalanced;
    }

    public static TreeInfo process(TreeNode root) {
        if (root == null) {
            return new TreeInfo(true, 0);
        }
        TreeInfo leftInfo = process(root.left);
        TreeInfo rightInfo = process(root.right);
        boolean isBalanced = true;
        if (!leftInfo.isBalanced || !rightInfo.isBalanced) {
            isBalanced = false;
        }
        if (Math.abs(leftInfo.height - rightInfo.height) > 1) {
            isBalanced = false;
        }
        int height = Math.max(leftInfo.height, rightInfo.height) + 1;
        return new TreeInfo(isBalanced, height);
    }

    public static class TreeInfo {
        public boolean isBalanced;
        public int height;

        public TreeInfo(boolean isBalanced, int height) {
            this.isBalanced = isBalanced;
            this.height = height;
        }
    }

    //TODO 判断一棵树是否是搜索二叉树
    //搜索二叉树：对于每一棵子树来说，左树都比我小，右树都比我大
    public static boolean isBST(TreeNode root) {
        return BSTProcess(root).isBST;
    }

    public static BSTInfo BSTProcess(TreeNode root) {
        if (root == null) {
            return null; //返回null的话，返回上级时BSTInfo就需要判空
//            return new BSTInfo(true, 0, 0); //这边出问题，max和min都返回0时，那么它的上一级必定会被判false
        }
        BSTInfo leftInfo = BSTProcess(root.left);
        BSTInfo rightInfo = BSTProcess(root.right);

        int max = root.value;
        int min = root.value;
        if (leftInfo != null) {
            //左树不为空，更新信息
            max = Math.max(max, leftInfo.max);
            min = Math.min(min, leftInfo.min);
        }
        if (rightInfo != null) {
            //左树不为空，更新信息
            max = Math.max(max, rightInfo.max);
            min = Math.min(min, rightInfo.min);
        }
        boolean isBST = true;
        if (leftInfo != null && !leftInfo.isBST) {
            isBST = false;
        }
        if (rightInfo != null && !rightInfo.isBST) {
            isBST = false;
        }
        if (leftInfo != null && leftInfo.max >= root.value) {
            isBST = false;
        }
        if (rightInfo != null && rightInfo.min <= root.value) {
            isBST = false;
        }

//        boolean isBST = true;
//        if (!leftInfo.isBST || !rightInfo.isBST) {
//            isBST = false;
//        }
//        if (leftInfo.max >= root.value || rightInfo.min <= root.value) {
//            isBST = false;
//        }
//        int max = Math.max(root.value, Math.max(leftInfo.max, rightInfo.max));
//        int min = Math.min(root.value, Math.min(leftInfo.min, rightInfo.min));
        return new BSTInfo(isBST, max, min);
    }

    public static class BSTInfo {
        public boolean isBST;
        public int max;
        public int min;

        public BSTInfo(boolean isBST, int max, int min) {
            this.isBST = isBST;
            this.max = max;
            this.min = min;
        }
    }

    //TODO 判断是否有符合预期值的路径和
    public static boolean hasSum(TreeNode root, int target) {
        System.out.println("期望值：" + target);
        if (root == null) return false;
        isHasSum = false; //严谨一点，调用入口每次重置
        process(root, 0, target);
        return isHasSum;
    }

    public static boolean isHasSum = false;

    public static void process(@NonNull TreeNode root, int preSum, int targetSum) {
        //判断是否叶节点, 因为只有到叶节点了，才算路径走完, 也是递归结束条件
        //这边其实就是普通递归，只是我们不需要接收结果
        if (root.left == null && root.right == null) {
            if (root.value + preSum == targetSum) {
                isHasSum = true;
            }
            return;
        }
        if (root.left != null) {
            process(root.left, preSum + root.value, targetSum);
        }
        if (root.right != null) {
            process(root.right, preSum + root.value, targetSum);
        }
    }

    //TODO 收集达标路径和
    public static List<List<Integer>> pathSum(TreeNode root, int target) {
        System.out.println("期望值：" + target);
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        processPath(root, 0, target, new ArrayList<>(), ans);
        return ans;
    }

    public static void processPath(TreeNode root, int preSum, int target,
                                   List<Integer> pathList, List<List<Integer>> ans) {
        //方法一
//        if (root.left == null && root.right == null) {
//            if (preSum + root.value == target) {
//                //当前路径符合
//                pathList.add(root.value);
//                ans.add(pathList);
//            }
//            return; //结束条件
//        }
//        pathList.add(root.value);
//        if (root.left != null) {
//            processPath(root.left, preSum + root.value, target, copyList(pathList), ans);
//        }
//        if (root.right != null) {
//            processPath(root.right, preSum + root.value, target, copyList(pathList), ans);
//        }

        //上面的处理方案在每次分发到子节点的时候都new了一个新的List出来，如果节点多的话，对内存很不优化，可以如下优化：
        //方法二
        if (root.left == null && root.right == null) {
            if (preSum + root.value == target) {
                pathList.add(root.value);
                ans.add(copyList(pathList)); //复制符合条件的路径列表
                pathList.remove(pathList.size() - 1); //在return回去之前把当前节点值移除掉，这样一来整个递归过程就只需要这么一个list
            }
            return;
        }
        pathList.add(root.value);
        preSum += root.value;
        if (root.left != null) {
            processPath(root.left, preSum, target, pathList, ans);
        }
        if (root.right != null) {
            processPath(root.right, preSum, target, pathList, ans);
        }
        pathList.remove(pathList.size() - 1); //一样，当下级return回来时，我们返回上级时和自己移除掉
    }

    public static List<Integer> copyList(List<Integer> origin) {
        return new ArrayList<>(origin);
    }

    //TODO 求一颗二叉树最大宽度
    public static int maxWidth(TreeNode head) {
        if (head == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(head);
        //当前层结束节点
        TreeNode curEnd = head;
        //下一层结束节点(也就是说我们需要提前保存下一层的结束节点)
        TreeNode nextEnd = null;
        int maxWidth = 0;
        int count = 0;
        while (!queue.isEmpty()) {
            TreeNode poll = queue.poll();
            if (poll == null) break;
            if (poll.left != null) {
                queue.add(poll.left);
                nextEnd = poll.left;
            }
            if (poll.right != null) {
                queue.add(poll.right);
                nextEnd = poll.right;
            }
            count++;
            //当前层遍历结束
            if (poll == curEnd) {
                maxWidth = Math.max(maxWidth, count);
                count = 0;
                curEnd = nextEnd;
            }
        }
        return maxWidth;
    }

    //TODO 多叉树转二叉树，并能够还原回原多叉树
    //实现思路就是子节点挂在父节点左树（及其右子树右子树...)，其实也就是通过父节点的左树，将整个子树链串起来, 保证子树可寻并唯一
    //编码
    public static TreeNode encode(XNode root) {
        if (root == null) return null;
        TreeNode head = new TreeNode(root.value);
        head.left = en(root.children);
        return head;
    }

    public static TreeNode en(List<XNode> children) {
        if (children == null || children.isEmpty()) return null;
        //取子树中第一个子树作为左节点
        TreeNode leftHead = null;
        TreeNode last = null;
        for (XNode xNode : children) {
            TreeNode child = new TreeNode(xNode.value);
            child.left = en(xNode.children);
            if (leftHead == null) {
                leftHead = child;
            } else {
                last.right = child;
            }
            last = child;
        }
        return leftHead;
    }

    //解码
    public static XNode decode(TreeNode root) {
        if (root == null) return null;
        XNode head = new XNode(root.value);
        head.children = compose(root.left);
        return head;
    }

    public static List<XNode> compose(TreeNode node) {
        if (node == null) return null;
        List<XNode> children = new ArrayList<>();
        while (node != null) {
            XNode child = new XNode(node.value);
            child.children = compose(node.left);
            children.add(child);
            node = node.right;
        }
        return children;
    }

    //多叉树结构
    public static class XNode {
        int value;
        List<XNode> children;

        public XNode(int value) {
            this.value = value;
        }

        public XNode(int value, List<XNode> children) {
            this.value = value;
            this.children = children;
        }

        public void setChildren(List<XNode> children) {
            this.children = children;
        }
    }

    //TODO 折纸问题: 将一个长条纸对折，中间会出现一条凹痕，再对折的话，第一条凹痕上面会出现一条凹痕，下面会出现一条凸痕，
    //即此时折痕为：凹 凹 凸。给定一个输入参数N，代表纸条从下往上连续对折N次，从上往下依次打印折痕。
    //实践可以发现，每次对折折痕会是2的指数型增长，那么再经过联想，可以和二叉树结构对上，例如折三次：
    //             凹
    //     凹               凸
    //凹        凸      凹        凸
    //那么就可以通过二叉树来解了，顺序也就是中序遍历，真的精妙！
    public static void printPaperFold(int times) {
        if (times == 0) return;
        process(times, true);
        System.out.println();
    }

    public static void process(int times, boolean fold) {
        if (times == 0) return;
        times--;
        process(times, true);
        System.out.print(fold ? "凹" : "凸");
        process(times, false);
    }

    //TODO 判断是否是完全二叉树
    //这里先说满二叉树：一棵深度为k且有2的k次方减1个结点的二叉树称为满二叉树。
    //如果对满二叉树的结点进行编号, 约定编号从根结点起, 自上而下, 自左而右。则深度为k的, 有n个结点的二叉树,
    //当且仅当其每一个结点都与深度为k的满二叉树中编号从1至n的结点一一对应时, 称之为完全二叉树。
    //很明显，满二叉树是完全二叉树的一种特殊形态。
    public static boolean isCBT(TreeNode head) {
        //空树的话我们就定义为非完全二叉树
        if (head == null) return false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(head);
        boolean mustLeaf = false;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            assert node != null;
            //发现结构不对，直接返回false
            if (node.left == null && node.right != null) {
                return false;
            }
            if (mustLeaf && node.left != null) {
                return false;
            }
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
            //当子树不满的情况下，做个标记，也意味着后续的节点就不能有子树了，必须为叶节点。
            if (node.left == null || node.right == null) {
                mustLeaf = true;
            }
        }
        return true;
    }

    //TODO 通过递归判断是否是完全二叉树
    //可能成为完全二叉树的情况
    //1.左树满二叉树，右树满二叉树，左树高度等于右树高度
    //2.左树满二叉树，右树满二叉树，左树高度等于右树高度加1
    //3.左树完全二叉树，右树满二叉树，左树高度等于右树高度加1
    //4.左树满二叉树，右树完全二叉树，左树高度等于右树高度
    public static boolean isCBT2(TreeNode head) {
        if (head == null) {
            return true;
        }
        return processCBT(head).isCBT;
    }

    public static CBTInfo processCBT(TreeNode node) {
        if (node == null) {
            return new CBTInfo(true, true, 0);
        }
        CBTInfo leftInfo = processCBT(node.left);
        CBTInfo rightInfo = processCBT(node.right);
        boolean isFull = leftInfo.isFull && rightInfo.isFull && leftInfo.height == rightInfo.height;
        int height = Math.max(leftInfo.height, rightInfo.height) + 1;
        boolean isCBT = false;
        if (leftInfo.isFull && rightInfo.isFull && leftInfo.height == rightInfo.height) {
            isCBT = true;
        }
        if (leftInfo.isFull && rightInfo.isFull && leftInfo.height == rightInfo.height + 1) {
            isCBT = true;
        }
        if (leftInfo.isCBT && rightInfo.isFull && leftInfo.height == rightInfo.height + 1) {
            isCBT = true;
        }
        if (leftInfo.isFull && rightInfo.isCBT && leftInfo.height == rightInfo.height) {
            isCBT = true;
        }
        return new CBTInfo(isFull, isCBT, height);
    }

    public static class CBTInfo {
        boolean isFull;
        boolean isCBT;
        int height;

        public CBTInfo(boolean isFull, boolean isCBT, int height) {
            this.isFull = isFull;
            this.isCBT = isCBT;
            this.height = height;
        }
    }

    //TODO 判断是否是满二叉树
    //一棵深度为k且有2的k次方减1个结点的二叉树称为满二叉树。
    public static boolean isFBT(TreeNode head) {
        if (head == null) return false;
        FBTInfo info = processFBT(head);
        return ((1 << info.depth) - 1) == info.allChildren;
    }

    public static FBTInfo processFBT(TreeNode node) {
        if (node == null) {
            return new FBTInfo(0, 0);
        }
        FBTInfo leftInfo = processFBT(node.left);
        FBTInfo rightInfo = processFBT(node.right);
        int depth = Math.max(leftInfo.depth, rightInfo.depth) + 1;
        int children = leftInfo.allChildren + rightInfo.allChildren + 1;
        return new FBTInfo(depth, children);
    }

    public static class FBTInfo {
        int depth;
        int allChildren;

        public FBTInfo(int depth, int allChildren) {
            this.depth = depth;
            this.allChildren = allChildren;
        }
    }

    //TODO 求一颗二叉树的最大距离
    //通过递归思路拆分，最长的情况为:
    //1.左树最长 2.右树最长 3.左树经过父节点再到右树最长
    public static int maxDistance(TreeNode head) {
        return processDis(head).maxDistance;
    }

    public static class DisInfo {
        int maxDistance; //最长路径
        int height; //当前高度

        public DisInfo(int distance, int height) {
            this.maxDistance = distance;
            this.height = height;
        }
    }

    public static DisInfo processDis(TreeNode node) {
        if (node == null) {
            return new DisInfo(0, 0);
        }
        DisInfo leftInfo = processDis(node.left);
        DisInfo rightInfo = processDis(node.right);
        int d1 = leftInfo.maxDistance;
        int d2 = rightInfo.maxDistance;
        int d3 = leftInfo.height + rightInfo.height + 1;
        int dis = Math.max(Math.max(d1, d2), d3);
        int height = Math.max(leftInfo.height, rightInfo.height) + 1;
        return new DisInfo(dis, height);
    }

    //TODO 在一颗二叉树中找到以某节点为头的数量最大的搜索二叉树, 返回最大值。
    public static int maxBSTSize(TreeNode head) {
        if (head == null) return 0;
        return processBST(head).maxBSTSize;
    }

    public static BSTSizeInfo processBST(TreeNode node) {
        if (node == null) {
//            return new BSTSizeInfo(0, 0, 0);
            //这边直接封装Info返回时不合适的，因为max和min不能以0返回，有可能别的节点为负数，所以返null
            return null;
        }
        BSTSizeInfo leftInfo = processBST(node.left);
        BSTSizeInfo rightInfo = processBST(node.right);
        int max = node.value;
        int min = node.value;
        if (leftInfo != null) {
            max = Math.max(leftInfo.max, max);
            min = Math.min(leftInfo.min, min);
        }
        if (rightInfo != null) {
            max = Math.max(rightInfo.max, max);
            min = Math.min(rightInfo.min, min);
        }
        int p1 = leftInfo == null ? 0 : leftInfo.maxBSTSize;
        int p2 = rightInfo == null ? 0 : rightInfo.maxBSTSize;
        int p3 = 0;
        boolean moreThanLeft = leftInfo == null || (node.value > leftInfo.max);
        boolean lessThanRight = rightInfo == null || (node.value < rightInfo.min);
        boolean isLeftBST = leftInfo == null || leftInfo.isBST;
        boolean isRightBST = rightInfo == null || rightInfo.isBST;
        boolean isBST = false;
        //先判断是否为搜索二叉树，再去更新maxBSTSize
        if (moreThanLeft && lessThanRight && isLeftBST && isRightBST) {
            //这里当左(右)子树为平衡树的时候，其实maxBSTSize的值就是它左右的节点
            p3 = p1 + p2 + 1;
            isBST = true;
        }
        int maxBSTSize = Math.max(Math.max(p1, p2), p3);
        return new BSTSizeInfo(isBST, maxBSTSize, max, min);
    }

    public static class BSTSizeInfo {
        boolean isBST;
        int maxBSTSize;
        int max;
        int min;

        public BSTSizeInfo(boolean isBST, int maxBSTSize, int max, int min) {
            this.isBST = isBST;
            this.maxBSTSize = maxBSTSize;
            this.max = max;
            this.min = min;
        }
    }

    //TODO 二叉树中的最大路径和(LeetCode LCR 051)
    //路径 被定义为一条从树中任意节点出发，沿父节点-子节点连接，达到任意节点的序列。同一个节点在一条路径序列中 至多出现一次。
    //该路径至少包含一个节点，且不一定经过根节点。
    //路径和 是路径中各节点值的总和

    //自解
    public static int maxPathSum(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) {
            return root.value;
        }
        return processSum(root).maxSum;
    }

    public static Info processSum(TreeNode node) {
        if (node == null) {
//            return new Info(0, 0, 0);
            //这里不能直接返回Info，空节点是不能直接参与进来的
            return null;
        }
        Info leftInfo = processSum(node.left);
        Info rightInfo = processSum(node.right);
        int pathSum = node.value;
        int selfSum = node.value;
        if (leftInfo != null) {
            pathSum = Math.max((leftInfo.pathSum + node.value), pathSum);
            selfSum += leftInfo.pathSum;
        }
        if (rightInfo != null) {
            pathSum = Math.max((rightInfo.pathSum + node.value), pathSum);
            selfSum += rightInfo.pathSum;
        }
        int maxSum = Math.max(node.value, Math.max(pathSum, selfSum));
        if (leftInfo != null) {
            maxSum = Math.max(maxSum, leftInfo.maxSum);
        }
        if (rightInfo != null) {
            maxSum = Math.max(maxSum, rightInfo.maxSum);
        }
        return new Info(selfSum, pathSum, maxSum);
    }

    public static class Info {
        int selfSum; //过当前父节点最大路径和值
        int pathSum; //左右两条路径取最值
        int maxSum; //最值

        public Info(int selfSum, int pathSum, int maxSum) {
            this.selfSum = selfSum;
            this.pathSum = pathSum;
            this.maxSum = maxSum;
        }
    }

    //再来看看LeetCode的官方题解
    //一样的思路，通过递归来处理，计算二叉树中的一个节点的最大贡献值。这里引入了最大贡献值这个概念，就是在
    //以该节点为根节点的子树中寻找以该节点为起点的一条路径，使得该路径上的节点值之和最大。
    //空节点的最大贡献值等于0; 非空节点的最大贡献值等于节点值 与其子节点中的 最大贡献值之和（对于叶节点而言，最大贡献值等于节点值）。
    //非空节点时，也就是说需要拿到子节点自己的最大贡献值之和。
    //例如：[-10, 9, 20, null, null, 15, 7]这棵树，叶节点9、15、7 的最大贡献值分别为 9、15、7。
    //得到叶节点的最大贡献值之后，再计算非叶节点的最大贡献值。节点 20 的最大贡献值等于20 + max(15, 7) = 35, 节点-10的
    //最大贡献值等于-10 + max(9, 35), 其中35也就是它的子节点20的最大贡献值, 这样一来，递归思路就清晰了。
    //确实精妙，相比自己的思路...

    //得到每个节点的最大贡献值之后，如何得到二叉树的最大路径和？对于二叉树中的一个节点，该节点的最大路径和取决于
    // 该节点的值与该节点的左右子节点的最大贡献值，如果子节点的最大贡献值为正，则计入该节点的最大路径和，
    // 否则不计入该节点的最大路径和。维护一个全局变量 maxSum 存储最大路径和，在递归过程中更新 maxSum 的值，
    // 最后得到的 maxSum 的值即为二叉树中的最大路径和。

    public static int maxSum = Integer.MIN_VALUE;

    public static int maxPathSum2(TreeNode root) {
        maxGain(root);
        return maxSum;
    }

    //因为这里我们只需要知道子树的最大贡献值，所以就没必要封装Info了
    public static int maxGain(TreeNode node) {
        if (node == null) {
            return 0;
        }

        // 递归计算左右子节点的最大贡献值
        // 只有在最大贡献值大于 0 时，才会选取对应子节点
        int leftGain = Math.max(maxGain(node.left), 0); //3
        int rightGain = Math.max(maxGain(node.right), 0); //3

        // 节点的最大路径和取决于该节点的值与该节点的左右子节点的最大贡献值
        int maxSumPath = node.value + leftGain + rightGain; //2.因为在处理节点最大贡献值的时候，我们已经过滤掉了负值（见3），
        //也就是说这个时候的maxSumPath是包含多种情况的，可能只含左子节点的最大贡献值或右子节点的最大贡献值，或左右子节点包含自己，或只有自己
        //而非只是左右节点包含自己一种情况。
        //精妙！！！

        // 更新答案
        maxSum = Math.max(maxSum, maxSumPath); //TODO 1.这里为什么每次只拿穿过自身节点的累加值来比较？

        // 返回节点的最大贡献值
        return node.value + Math.max(leftGain, rightGain);
    }

    //TODO 求一颗二叉树节点a与节点b的最低公共祖先
    public static TreeNode lowestAncestor(TreeNode head, TreeNode a, TreeNode b) {
        System.out.println("目标节点a: " + a.value + ", " + "目标节点b: " + b.value);
        return processAncestor(head, a, b).ans;
    }

    public static AncestorInfo processAncestor(TreeNode node, TreeNode a, TreeNode b) {
        if (node == null) {
            return new AncestorInfo(false, false, null);
        }
        AncestorInfo leftInfo = processAncestor(node.left, a, b);
        AncestorInfo rightInfo = processAncestor(node.right, a, b);
        boolean isFindA = node == a || leftInfo.isFindA || rightInfo.isFindA;
        boolean isFindB = node == b || leftInfo.isFindB || rightInfo.isFindB;
        TreeNode ans = null;
        if (leftInfo.ans != null) {
            //如果左子树找到了公共祖先，那么往上传即可
            ans = leftInfo.ans;
        } else if (rightInfo.ans != null) {
            //右子树同理
            ans = rightInfo.ans;
        } else if (isFindA && isFindB) {
            //如果左右子树都还没找到公共祖先，而此时已经找到a和b，那么当前节点就是最低的公共祖先
            ans = node;
        }
        return new AncestorInfo(isFindA, isFindB, ans);
    }

    public static class AncestorInfo {
        boolean isFindA;
        boolean isFindB;
        TreeNode ans;

        public AncestorInfo(boolean isFindA, boolean isFindB, TreeNode ans) {
            this.isFindA = isFindA;
            this.isFindB = isFindB;
            this.ans = ans;
        }
    }

    //TODO 一个公司内，一个领导有多个下属（不同领导下属没有交集），每个人有自己对应的快乐值，要求举办一个聚会，邀请员工参加，
    // 让公司来的人总的快乐值最大，其中直系领导和员工只能来一方。
    public static class Staff {
        int happy;
        List<Staff> staffs;

        public Staff(int happy, List<Staff> staffs) {
            this.happy = happy;
            this.staffs = staffs;
        }
    }

    public static int maxHappy(Staff head) {
        StaffInfo info = processStaff(head);
        return Math.max(info.chose, info.noChose);
    }

    public static StaffInfo processStaff(Staff staff) {
        if (staff == null) {
            return new StaffInfo(0, 0);
        }
        //如果自己被选中的话，那就至少有自己的happy值
        int chose = staff.happy;
        //自己没被选中
        int noChose = 0;
        for (Staff s : staff.staffs) {
            StaffInfo info = processStaff(s);
            chose += info.noChose;
//            noChose += info.chose; //这边处理有问题，应当是当自己未被选中时，子节点被选或不被选都可以，取大值
            noChose += Math.max(info.chose, info.noChose);
        }
        return new StaffInfo(chose, noChose);
    }

    public static class StaffInfo {
        int chose; //被邀请
        int noChose; //没有被邀请

        public StaffInfo(int chose, int noChose) {
            this.chose = chose;
            this.noChose = noChose;
        }
    }


}
