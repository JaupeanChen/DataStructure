package com.example.datastructureandalgorithm.datastructure;

import androidx.annotation.NonNull;

public class MySort {

    public static void main(String[] args) {
        int[] arr = {3, 9, 2, 6, 4, 8};
        printArr(arr);
//        System.out.println("------插入排序-----");
//        insertSort(arr);
//        printArr(arr);

//        System.out.println("------选择排序-----");
//        selectSort(arr);
//        printArr(arr);

//        System.out.println("------冒泡排序-----");
//        bubbleSort(arr);
//        printArr(arr);

        System.out.println("------快速排序-----");
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);

    }

    //插入排序
    //思路就是斗地主的时候，每次抓到新的牌，插到已经排好序的牌里
    public static void insertSort(@NonNull int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            //每轮谁拿去插入前面人家排好序的里面
            int cur = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (cur < arr[j]) {
                    //交换
                    int temp = arr[j];
                    arr[j] = arr[j + 1]; //这里很奇怪，下标用i居然会出问题
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //选择排序
    public static void selectSort(@NonNull int[] arr) {
        //解法一my
        //这个解法就比较呆，每次如果更小的数出现再后面，就需要频繁换位置
//        for (int i = 0; i < arr.length - 1; i++) {
//            //总的循环次数，每轮拿一个数去比，确定当前坑位里的数
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[j] < arr[i]) {
//                    swap(arr, j, i);
//                }
//            }
//        }

        //解法二
        for (int i = 0; i < arr.length - 1; i++) {
            //总的循环次数，每轮拿一个数去比，确定当前坑位里的数
            int curIndex = i; //记录当前最小值所在的坑位
            for (int j = i + 1; j < arr.length; j++) {
                curIndex = arr[j] < arr[curIndex] ? j : curIndex;
            }
            //这里为什么当前轮比较我们存下标就行，因为我们目的是找最小值，所以不用每次比都交换
            //这样更繁琐，我们只需要最后把最小的值抓回来丢到当前坑就行，所以每轮结束，做一次交换即可
            if (curIndex != i) swap(arr, curIndex, i);
        }
    }

    //冒泡排序
    //为什么叫冒泡，就是两两比较，取出较大的数
    public static void bubbleSort(@NonNull int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            //遍历轮数, 每次大的往后排
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    //快排
    public static void quickSort(int[] arr, int left, int right) {
        //需要二分法递归，所以就得限制结束条件
        if (left >= right) return; //TODO 这里条件需要加上大于，不能仅仅是left==right

//        int nextLeft = left;
//        int nextRight = right;
//        int base = arr[left];
//        while (left < right) {
//            if (arr[right] < base) { //TODO 问题出在这里，整个大循环里面的判断还是需要循环来处理，因为left和right都需要单独的递增或递减去和基础值比较
//                //如果right里的值小于基准值，那么就放到左边left的坑里，然后left前进一步，right空着等待填入
//                arr[left] = arr[right];
//                left++;
//            } else {
//                //如果right里的值大于基准值，那么right直接后退一步继续寻找
//                right--;
//            }
//        }
//        arr[left] = base;
//        quickSort(arr, nextLeft, left - 1);
//        quickSort(arr, left + 1, nextRight);

        int pos = partition(arr, left, right);
        quickSort(arr, left, pos - 1);
        quickSort(arr, pos + 1, right);
    }

    public static int partition(int[] arr, int left, int right) {
        int base = arr[left];
        while (left < right) {
            //大前提下, 分别进行left和right的递增/递减比较基准值

            //注意：这边还是得防止出现过界！！
            while (left < right && arr[right] >= base) {
                //如果right边的值大于基准值，那么right直接自减
                right--;
            }
            //否则，赋值到left边
            if (left < right) arr[left] = arr[right];
//            left++;//这一步可以留到循环里做，因为你从右边拿过来的值肯定小于基准值，直接就会自增

            //注意：这边还是得防止出现过界！！
            while (left < right && arr[left] <= base) {
                //如果left边的值小于基准值，那么left直接自增
                left++;
            }
            //否则赋值到right边
            if (left < right) arr[right] = arr[left];
        }
        arr[left] = base;
        return left;
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
