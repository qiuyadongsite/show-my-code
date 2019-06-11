package com.qyd.learn.show.algorithm.recur;

/**
 * @Auther: qiuyd
 * @Date: 2019/6/11 10:24
 * @Description:
 */
public class CallNFact {
    public static void main(String[] args) {
        int n=5;
        int v=callNFact(n);
        System.out.println(n+"!="+v);
    }

    private static int callNFact(int n) {
        if(n==1){
            return 1;
        }else{
            return n*callNFact(n-1);
        }
    }
}
