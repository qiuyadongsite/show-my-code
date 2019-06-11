package com.qyd.learn.show.algorithm.recur;

/**
 * @Auther: qiuyd
 * @Date: 2019/6/11 10:09
 * @Description:汉诺塔
 */
public class HaNota {
    public static void main(String[] args) {
        HaNota haNota=new HaNota();
        haNota.deal(2,"A","B","C");
    }

    private void deal(int i, String a, String b, String c) {
        if(i==1){
            move(i,a,c);
        }else{
            deal(i-1,a,c,b);
            move(i,a,c);
            deal(i-1,b,a,c);

        }
    }

    private void move(int n,String a, String c) {
        System.out.println("第"+n+"个："+a+"---------->"+c);
    }
}
