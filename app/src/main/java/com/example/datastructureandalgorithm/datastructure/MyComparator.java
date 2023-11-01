package com.example.datastructureandalgorithm.datastructure;

import static java.util.Arrays.copyOfRange;

import android.os.Build;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MyComparator {

    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) {
//        int[] intArr = {2, 8, 10, 6, 9, 3};
//        System.out.println("排序前: ");
//        printArr(intArr);
//        Arrays.sort(intArr);
//        System.out.println("排序后: ");
//        printArr(intArr);
//
//        Student s1 = new Student(3, 15, "张三");
//        Student s2 = new Student(5, 16, "李四");
//        Student s3 = new Student(1, 13, "赵六");
//        Student s4 = new Student(6, 14, "王五");
//        Student s5 = new Student(2, 17, "阿七");
//        Student[] stuArr = {s1, s2, s3, s4, s5};
//        System.out.println("排序前: ");
//        printStuArr(stuArr);
//        Arrays.sort(stuArr, new StudentComparator());
//        System.out.println("id排序后: ");
//        printStuArr(stuArr);
//        Arrays.sort(stuArr, new AgeComparator());
//        System.out.println("age排序后: ");
//        printStuArr(stuArr);

        //优先级队列
        //优先级队列其实是堆
//        PriorityQueue<Integer> heap = new PriorityQueue<>();
//        PriorityQueue<Integer> heap = new PriorityQueue<>(new BiggerComparator());
//        heap.add(6);
//        heap.add(3);
//        heap.add(9);
//        heap.add(1);
//        heap.add(0);
//        //peek只查询，不弹出
//        System.out.println(heap.peek());
//        while (!heap.isEmpty()) {
//            System.out.println(heap.poll());
//        }

        //String的compare
        //String是字典序的比较:
        //"abc" "bcd" => 长度相同直接按位置ASII码去比
        //"abc" "b" => 先把”b"拿最小ASII码填补成"b00",然后再比
//        System.out.println("-------String比较-------");
//        String s1 = "abc";
//        String s2 = "b";
//        System.out.println("s1 compareTo s2: " + s1.compareTo(s2));

        //给定k个升序链表，合并成一个新的升序链表
        System.out.println("-------合并K个升序链表-------");
        System.out.println("第一条链表");
        Node node1 = new Node(1);
        Node node3 = new Node(3);
        Node node5 = new Node(5);
        Node node7 = new Node(7);
        node1.next = node3;
        node3.next = node5;
        node5.next = node7;
        Node test = node1;
        while (test != null) {
            System.out.println("Node：" + test.value);
            test = test.next;
        }
        System.out.println("第二条链表");
        Node node2 = new Node(2);
        Node node4 = new Node(4);
        Node node6 = new Node(6);
        node2.next = node4;
        node4.next = node6;
        Node test1 = node2;
        while (test1 != null) {
            System.out.println("Node：" + test1.value);
            test1 = test1.next;
        }
        System.out.println("第三条链表");
        Node n1 = new Node(1);
        Node node9 = new Node(9);
        Node node11 = new Node(11);
        n1.next = node9;
        node9.next = node11;
        Node test2 = n1;
        while (test2 != null) {
            System.out.println("Node：" + test2.value);
            test2 = test2.next;
        }
        System.out.println("开始合并");
        Node head = mergeKNodes(node1, node2, n1);
        System.out.println("合并结果: ");
        Node test3 = head;
        while (test3 != null) {
            System.out.println("Node：" + test3.value);
            test3 = test3.next;
        }

    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public static Node mergeKNodes(@NonNull Node n1, @NonNull Node n2, @NonNull Node n3) {
//        PriorityQueue<Node> queue = new PriorityQueue<>(new NodeComparator());
//        queue.add(n1);
//        queue.add(n2);
//        queue.add(n3);
        //方法一
//        Node head;
//        Node temp = queue.poll();
//        if (temp == null) return null;
//        head = temp;
//        Node cur = temp;
//        while (!queue.isEmpty()) {
//            assert temp != null;
//            if (temp.next != null) {
//                queue.add(temp.next);
//            }
//            temp = queue.poll();
//            assert cur != null;
//            cur.next = temp;
//            cur = cur.next;
//        }

        //方法二
//        Node head = queue.poll();
//        if (queue.isEmpty() || head == null) {
//            return null;
//        }
//        Node pre = head;
//        if (pre.next != null) {
//            queue.add(pre.next);
//        }
//        while (!queue.isEmpty()) {
//            Node cur = queue.poll();
//            pre.next = cur;
//            pre = cur;
//            if (cur.next != null) {
//                queue.add(cur.next);
//            }
//        }

        //方法三，不借助PriorityQueue
        Node[] arr = {n1, n2, n3};
        MyPriorityQueue queue = new MyPriorityQueue(arr);

        Node head = queue.poll();
        if (queue.isEmpty() || head == null) {
            return null;
        }
        Node pre = head;
        if (pre.next != null) {
            queue.add(pre.next);
        }
        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            pre.next = cur;
            pre = cur;
            if (cur.next != null) {
                queue.add(cur.next);
            }
        }

        return head;
    }

    //上面的方法其实还是用到了容器，也就导致了空间代价就不为O(1)，
    //优化方向其实也很简单，既然我们可以实现两条链表合并了，那么K条
    //链表让它们两两合并到完成也就行了。继续优化的话就是通过分治合并, 详见MyLinked
