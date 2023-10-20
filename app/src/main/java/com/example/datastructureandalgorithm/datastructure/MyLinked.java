package com.example.datastructureandalgorithm.datastructure;

import androidx.annotation.NonNull;

public class MyLinked {

    public static void main(String[] args) {
//        Node node1 = new Node(1);
//        node1.next = new Node(2);
//        node1.next.next = new Node(3);
//        Node node = node1;
//        while (node != null) {
//            System.out.println("当前Node：" + node.value);
//            node = node.next;
//        }
//        System.out.println("-------逆序排列-------");
//
//        Node reverseNode = reverse(node1);
//        while (reverseNode != null) {
//            System.out.println("逆序后当前Node：" + reverseNode.value);
//            reverseNode = reverseNode.next;
//        }

//        System.out.println();
//        System.out.println("-------队列-------");
//        MyQueue<Integer> queue = new MyQueue<>();
//        queue.put(1);
//        queue.put(2);
//        queue.put(3);
//        System.out.println("第一次取出Node");
//        Integer pop = queue.poll();
//        System.out.println("出队Node：" + pop);
//        System.out.println("第二次取出Node");
//        Integer pop2 = queue.poll();
//        System.out.println("出队Node：" + pop2);
//        System.out.println("第三次取出Node");
//        Integer pop3 = queue.poll();
//        System.out.println("出队Node：" + pop3);
//        System.out.println("第四次取出Node");
//        Integer pop4 = queue.poll();
//        System.out.println("出队Node：" + pop4);

//        System.out.println();
//        System.out.println("-------栈-------");
//        MyStack<Integer> stack = new MyStack<>();
//        stack.push(1);
//        stack.push(3);
//        stack.push(5);
//        stack.push(7);
//        Integer out1 = stack.pop();
//        System.out.println("取出：" + out1);
//        Integer out2 = stack.pop();
//        System.out.println("取出：" + out2);
//
//        System.out.println();
//        MyStack<Node> stack1 = new MyStack<>();
//        stack1.push(new Node(2));
//        stack1.push(new Node(4));
//        stack1.push(new Node(6));
//        Node outNode1 = stack1.pop();
//        System.out.println("取出：" + outNode1);
//        Node outNode2 = stack1.pop();
//        System.out.println("取出：" + outNode2);

//        System.out.println();
//        System.out.println("-------双端队列-------");
//        MyDoubleDeque<Integer> doubleDeque = new MyDoubleDeque<>();
//        doubleDeque.pushByHead(5);
//        doubleDeque.pushByHead(3);
//        doubleDeque.pushByHead(1);
//        doubleDeque.pushByTail(7);
//        doubleDeque.pushByTail(9);
//        Integer poll1 = doubleDeque.pollByHead();
//        System.out.println("成功从Head取出元素：" + poll1);
//        Integer poll2 = doubleDeque.pollByHead();
//        System.out.println("成功从Head取出元素：" + poll2);
//        Integer poll3 = doubleDeque.pollByHead();
//        System.out.println("成功从Head取出元素：" + poll3);
//        Integer poll4 = doubleDeque.pollByTail();
//        System.out.println("成功从Tail取出元素：" + poll4);
//        Integer poll5 = doubleDeque.pollByTail();
//        System.out.println("成功从Tail取出元素：" + poll5);
//        Integer poll6 = doubleDeque.pollByTail();
//        System.out.println("成功从Tail取出元素：" + poll6);

//        System.out.println();
//        System.out.println("-------K个节点的组内逆序-------");
//        Node kNode1 = new Node(1);
//        Node kNode2 = new Node(3);
//        Node kNode3 = new Node(5);
//        Node kNode4 = new Node(7);
//        Node kNode5 = new Node(9);
//        Node kNode6 = new Node(11);
//        Node kNode7 = new Node(13);
//        Node kNode8 = new Node(15);
//        kNode1.next = kNode2;
//        kNode2.next = kNode3;
//        kNode3.next = kNode4;
//        kNode4.next = kNode5;
//        kNode5.next = kNode6;
//        kNode6.next = kNode7;
//        kNode7.next = kNode8;
//        System.out.println("-------未处理前-------");
//        Node test = kNode1;
//        while (test != null) {
//            System.out.println("Node：" + test.value);
//            test = test.next;
//        }
//        System.out.println("开始组内逆序处理， k = 3");
//        Node reverseInKGroupHead = reverseInKGroup(kNode1, 3);
//        System.out.println("-------处理后-------");
//        Node test2 = reverseInKGroupHead;
//        while (test2 != null) {
//            System.out.println("Node：" + test2.value);
//            test2 = test2.next;
//        }

//        System.out.println();
//        System.out.println("-------两个链表相加-------");
//        Node node1 = new Node(1);
//        Node node3 = new Node(3);
//        Node node5 = new Node(5);
//        Node node7 = new Node(7);
//        node1.next = node3;
//        node3.next = node5;
//        node5.next = node7;
//        System.out.println("第一条链表: ");
//        Node test = node1;
//        while (test != null) {
//            System.out.println("当前Node：" + test.value);
//            test = test.next;
//        }
//
//        Node node2 = new Node(2);
//        Node node6 = new Node(6);
//        Node node8 = new Node(8);
//        Node node4 = new Node(4);
//        node2.next = node6;
//        node6.next = node8;
//        node8.next = node4;
//        System.out.println("第二条链表: ");
//        Node test2 = node2;
//        while (test2 != null) {
//            System.out.println("当前Node：" + test2.value);
//            test2 = test2.next;
//        }
//
//        System.out.println("执行相加, 结果: ");
//        Node finalTest = addNumbers(node1, node2);
//        while (finalTest != null) {
//            System.out.println("当前Node：" + finalTest.value);
//            finalTest = finalTest.next;
//        }

        System.out.println();
        System.out.println("-------合并两个有序链表-------");
        Node node1 = new Node(1);
        Node node3 = new Node(3);
        Node node5 = new Node(5);
        Node node7 = new Node(7);
        node1.next = node3;
        node3.next = node5;
        node5.next = node7;
        System.out.println("第一条链表: ");
        Node test = node1;
        while (test != null) {
            System.out.println("Node：" + test.value);
            test = test.next;
        }

        Node node2 = new Node(3);
        Node node6 = new Node(6);
        Node node8 = new Node(8);
        node2.next = node6;
        node6.next = node8;
        System.out.println("第二条链表: ");
        Node test2 = node2;
        while (test2 != null) {
            System.out.println("Node：" + test2.value);
            test2 = test2.next;
        }
        System.out.println("合并: ");
        Node mergeNode = mergeLinkedList(node1, node2);
        while (mergeNode != null) {
            System.out.println("Node：" + mergeNode.value);
            mergeNode = mergeNode.next;
        }


    }

