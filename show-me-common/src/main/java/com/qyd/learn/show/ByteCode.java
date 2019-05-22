package com.qyd.learn.show;

public class ByteCode {
    public static void main(String[] args) {
        int i1=1;
        int i2=2;
        int sum=sum(i1,i2);
        print("两个数之和："+sum);
    }

    private static int sum(int i1, int i2) {
        return i1+i2;
    }

    private static void print(String s) {
        System.out.println(s);
    }
}
