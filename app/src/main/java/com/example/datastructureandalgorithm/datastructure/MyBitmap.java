package com.example.datastructureandalgorithm.datastructure;

/**
 * 位图
 * 相关位运算符：>>, <<, &, |, ^
 * 实现用位图存值，包括存，删，判断
 */
public class MyBitmap {
    int max;
    long[] bits;

    public static void main(String[] args) {
//        MyBitmap bitmap = new MyBitmap(1000);
//        bitmap.add(70);
//        bitmap.add(200);
//
//        printBinary(bitmap.bits[1]);
//        System.out.println();
//        printBinary(bitmap.bits[3]);
//        System.out.println();
//        System.out.println("--------------");
//        boolean contains1 = bitmap.isContains(70);
//        System.out.println("是否包含70: " + contains1);
//        boolean contains2 = bitmap.isContains(200);
//        System.out.println("是否包含200: " + contains2);
//
//        System.out.println("-------删除-------");
//        bitmap.delete(70);
//        bitmap.delete(200);
//
//        printBinary(bitmap.bits[1]);
//        System.out.println();
//        printBinary(bitmap.bits[3]);
//        System.out.println();
//        System.out.println("--------------");
//        boolean contains3 = bitmap.isContains(70);
//        System.out.println("是否包含70: " + contains3);
//        boolean contains4 = bitmap.isContains(200);
//        System.out.println("是否包含200: " + contains4);

        System.out.println("-------位运算实现加法-------");
        int add = MyBitmap.add(15, 33);
        System.out.println("15 + 33 = " + add);
        int add2 = MyBitmap.add(155, 269);
        System.out.println("155 + 269 = " + add2);
        int add3 = MyBitmap.add(18, -269);
        System.out.println("18 + (-269) = " + add3);
        System.out.println("-------位运算实现减法-------");
        int sub1 = MyBitmap.sub(56, 18);
        System.out.println("56 - 18 = " + sub1);
        int sub2 = MyBitmap.sub(1738, 762);
        System.out.println("1738 - 762 = " + sub2);
        System.out.println("-------位运算实现乘法-------");
        int mul1 = MyBitmap.multi(15, 6);
        System.out.println("15 * 6 = " + mul1);
        int mul2 = MyBitmap.multi(238, 156);
        System.out.println("238 * 156 = " + mul2);
        int mul3 = MyBitmap.multi(25, -5);
        System.out.println("25 * (-5) = " + mul3);
        System.out.println("-------位运算实现除法-------");
        System.out.println("-5是否是负数: " + isNeg(-5));
        System.out.println("15是否是负数: " + isNeg(15));
        int div1 = MyBitmap.divide(28, 6);
        System.out.println("28 / 6 = " + div1);
        int div2 = MyBitmap.divide(128, 64);
        System.out.println("128 / 64 = " + div2);
        int div3 = MyBitmap.divide(-128, 4);
        System.out.println("-128 / 4 = " + div3);
        int div4 = MyBitmap.divide(128, -4);
        System.out.println("128 / (-4) = " + div4);
        int div5 = MyBitmap.divide(-12846, -448);
        System.out.println("-12846 / (-448) = " + div5);
        int div6 = MyBitmap.divide(Integer.MIN_VALUE, -1);
        System.out.println(Integer.MIN_VALUE + " / (-1) = " + div6);
    }

    public MyBitmap(int max) {
        //转为位运算也就是二进制运算之后，每一位相差2倍
        //所以每当右移一位，就相当于除以2
        //那么原本long数组的长度应为max/64再+1（因为long是64位，那么扣除边界的情况需要再加1，如当64的时候，一个long只能存0~63）
        //就可以用>>6来替代/64
        bits = new long[(max >> 6 + 1)];
        this.max = max;
    }

    public void add(int element) {
        if (element > max) {
            System.out.println(element + "大于最大值max:" + max + ", 无法存储!");
        } else {
            //先找到自己的坑位：element/64
            //再找到坑内具体的位置: element%64
            //而element%64 相当于 element&64, 转为二进制之后0 111 111正好是63, 也就是说element取完模, 必定是
            //小于64, 那么也就是转为二进制之后剩余的6位就是我们要的值，这时&上0 111 111就可以把高位的去掉，只保留低6位
            //的值，那也就是我们要的值!
            //取到具体的坑位值之后，我们只需要把1左移那么多位，|进去就行了。
            bits[element >> 6] |= 1L << (element & 63);
        }
    }

