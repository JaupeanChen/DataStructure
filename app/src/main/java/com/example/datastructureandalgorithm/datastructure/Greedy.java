package com.example.datastructureandalgorithm.datastructure;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * 贪心算法: 所谓贪心算法就是我们通过对局部数据最理想最直接的处理方法(局部最功利的标准)，扩展到全局来达到目的的思路。
 * 但如果能举出一个反例，则就说明我们的贪心算法失败，反之贪心策略有效。
 * 贪心算法最主要的应用就是通过局部数据排序，通过比较器或者大小根堆（优先级队列），来达到贪心的目的。
 */
public class Greedy {

    public static void main(String[] args) {
//        String[] arr = {"a", "ba", "b"};
        String[] arr = {"ba", "b"};
        String s = lowestString(arr);
        System.out.println("字典序最低的字符串为：" + s);
        System.out.println("--------------");
        System.out.println("单字符串正常字典序");
        Arrays.sort(arr, new NormalComparator());
        for (String e : arr) {
            System.out.println(e);
        }
        String stringByGreedy = lowestStringByGreedy(arr);
        System.out.println("贪心解为：" + stringByGreedy);
    }

    //TODO 给定一个由字符串组成的数组，必须把所有的字符串拼接起来，返回所有可能的结果中字典序最小的结果。
    //贪心解: 我们只要保证先把所有字符串按字典序排列好，再拼接出来就是我们要的解
    public static String lowestStringByGreedy(String[] arr) {
        if (arr == null || arr.length == 0) {
            return "";
        }
        Arrays.sort(arr, new MyComparator());
        StringBuilder builder = new StringBuilder();
        for (String s : arr) {
            builder.append(s);
        }
        return builder.toString();
    }

    //这里涉及到我们怎么去比较字符串字典序大小，如果只拿每个字符串去比较的话，很容易举出反例(例如b和ba, 按照单个字符串字典序
    // 排列完拼接结果为b.ba, 但是另一个结果ba.b却才是正确结果)，那么贪心也就失败了。
    //正解应该是两两前后拼接去比较，(a拼b)小于(b拼a), 则可以确定a的字典序小于b，那么整体拼接也就是要证明传递性：
    //a.b <= b.a; b.c <= c.b  =>  a.c <= c.a
    //这里我们将字符看作非零整数，那么abc.d(如果是k进制)，则abc.d = abc * (k^(d的长度)) + d, 也就是先将abc进行移位
    //再相加。由此，我们可以抽出一个函数k^x的长度(k的x长度次方)等于m(x), 那么
    //式1：a.b <= b.a 则可以改写为: a * m(b) + b <= b * m(a) + a
    //式2：b.c <= c.b 则可以改写为: b * m(c) + c <= c * m(b) + b
    //式3(结论)：a.c <= c.a 则可以改写为: a * m(c) + c <= c * m(a) + a

    //将式1转换为：a * m(b) <= b * m(a) + a - b, 这里为什么是移b，因为b本来就是中间值，另一方面就是为了拼出共同项。
    //再两边乘以c: c * a * m(b) <= c * b * m(a) + c * a - c * b

    //将式2转换为：b * m(c) + c - b <= c * m(b)
    //再两边乘以a: a * b * m(c) + a * c - a * b <= a * c * m(b)

    //此时可以发现两个式子含有a * c * m(b)，根据传递性，则可以得出：
    //a * b * m(c) + a * c - a * b <= c * b * m(a) + c * a - c * b
    //两边同时减去a * c可得：a * b * m(c) - a * b <= c * b * m(a) - c * b
    //再同时除以b：a * m(c) - a <= c * m(a) - c
    //进行移位：a * m(c) + c <= c * m(a) + a
    //至此，也就证明了上面的结论。
    public static class MyComparator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            //双字符拼接比较
            return (o1 + o2).compareTo(o2 + o1);
        }
    }

    public static class NormalComparator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            //单字符拼接比较
            return o1.compareTo(o2);
        }
    }

    //暴力解法，把所有的组合都拼接出来
    public static String lowestString(String[] arr) {
        if (arr == null || arr.length == 0) {
            return "";
        }
        TreeSet<String> ans = process(arr);
        System.out.println("共有" + ans.size() + "种拼接方式: ");
        for (String s : ans) {
            System.out.println(s);
        }
        return ans.first();
    }

    public static TreeSet<String> process(String[] arr) {
        TreeSet<String> ans = new TreeSet<>();
        if (arr.length == 0) {
            //TODO 或直接在返回的时候添加
//            ans.add("");
            return ans;
        }
        //抽取一个字符串（字符）作为头字符串
        for (int i = 0; i < arr.length; i++) {
            String first = arr[i];
            //移除first对应的字符串
            String[] nextArr = removeIndexStr(arr, i);
            //再次去获取所有可能
            TreeSet<String> nextAns = process(nextArr); //这里其实就是归并的思想，我们一直细分下去，
            // 直到只剩一个字符去拼接，然后再依次返回，所以我们只需要保证当前第一个字符串依次拼接上返回来的所有字符串结果即可。
            //TODO 这里要处理空nextAns的情况，否则递归到只剩一个数时就无法进去下一步的遍历拼接
            if (nextAns.size() == 0) {
                nextAns.add("");
            }
            //然后进行拼接
            for (String s : nextAns) {
                ans.add(first + s); //TODO 也就是这一步可能进不来
            }
        }
        return ans;
    }

    public static String[] removeIndexStr(String[] arr, int index) {
        int l = arr.length;
        String[] ans = new String[l - 1];
        int j = 0;
        for (int i = 0; i < l; i++) {
            if (i != index) {
                ans[j++] = arr[i];
            }
        }
        return ans;
    }

}
