package com.example.datastructureandalgorithm.datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeSet;

/**
 * 贪心算法: 所谓贪心算法就是我们通过对局部数据最理想最直接的处理方法(局部最功利的标准)，扩展到全局来达到目的的思路。
 * 但如果能举出一个反例，则就说明我们的贪心算法失败，反之贪心策略有效。
 * 贪心算法最主要的应用就是通过局部数据排序，通过比较器或者大小根堆（优先级队列），来达到贪心的目的。
 */
public class Greedy {

    public static void main(String[] args) {
//        String[] arr = {"a", "ba", "b"};
//        String[] arr = {"ba", "b"};
//        String s = lowestString(arr);
//        System.out.println("字典序最低的字符串为：" + s);
//        System.out.println("--------------");
//        System.out.println("单字符串正常字典序");
//        Arrays.sort(arr, new NormalComparator());
//        for (String e : arr) {
//            System.out.println(e);
//        }
//        String stringByGreedy = lowestStringByGreedy(arr);
//        System.out.println("贪心解为：" + stringByGreedy);

//        System.out.println("-----会议室安排问题-----");
//        Meeting[] source = {new Meeting(1, 3), new Meeting(2, 4), new Meeting(4, 6),
//                new Meeting(3, 4), new Meeting(2, 5), new Meeting(4, 5)};
//        List<Meeting> meetingList = maxMeeting(source);
//        System.out.println("最优安排会议为：");
//        for (Meeting m : meetingList) {
//            System.out.println("[" + m.start + ", " + m.end + "]");
//        }
//        System.out.println("共" + meetingList.size() + "次会议");

//        System.out.println("----暴力尝试1----");
//        List<List<Meeting>> lists = maxMeetingByViolence(source);
//        System.out.println("结果是否为空: " + lists.isEmpty());
//        for (List<Meeting> list : lists) {
//            System.out.println("安排情况：");
//            for (Meeting m : list) {
//                System.out.print("[" + m.start + ", " + m.end + "], ");
//            }
//        }
//        System.out.println("----暴力尝试2----");
//        int count = maxMeetingCountByViolence(source);
//        System.out.println("最大会议数为：" + count);

        System.out.println("-----黄金切割问题-----");
        int[] arr1 = {20, 30, 50};
        int cost = lestCost(arr1);
        System.out.println("最少花费：" + cost);
        int costByViolence = lestCostByViolence(arr1);
        System.out.println("最少花费暴力解：" + costByViolence);
        int[] arr2 = {60, 30, 10, 20, 80};
        int cost2 = lestCost(arr2);
        System.out.println("最少花费：" + cost2);
        int costByViolence2 = lestCostByViolence(arr2);
        System.out.println("最少花费暴力解：" + costByViolence2);
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
        //利用TreeSet特性达到自动字典序排序的效果
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

    //TODO 会议室安排问题
    //有不同时间段的会议，要求安排出最多的会议数
    //通过贪心：1.我们找最早开始的会议来安排（不行，很容易举出反例, 比如【1， 24】全天占满）
    //2.选取时间段最短的会议来安排（也不行，同样容易举出反例，比如有三个会议【1,5】，【4,6】，【5,10】，明显不能选中间）
    //3.选取结束时间早的会议来安排（其实结束的早另一方面也意味着时间段短，正确贪心）
    public static List<Meeting> maxMeeting(Meeting[] source) {
        //先按时间结束早晚排序
        Arrays.sort(source, new TimeComparator());
        List<Meeting> ans = new ArrayList<>();
        int timeLine = 0;
        for (Meeting m : source) {
            if (m.start >= timeLine) {
                ans.add(m);
                //更新timeLine
                timeLine = m.end;
            }
        }
        return ans;
    }

    public static class TimeComparator implements Comparator<Meeting> {

        @Override
        public int compare(Meeting o1, Meeting o2) {
            return o1.end - o2.end;
        }
    }

    public static class Meeting {
        int start;
        int end;

        public Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    //暴力解法，把所有时间排列顺序符合的情况都列出来
    public static List<List<Meeting>> maxMeetingByViolence(Meeting[] source) {
        if (source == null || source.length == 0) {
            System.out.println("length=0");
            return new ArrayList<>();
        }
        return process(source, 0);
    }

    public static List<List<Meeting>> process(Meeting[] source, int timeline) {
        List<List<Meeting>> lists = new ArrayList<>();
        if (source.length == 0) {
//            ans.add(new ArrayList<>());
            return lists;
        }

        //让每个会议轮流当第一个会议
        for (int i = 0; i < source.length; i++) {
//            System.out.println("第" + i + "轮");
            Meeting cur = source[i];
            if (cur.start >= timeline) {
//                System.out.println("当前会议: " + cur.start + "-" + cur.end);
                Meeting[] curSource = removeIndexMeeting(source, i);
                List<List<Meeting>> nextMeetings = process(curSource, cur.end);
                if (nextMeetings.isEmpty()) {
                    List<Meeting> empty = new ArrayList<>();
                    empty.add(new Meeting(0, 0));
                    nextMeetings.add(empty);
                }
                for (List<Meeting> list : nextMeetings) {
                    list.add(0, cur);
                }
            }
        }
        return lists;
    }

    public static int maxMeetingCountByViolence(Meeting[] source) {
        if (source == null || source.length == 0) {
            return 0;
        }
        return processCount(source, 0, 0);
    }

    public static int processCount(Meeting[] source, int timeline, int done) {
        int max = done;
        if (source.length == 0) {
            return max;
        }
        for (int i = 0; i < source.length; i++) {
            if (timeline <= source[i].start) {
                timeline = source[i].end;
                Meeting[] next = removeIndexMeeting(source, i);
                max = Math.max(max, processCount(next, timeline, done + 1));
            }
        }
        return max;
    }

    public static Meeting[] removeIndexMeeting(Meeting[] arr, int index) {
        int l = arr.length;
        Meeting[] ans = new Meeting[l - 1];
        int j = 0;
        for (int i = 0; i < l; i++) {
            if (i != index) {
                ans[j++] = arr[i];
            }
        }
        return ans;
    }

    //解决输入一个数组返回金条切割的最小代价
    //一块金条切成两半，需要花费和长度数值一样的铜板，比如长度为20的金条，切割需要花费20个铜板，一群人想分，怎么分最省铜板？
    //例如给定数组{10, 20, 30}，代表三个人去分长度为60的金条，
    //如果先把长度60的金条分成10和50，那么花费60铜板；然后再把50分成20和30，再花费50个铜板，那么一共花费110铜板
    //但如果先把60分成30和30，那么花费60铜板；然后再把30分成10和20，再花费30个铜板，总共需要花费90个铜板
    //很显然，后者更优
    //尝试之后，我们就可以贪心，每次先切大的，然后再分小的，这样花费最少。其实很容易发现，分出来的结果就是一颗二叉树
    public static int lestCost(int[] arr) {
        int cost = 0;
        //准备一个小根堆，先把数组放进去
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i : arr) {
            queue.add(i);
        }
        //然后两两取出，其实也就是根据结果往回推
        while (queue.size() > 1) {
            int cur = queue.poll() + queue.poll();
            cost += cur;
            queue.add(cur);
        }
        return cost;
    }

    //暴力解
    public static int lestCostByViolence(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        return process(arr, 0);
    }

    //arr: 剩余数组，curCost: 当前花费
    public static int process(int[] arr, int curCost) {
        if (arr.length == 1) {
            return curCost;
        }
        int ans = Integer.MAX_VALUE;
        //通过两个循环把所有的组合情况都尝试出来
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                ans = Math.min(ans, process(mergeArr(arr, i, j), curCost + arr[i] + arr[j]));
            }
        }
        return ans;
    }

    public static int[] mergeArr(int[] arr, int i, int j) {
        int[] back = new int[arr.length - 1];
        back[0] = arr[i] + arr[j];
        int curI = 1;
        for (int index = 0; index < arr.length; index++) {
            if (index != i && index != j) {
                back[curI++] = arr[index];
            }
        }
        return back;
    }

}
