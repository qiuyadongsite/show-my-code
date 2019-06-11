package com.qyd.learn.show.algorithm.recur;




/**
 * @Auther: qiuyd
 * @Date: 2019/6/11 10:16
 * @Description:欧几里得求最大公约数 x y的最大公约数：y x%y
 */
public class Gcd {
    public static void main(String[] args) {
        int x=99,y=56;
        int max=gcdxy(x,y);
        System.out.println(x+"和"+y+"最大公约数："+max);
    }

    private static int gcdxy(int x, int y) {
        if(x%y==0){
            return y;
        }else{
           return gcdxy(y,x%y);
        }
    }
}
