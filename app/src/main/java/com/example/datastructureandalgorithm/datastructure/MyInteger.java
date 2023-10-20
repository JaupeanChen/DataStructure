package com.example.datastructureandalgorithm.datastructure;

public class MyInteger {

    public static void main(String[] args) {
        int a = 8;
        printBinary(a);
        System.out.println();
        int b = Integer.MAX_VALUE;
        printBinary(b);
        System.out.println();

    }

    public static void printBinary(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
    }

}