//    public static Node mergeKLists(List<Node> list, int l, int r) {
//        if (l >= r) {
//            return null;
//        }
//        // r/2 - l/2 + l = r/2 + l/2 = (r+l)/2
//        int mid = (r + l) >> 1;
//        return
//    }

    //自定义实现优先级队列
    public static class MyPriorityQueue {
        private Node[] arr;
        private int cap;

        public MyPriorityQueue(int cap) {
            arr = new Node[cap];
        }

        public MyPriorityQueue(Node[] arr) {
            this.arr = arr;
            this.cap = arr.length;
            insertSort();
        }

        public void add(Node e) {
            System.out.println("add新元素: " + e.value);
            arr[cap - 1] = e; //这边处理有问题，默认了先poll再add
//            System.out.println("add完数组：");
//            for (Node n : arr) {
//                System.out.println("node: " + (n == null ? "null" : n.value));
//            }
            insertSort();
        }

        public Node poll() {
            System.out.println("poll之前，数组：");
            for (Node n : arr) {
                System.out.println("node: " + (n == null ? "null" : n.value));
            }

            Node node = arr[0];
            Node[] temp = new Node[cap - 1];
//            for (int i = 0; i < cap - 1; i++) {
//                temp[i] = arr[i + 1];
//            }
            System.arraycopy(arr, 1, temp, 0, cap - 1);

//            System.out.println("舍弃poll出去的第一个元素，复制到数组：");
//            for (Node n : temp) {
//                System.out.println("node: " + (n == null ? "null" : n.value));
//            }

            arr = new Node[cap];
//            for (int i = 0; i < temp.length; i++) {
//                arr[i] = temp[i];
//            }
            System.arraycopy(temp, 0, arr, 0, temp.length);

            System.out.println("poll完，得到的新数组：");
            for (Node n : arr) {
                System.out.println("node: " + (n == null ? "null" : n.value));
            }

            return node;
        }

        public boolean isEmpty() {
            return arr[0] == null;
        }

        private void insertSort() {
            for (int i = 1; i < cap; i++) {
                //先做判空
                if (arr[i] == null) continue;
                //每轮谁拿去插入前面人家排好序的里面
                int cur = arr[i].value;
                //跟前面排好的去比
                for (int j = i - 1; j >= 0; j--) {
                    if (arr[j] == null) {
                        //前面为空直接换位
                        Node temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    } else {
                        int now = arr[j].value;
                        if (cur < now) {
                            //换位
                            Node temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }
            }
        }

    }

    public static class NodeComparator implements Comparator<Node> {

        @Override
        public int compare(Node n1, Node n2) {
            return (n1.value - n2.value);
        }
    }


    public static class Node {
        int value;
        Node next;

        public Node(int v) {
            this.value = v;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public static void printArr(@NonNull int[] arr) {
        for (int i : arr) {
            System.out.println(" " + i);
        }
    }

    public static void printStuArr(@NonNull Student[] arr) {
        for (Student i : arr) {
            System.out.println("id: " + i.id + ", age: " + i.age + ", name: " + i.name);
        }
    }

    public static class BiggerComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer i1, Integer i2) {
            if (i1 < i2) {
                return 1;
            } else if (i1 > i2) {
                return -1;
            }
            return 0;
        }
    }


    public static class StudentComparator implements Comparator<Student> {
        //规则:
        //1.返回负数，第一个元素在前
        //2.返回正数，第二个元素在前
        //3.返回零，位置不动
        //其实这个规则也很好理解，我们用正数来带入，第一个整数减去第二个整数,
        //当值为负，说明第一个小于第二个数，理所当前，第一个数排前面，以此类推
        @Override
        public int compare(Student t1, Student t2) {
            //按id值从小到大排序
            if (t1.id < t2.id) {
                return -1;
            } else if (t1.id > t2.id) {
                return 1;
            }
            return 0;
        }
    }

    //同理，可以配置一个年龄比较器
    public static class AgeComparator implements Comparator<Student> {
        //规则:
        //1.返回负数，第一个元素在前
        //2.返回正数，第二个元素在前
        //3.返回零，位置不动
        //其实这个规则也很好理解，我们用正数来带入，第一个整数减去第二个整数,
        //当值为负，说明第一个小于第二个数，理所当前，第一个数排前面，以此类推
        @Override
        public int compare(Student t1, Student t2) {
            //按id值从小到大排序
            if (t1.age < t2.age) {
                return -1;
            } else if (t1.age > t2.age) {
                return 1;
            }
            return 0;
        }
    }

    public static class Student {
        int id;
        int age;
        String name;

        public Student(int id, int age, String name) {
            this.id = id;
            this.age = age;
            this.name = name;
        }
    }
}
