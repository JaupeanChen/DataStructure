package com.example.datastructureandalgorithm.datastructure;

public class MyRandom {

    //从1 - 5随机 到 1 - 7随机
    public static void main(String[] args) {
        int testTimes = 10000;
        int[] counts = new int[6];
        System.out.println("----测试随机函数f1----");
        for (int a = 0; a < testTimes; a++) {
            int ans = f1();
            counts[ans]++;
        }
        for (int a = 0; a < counts.length; a++) {
            System.out.println("读取到第" + a + "位：" + counts[a]);
        }

        System.out.println("----测试01等概率函数f2----");
        counts = new int[2];
        for (int a = 0; a < testTimes; a++) {
            int ans = f2();
            counts[ans]++;
        }
        for (int a = 0; a < counts.length; a++) {
            System.out.println("读取到第" + a + "位：" + counts[a]);
        }

        System.out.println("----测试target函数----");
        counts = new int[8];
        for (int a = 0; a < testTimes; a++) {
            int ans = target();
            counts[ans]++;
        }
        for (int a = 0; a < counts.length; a++) {
            System.out.println("读取到第" + a + "位：" + counts[a]);
        }

        System.out.println("----测试X函数----");
        counts = new int[2];
        for (int a = 0; a < testTimes; a++) {
            int ans = x();
            counts[ans]++;
        }
        for (int a = 0; a < counts.length; a++) {
            System.out.println("读取到第" + a + "位：" + counts[a]);
        }

        System.out.println("----测试targetX函数----");
        counts = new int[2];
        for (int a = 0; a < testTimes; a++) {
            int ans = targetX();
            counts[ans]++;
        }
        for (int a = 0; a < counts.length; a++) {
            System.out.println("读取到第" + a + "位：" + counts[a]);
        }


    }

    //已知：等概率返回1 - 5随机数函数
    public static int f1() {
        return (int) (Math.random() * 5) + 1;
    }

    //将f1()改造成01等概率方法(等概率发生器)
    public static int f2() {
        int back;
        do {
            back = f1();
        } while (back == 3);
        return back < 3 ? 0 : 1;
    }

    //再将f2()改造成目标方法，也就是等概率得到1-7的随机数
    public static int target() {
        //这里巧妙利用二进制
        //0-7刚好对应000-111
        //注：其实这里都是正数，所以二进制的加法就是正常算
//        int a3 = f2() << 2;
//        int a2 = f2() << 1;
//        int a1 = f2();

//        int a3 = 1 << 2;
//        int a2 = 1 << 1;
//        int a1 = 1;
//        System.out.println(a3);
//        System.out.println(a2);
//        System.out.println(a1);
//        System.out.println(a3 + a2);
//        System.out.println(a2 + a1);
//        System.out.println(a3 + a2 + a1);

        //随机出000 - 111，也就是0 - 7
//        int ans = (f2() << 2) + (f2() << 1) + f2();
        int back;
        do {
            back = (f2() << 2) + (f2() << 1) + f2();
        } while (back == 0);

        return back;
    }

    //例二：已知不等概率01随机函数, 求等概率01发生器
    public static int x() {
        return Math.random() < 0.85 ? 0 : 1;
    }

    public static int targetX() {
        //既然x()方法0和1概率不同，那就各取一次，这样概率就一样了
        //比如0 1， 1 0 ，通过调用两次方法取概率乘积，概率则都为0.85 * 0.15
        //这个思路确实很巧妙！
        int ans;
        do {
            ans = x();
        } while (ans == x());
        return ans;
    }

}
