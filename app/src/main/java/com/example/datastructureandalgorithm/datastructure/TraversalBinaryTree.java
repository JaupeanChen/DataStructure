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
        node5.right = new TreeNode(8);
        node5.left = new TreeNode(10);
        print(node1);
        int maxWidth = maxWidth(node1);
        System.out.println("最大宽度为: " + maxWidth);

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

}