    public void delete(int element) {
        if (element > max) {
            System.out.println(element + "大于最大值max:" + max + ", 未存储!");
        } else {
            //一样先找到自己的坑位：element/64, 再找到坑内具体的位置: element%64
            bits[element >> 6] &= ~(1L << (element & 63));
        }
    }

    public boolean isContains(int element) {
        //找到坑，判断对应位置上的值是否为1，&1之后不为0则存在
        return (bits[element >> 6] & (1L << (element & 63))) != 0;
    }

    public static void printBinary(long num) {
        for (int i = 63; i >= 0; i--) {
            System.out.print((num & (1L << i)) == 0 ? "0" : "1");
        }
    }

    //位运算实现加法
    public static int add(int num1, int num2) {
        int sum = 0;
        while (num2 != 0) {
            //异或运算等同于无进位相加
            sum = num1 ^ num2;
            //用num2保存进位信息
            //而进位信息怎么得到？不就是两个位上都为1时才进位，
            //那么1和1为1就是与(&)运算了。
            num2 = (num1 & num2) << 1;
            num1 = sum;
        }
        return sum;
    }

    //位运算实现减法
    public static int sub(int num1, int num2) {
        int opp = negate(num2);
        return add(num1, opp);
    }

    //位运算实现乘法
    public static int multi(int num1, int num2) {
        int ans = 0;
        //错误循环条件, 这里应该判断的条件应该是num2一直右移，直到为0计算结束
        //如果取(num2 & 1)来判断，如当次与完为0，就结束了
//        while ((num2 & 1) != 0) {
//            ans = add(ans, num1);
//            num1 <<= 1;
//            num2 >>= 1;
//        }
        while (num2 != 0) {
            if ((num2 & 1) != 0) {
                ans = add(ans, num1);
            }
            num1 <<= 1;
            //这里必须要用无符号右移，兼容负数，否则就死循环了
            num2 >>>= 1;
        }
        return ans;
    }

    //位运算实现除法
    public static int divide(int num1, int num2) {
        //因为需要位移，所以先转为正数
        //这里也引出了一个问题，系统的最小值无法转为绝对值(Integer.MIN_VALUE), 所以我们就得处理
        if (num1 == Integer.MIN_VALUE && num2 == Integer.MIN_VALUE) {
            //都为最小值时，也就是相等，返回1即可
            return 1;
        } else if (num2 == Integer.MIN_VALUE) {
            //当只有除数为最小值，那么肯定就向下取整为0了
            return 0;
        } else if (num1 == Integer.MIN_VALUE) {
            //当只有被除数为最小值
            if (num2 == negate(1)) {
                //如果此时恰巧除数为-1, 那么直接返回最大值即可
                return Integer.MAX_VALUE;
            } else {
                //先将被除数+1，变为可转为绝对值的数进行正常计算
                int temp = add(num1, 1);
                int ans = div(temp, num2);
                //算完再回推，将余值再去除
                int all = multi(ans, num2);
                int dif = sub(num1, all);
                //最后返回两次相加得值就是我们要的值
                return add(ans, div(dif, num2));
            }
        } else {
            //正常情况
            return div(num1, num2);
        }
    }

    public static int div(int num1, int num2) {
        //因为需要位移，所以先转为正数
        //这里也引出了一个问题，系统的最小值无法转为绝对值(Integer.MIN_VALUE), 所以我们就得处理
        int a = isNeg(num1) ? negate(num1) : num1;
        int b = isNeg(num2) ? negate(num2) : num2;
        int ans = 0;
        for (int i = 30; i >= 0; i = sub(i, 1)) {
            if ((a >> i) >= b) {
                ans |= 1 << i;
                a = sub(a, (b << i));
            }
        }
        if ((isNeg(num1) && !isNeg(num2)) || (isNeg(num2) && !isNeg(num1))) {
            ans = negate(ans);
        }
        return ans;
        //也可通过异或来判断返回的正负值，更优雅
//        return isNeg(num1) ^ isNeg(num2) ? negate(ans) : ans;
    }

    //判断是否负数
    public static boolean isNeg(int num) {
        return (num & (1 << 31)) != 0;
    }

    //取反
    public static int negate(int num) {
        return add(~num, 1);
    }

}