    public static Node reverse(@NonNull Node head) {
        int reverseCount = 0;
        Node pre = null;
        Node next;
        while (head != null) {
            next = head.next; //先存下当前head的next，也就是让next这个新的引用指向head.next，以便head移动
            head.next = pre; //把当前head的next指向pre，也就是开始反向了。这也就是为什么第一步要先存next
            //然后pre移动到一下一个节点，也就是当前的head
            pre = head;
            //紧接着head就要移动到下一个节点了，也就是当前存的next
            head = next;
            reverseCount++;

//            Node test = pre;
//            while (test != null) {
//                System.out.println("测试当前Node：" + test.value);
//                test = test.next;
//            }
        }
        System.out.println("循环次数：" + reverseCount);
        return pre;
    }

    private static class Node {
        int value;
        Node next;

        public Node(int v) {
            this.value = v;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    private static class QueueNode<T> {
        T value;
        QueueNode<T> next;

        public QueueNode(T v) {
            this.value = v;
        }

        public void setNext(QueueNode<T> next) {
            this.next = next;
        }
    }

    //用单链表实现队列
    private static class MyQueue<V> {
        private QueueNode<V> head;
        private QueueNode<V> tail;
        private int size;

        public MyQueue() {
            head = null;
            tail = null;
            size = 0;
        }

        public boolean isEmptyQueue() {
            return size == 0;
        }

        public int getQueueSize() {
            return size;
        }

        //入队
        public void put(V v) {
            //这里把要入队列的对象V封装到Node里
            QueueNode<V> cur = new QueueNode<>(v);

//            Node cur = new Node(v);
            if (head == null) {
                //首次入队时
                head = cur;
            } else {
                //队内已有元素
                tail.next = cur;
            }
            tail = cur;
            size++;

//            Node test = head;
//            while (test != null) {
//                System.out.println("加入" + t + ", 测试当前Node：" + test.value);
//                test = test.next;
//            }
        }

        //出队
        //这里返回的时候就不返回node了，丢进来什么就返回什么
        public V poll() {
            if (head != null) {
                QueueNode<V> ans = head;
                head = head.next;
                size--;

                QueueNode<V> test = head;
                if (test == null) System.out.println("本次出队完队列为空!");
                while (test != null) {
                    System.out.println("本次出队完剩余Node：" + test.value);
                    test = test.next;
                }
                return ans.value;
            }
            return null;
        }
    }

    //用单链表实现栈
    private static class MyStack<V> {
        private QueueNode<V> head;
        private int size;

        public MyStack() {
            head = null;
            size = 0;
        }

        //入栈
        public void push(V v) {
            System.out.println("加入：" + v);
            QueueNode<V> cur = new QueueNode<>(v);
            cur.next = head;
            head = cur;
            size++;
            System.out.println("当前栈内元素为：");

            QueueNode<V> test = head;
            while (test != null) {
                System.out.println(" " + test.value);
                test = test.next;
            }
        }

        //出栈
        public V pop() {
            QueueNode<V> temp = head.next;
            QueueNode<V> back = head;
            head = temp;
            size--;

            System.out.println("准备取出：" + back.value);
            System.out.println("当前栈内元素为：");
            QueueNode<V> test = head;
            while (test != null) {
                System.out.println(" " + test.value);
                test = test.next;
            }

            return back.value;
        }

    }

    //用双链表实现双端队列
    private static class MyDoubleDeque<V> {
        private DoubleNode<V> head;
        private DoubleNode<V> tail;
        private int size;

        public MyDoubleDeque() {
            head = null;
            tail = null;
            size = 0;
        }

        public int getSize() {
            return size;
        }

        public void pushByHead(V v) {
            DoubleNode<V> curNode = new DoubleNode<>(v);
            if (head == null) {
                //首次加入元素
                head = curNode;
                tail = curNode;
            } else {
                curNode.next = head;
                head.pre = curNode;
                head = curNode;
            }
            size++;

            System.out.println("从Head加入元素：" + v);
            System.out.println("当前栈内元素为：");
            DoubleNode<V> test = head;
            while (test != null) {
                System.out.println(" " + test.value);
                test = test.next;
            }
        }

        public void pushByTail(V v) {
            DoubleNode<V> curNode = new DoubleNode<>(v);
            if (tail == null) {
                //首次加入元素
                tail = curNode;
                head = curNode;
            } else {
                curNode.pre = tail;
                tail.next = curNode;
                tail = curNode;
            }
            size++;

            System.out.println("从Tail加入元素：" + v);
            System.out.println("当前栈内元素为：");
            DoubleNode<V> test = tail;
            while (test != null) {
                System.out.println(" " + test.value);
                test = test.pre;
            }
        }

        public V pollByHead() {
            if (head == null) return null;
            DoubleNode<V> back = head;
            size--;
            if (head == tail) {
                //只剩最后一个元素
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.pre = null;
            }

            System.out.println("准备从Head取出元素：" + back.value);
            System.out.println("当前栈内元素为：");
            DoubleNode<V> test = head;
            while (test != null) {
                System.out.println(" " + test.value);
                test = test.next;
            }
            return back.value;
        }

        public V pollByTail() {
            if (tail == null) return null;
            DoubleNode<V> back = tail;
            if (tail == head) {
                //只剩最后一个元素
                tail = null;
                head = null;
            } else {
                tail = tail.pre;
                tail.next = null;
            }
            size--;
            System.out.println("准备从Tail取出元素：" + back.value);
            System.out.println("当前栈内元素为：");
            DoubleNode<V> test = tail;
            while (test != null) {
                System.out.println(" " + test.value);
                test = test.pre;
            }
            return back.value;
        }

    }

    //双向链表
    private static class DoubleNode<V> {
        V value;
        DoubleNode<V> pre;
        DoubleNode<V> next;

        public DoubleNode(V v) {
            this.value = v;
        }
    }

    //实现K个节点的组内逆序调整
    //给定头结点和k，每k个节点逆序，不足k个节点则不处理
    public static Node reverseInKGroup(Node head, int k) {
        //第一节的尾节点，反序之后也就是新链表的头节点
        Node newHead;
        Node end = separate(head, k);
        if (end == null) {
            System.out.println("长度不足" + k + "，不分割");
            return head;
        }
        System.out.println("分割，end为：" + end.value);
        newHead = end;
        //先保存当前段的头节点，也就是上一个段的尾节点的next
        Node start = end.next;
        reverse(head, end);

        while (start != null) {
            end = separate(start, k);
            if (end == null) {
                System.out.println("长度不足" + k + "，不分割");
                head.next = start;
                //如果此时当前段不足k个节点了，就跳出循环，返回结果
                break;
            }
            System.out.println("分割，end为：" + end.value);

            Node tmpStart = end.next;
            reverse(start, end);
            //先逆序，逆序完把上一段的尾结点(head)指到当前的头节点
            head.next = end;
            //然后尾结点(head)更新
            head = start;

            //更新下一个段的起始头节点
            start = tmpStart;
        }

        return newHead;
    }

    public static void reverse(Node start, Node end) {
        //先保存end的下个节点，作为结束标志
        end = end.next;
        Node pre = null;
        Node cur = start;
        Node next;
        while (cur != end) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
    }

    //以head为头结点，切分以下k个节点, 若返回null则不足k个节点
    public static Node separate(Node head, int k) {
        while (--k > 0 && head != null) {
            head = head.next;
        }
        return head;
    }

    //实现两个链表相加，然后返回新链表
    //例如：1 -> 3 -> 5, 则为531;
    //     2 -> 4 -> 6, 则为642;
    //相加得1173, 返回链表3 ->7 -> 1 -> 1
    public static Node addNumbers(Node first, Node second) {
        int firstSize = getNodeListSize(first);
//        System.out.println("第一条链表长度：" + firstSize);
        int secondSize = getNodeListSize(second);
//        System.out.println("第二条链表长度：" + secondSize);
        //确定较长的链表和较短的链表
        Node longListNode = firstSize > secondSize ? first : second;
        Node shortListNode = longListNode == first ? second : first;
        Node curL = longListNode;
        Node curS = shortListNode;
        Node lastCurL = curL;
        int allAdded; //两位相加总和
        int canary = 0; //进位标记位
        //先在短链表范围内相加
        while (curS != null) {
            allAdded = curS.value + curL.value + canary;
            canary = allAdded / 10;
            //直接将相加值赋给长链表node, 省得新new出对象
            curL.value = allAdded % 10;
            lastCurL = curL;
            curS = curS.next;
            curL = curL.next;
        }
        //接着再加长链表剩下的节点
        while (curL != null) {
            allAdded = curL.value + canary;
            canary = allAdded / 10;
            //直接将相加值赋给长链表node, 省得新new出对象
            curL.value = allAdded % 10;
            //调到下个节点之前存下当前最后的节点
            lastCurL = curL;
            curL = curL.next;
        }
        if (canary != 0) {
            //处理完了，还有进位，那就补上一个节点
            lastCurL.next = new Node(canary);
        }
        return longListNode;
    }

    public static int getNodeListSize(Node node) {
        int size = 0;
        while (node != null) {
            size++;
            node = node.next;
        }
        return size;
    }

    //实现两个有序链表的合并
    //例如：1 -> 3 -> 5
    //     2 -> 4 -> 6
    //合并为: 1 -> 2 ->3...
    @NonNull
    public static Node mergeLinkedList(@NonNull Node head1, @NonNull Node head2) {
        //先拿到最小的头节点，也就是合并之后的头节点
        Node head = head1.value < head2.value ? head1 : head2;
        //两条链表的起始遍历指针
        Node cur1 = head.next;
        Node cur2 = head == head1 ? head2 : head1;
        //作为新串联的指针
        Node pre = head;
        while (cur1 != null && cur2 != null) {
            if (cur1.value < cur2.value) {
                pre.next = cur1;
                pre = cur1;
                cur1 = cur1.next;
            } else {
                pre.next = cur2;
                pre = cur2;
                cur2 = cur2.next;
            }
        }
        //处理剩余无需比较的尾节点
        if (cur1 != null) pre.next = cur1;
        if (cur2 != null) pre.next = cur2;
        //或：
//        pre.next = cur1 != null? cur1 : cur2;
        return head;
    }

}
